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
- [Privacy & Data](#privacy--data)
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

The application uses Android's Accessibility Service to monitor and control AI surfaces:

1. The user enables the Accessibility Service from system settings.
2. The service monitors only supported app packages (WhatsApp, Instagram, Facebook, Twitter).
3. It analyzes the accessibility tree exposed by the active window.
4. Text and descriptions are compared against the activated rules for that app.
5. When a supported AI surface is detected, the service navigates back.
6. The latest summary of blocks and timestamp are stored locally on the device.

For technical details about how accessibility content is processed and data handling, see [Privacy Policy](docs/PRIVACY_POLICY.md).

The service does not automate gestures. It uses `GLOBAL_ACTION_BACK` when appropriate or presents a local blocking overlay as configured.

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

Contributions should keep the application local-first, transparent and focused on giving users control over unwanted AI surfaces.

## Privacy & Data

The current implementation prioritizes local use: it has no account system, backend, analytics SDK or network permissions.

For complete information about data handling and privacy:
- See [Privacy Policy](docs/PRIVACY_POLICY.md) for technical details.
- See [Contributing Guidelines](CONTRIBUTING.md) for data handling requirements when contributing.

## License

This project is licensed under the GNU General Public License v3.0 or later.

- Full license terms: [LICENSE.md](LICENSE.md)
- Contributing to the project implies acceptance of the [GPL-3.0 license](https://www.gnu.org/licenses/gpl-3.0.html)
- See also: [Understanding GPL](https://www.gnu.org/licenses/gpl-faq.en.html)
