# Android Ad-Skipper 🤖📱

**Built for skipping YouTube Ads on Mobile without user interaction / Not an Ad Blocker**

---

## 📌 Overview

**Android Ad-Skipper** is a native, lightweight background service powered by the Android Accessibility API (`AccessibilityService`). 

Instead of relying on browser extensions or invasive network filters, this agent interacts directly with Android's system UI hierarchy in real-time. It intercepts skippable ad nodes within the YouTube ecosystem the instant they become available, executing native touch actions so your media playback remains uninterrupted hands-free.

---

## 🎯 Problems Addressed

* **AdBlocker Anti-Features & Crashes:** Traditional ad blockers attempt to block network traffic entirely. YouTube actively counters this by deploying anti-adblock detection scripts, throwing persistent warning popups, or causing browser extensions to crash.
* **Economic & Revenue Friction:** Completely blocking advertisements disrupts the underlying creator economy and platform ecosystem. Skiping ads programmatically respects standard platform mechanics while eliminating manual effort.
* **Mobile Infeasibility:** Desktop-style vision tools and browser extensions fail to run seamlessly across native mobile applications. Manual skipping forces users to constantly grab their phone during workouts, driving, or long-form audio sessions.

---

## 🎯 Advantage

By leveraging native Android `AccessibilityService` event listeners, this background agent monitors window state changes directly at the system level. It drastically reduces the friction of skippable ads, automatically bypassing interruptions without high memory usage, screen scraping overhead, or manual intervention.

---

## ✨ Key Features

* **Direct UI Node Interception:** Scans the active view tree for skip button text and YouTube's native resource IDs (`skip_ad_button`) to trigger precise UI click actions.
* **Lightweight & Battery Efficient:** Event-driven architecture that sleeps when no window content changes occur, preserving battery life and system resources.
* **Bypasses Anti-Adblock Detection:** Operates entirely through legitimate Android system accessibility APIs, avoiding extension-blocking scripts or platform flagging.
* **Standalone Deployment:** Packaged as a single, downloadable `.apk` file—no computer, root access, or USB debugging required for end users.

---

## 🚀 How to Use (For Regular Users)

1. Download the latest `ads_skipper.apk` from the **Releases** tab of this repository.
2. Tap the downloaded file on your phone to install the app.
3. Open **Settings** $\rightarrow$ **Accessibility** (or **Additional Settings > Accessibility**).
4. Tap **Downloaded Apps** (or **Installed Services**), select **My_Application_the_Ad_Skipper**, and toggle it **ON**.
5. Play your videos or audio stories completely hands-free!

---

## 💻 How to Run & Contribute (For Developers)

### Prerequisites
* **Android Studio** (Ladybug / Jellyfish or newer)
* **Kotlin** & **Android SDK** (Min SDK API 24 - Nougat)
* **Git**

### Installation

1. Clone the repository:
   ```bash
   git clone [https://github.com/armanchakraborty/Android-Ad-Skipper.git](https://github.com/armanchakraborty/Android-Ad-Skipper.git)
1. Clone the repository:
   ```bash
   git clone [https://github.com/armanchakraborty/Android-Ad-Skipper.git](https://github.com/armanchakraborty/Android-Ad-Skipper.git)
