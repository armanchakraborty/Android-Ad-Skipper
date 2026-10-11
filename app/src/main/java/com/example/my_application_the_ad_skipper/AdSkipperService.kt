package com.example.my_application_the_ad_skipper

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo

class AdSkipperService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        val rootNode = rootInActiveWindow ?: return

        // 1. Search for skip buttons using common text
        val skipKeywords = listOf("Skip", "Skip Ad", "Skip Ads", "Skip ad")

        for (keyword in skipKeywords) {
            val nodes = rootNode.findAccessibilityNodeInfosByText(keyword)
            if (!nodes.isNullOrEmpty()) {
                for (node in nodes) {
                    if (clickNodeOrParent(node)) {
                        node.recycle()
                        rootNode.recycle()
                        return
                    }
                }
            }
        }

        // 2. Fallback check for YouTube's native resource IDs
        val resourceIds = listOf(
            "com.google.android.youtube:id/skip_ad_button",
            "com.google.android.youtube:id/ad_skip_button"
        )

        for (resId in resourceIds) {
            val nodes = rootNode.findAccessibilityNodeInfosByViewId(resId)
            if (!nodes.isNullOrEmpty()) {
                for (node in nodes) {
                    if (clickNodeOrParent(node)) {
                        node.recycle()
                        rootNode.recycle()
                        return
                    }
                }
            }
        }
        rootNode.recycle()
    }

    private fun clickNodeOrParent(node: AccessibilityNodeInfo?): Boolean {
        var current = node
        while (current != null) {
            if (current.isClickable) {
                current.performAction(AccessibilityNodeInfo.ACTION_CLICK)
                return true
            }
            current = current.parent
        }
        return false
    }

    override fun onInterrupt() {}
}