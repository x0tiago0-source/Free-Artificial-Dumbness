# Free Artificial Dumbness

Free Artificial Dumbness is an Android application designed to help users reduce unwanted exposure to Artificial Dumbness features (Chatbots) integrated into social media apps.

> Repository Status: This documentation describes the complete local Android implementation being prepared for the project. The GitHub repository currently contains the project structure and basic documentation.

## Table of Contents

- [Features](#features)
- [How It Works](#how-it-works)
- [Requirements](#requirements)
- [Installation](#installation)
- [Screenshots](#screenshots)
- [Known Limitations](#known-limitations)
- [Contributing](#contributing)
- [Privacy](#privacy)
- [License](#license)

## Features

The current local implementation provides an independent toggle button for each supported package:

- WhatsApp (`com.whatsapp`): Meta AI search, shortcut and conversation surfaces.
- Instagram (`com.instagram.android`): Meta AI surfaces, direct-message entry points and Support AI.

The application also includes:

- A status dashboard showing the Accessibility Service state.
- Independent per-app toggles.
- A locally stored summary and timestamp for the latest detected block.
- Contextual blocking behaviour for Instagram and WhatsApp.
- A local blocking overlay for general supported matches.
- Heuristic matching using visible text, content descriptions, state descriptions and view IDs.

The implementation does not currently include iOS support, account synchronisation, cloud backup, configurable inspirational messages or a complete historical statistics dashboard.

## How It Works

1. The user enables the Android Accessibility Service from system settings.
2. The service monitors only supported app packages.
3. It analyzes the accessibility tree exposed by the active window.
4. Text and descriptions are compared against the activated rules for that app.
5. When a supported AI surface is detected, the service navigates back.
6. The latest summary of blocks and timestamp are stored locally on the device.

The service does not automate gestures. It uses `GLOBAL_ACTION_BACK` when it is appropriate to use a contextual "back" action and, in other cases, presents the overlay defined in the app configuration.

## Requirements

- Android Studio.
- JDK 17.
- Android SDK with API 34 available.
- Android 10 / API 29 or newer.
- Accessibility Service permission enabled on the test device.
- Compatible social media apps installed for testing on real devices.

The local Gradle configuration uses Kotlin 1.9.24, Android Gradle Plugin 8.4.2, Build SDK 34, Target SDK 34 and Minimum SDK 29.

## Installation

1. Look for the Downloads Section
2. Download the latest .apk
3. Transfer the .apk using Blip / Airdrop to your Mobile/Cell phone if you are on PC.
4. Install the .apk on Android
5. Access Application Settings & Enable Restricted Settings
6. Enable the Application Service in Accessibility Settings
7. Enable the Toggles you wish to test.

The service depends on the accessibility tree provided by third-party applications. Test each rule with the exact versions of those applications you wish to support.

## Screenshots

Screenshots will be added to the `assets/screenshots/` folder after the interface has been tested on a real device. The planned set is as follows:

Home page/control panel with toggle buttons and shortcut to accessibility settings.

## Known Limitations

- Detection is heuristic and depends on the text, descriptions and view structure presented by each target application.
- Third-party applications may change their interfaces without notice, which may require new rules or heuristics.
- Currently, failures in the Accessibility Service have been observed on HyperOS devices. Reports relating to other Android distributions should include complete details about the device and Android version.

## Contributing

Read [CONTRIBUTING.md](CONTRIBUTING.md) before opening an issue or pull request.

## Privacy

Read [docs/PRIVACY_POLICY.md](docs/PRIVACY_POLICY.md). The current implementation prioritizes local use: it has no account system, backend, analytics SDK or network permissions.

## License

The repository license is set out in [LICENSE](LICENSE).
