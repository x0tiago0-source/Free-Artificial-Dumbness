# Free Artificial Dumbness

Free Artificial Dumbness is an Android application designed to help users reduce unwanted exposure to artificial-intelligence features embedded in social-media apps. It lets the user enable or disable blocking independently for each supported app.

> Repository status: this documentation describes the complete local Android implementation being prepared for the project. The GitHub repository currently contains the initial structural placeholder, so the application source must be synchronized before the remote project is expected to build and behave exactly as described here.

## Table of contents

- [Features](#features)
- [How it works](#how-it-works)
- [Requirements](#requirements)
- [Installation](#installation)
- [Screenshots](#screenshots)
- [Known limitations](#known-limitations)
- [Contributing](#contributing)
- [Privacy](#privacy)
- [License](#license)

## Features

The current local implementation provides one independent toggle for each supported package:

- WhatsApp (`com.whatsapp`): Meta AI search, shortcut and conversation surfaces.
- Instagram (`com.instagram.android`): Meta AI surfaces, direct-message entry points and Support AI.
- X/Twitter (`com.twitter.android`): Grok-related entry points.
- Facebook (`com.facebook.katana`): Meta AI entry points in supported surfaces.

The application also includes:

- A status dashboard showing the Accessibility Service state.
- Independent per-app toggles.
- A locally stored summary and timestamp for the latest detected block.
- Contextual blocking behaviour for Instagram and WhatsApp.
- A local blocking overlay for general supported matches.
- Heuristic matching using visible text, content descriptions, state descriptions and view IDs.

The implementation does not currently include iOS support, account synchronisation, cloud backup, configurable inspirational messages or a complete historical statistics dashboard.

## How it works

1. The user enables the Android Accessibility Service from system settings.
2. The service listens only to the supported app packages.
3. It inspects the accessibility tree exposed by the active window.
4. Text and descriptions are compared with the rules enabled for that app.
5. When a supported AI surface is detected, the service either navigates back or shows a blocking overlay, depending on the interaction context.
6. The latest block summary and timestamp are stored locally on the device.

The service does not automate gestures. It uses `GLOBAL_ACTION_BACK` where a contextual back action is appropriate and otherwise displays the overlay defined in `app/src/main/res/layout/blocking_overlay.xml`.

## Requirements

- Android Studio.
- JDK 17.
- Android SDK with API 34 available.
- Android 10 / API 29 or newer.
- The Accessibility Service permission enabled on the test device.
- The supported social-media applications installed for real-device testing.

The local Gradle configuration uses Kotlin 1.9.24, Android Gradle Plugin 8.4.2, compile SDK 34, target SDK 34 and minimum SDK 29.

## Installation

1. Clone the repository.
2. Open the Android project in Android Studio.
3. Allow Gradle to synchronise the project.
4. Connect an Android device or start an emulator running API 29 or newer.
5. Build and install the debug variant.
6. Open Free Artificial Dumbness and press **Activate accessibility**.
7. Enable the service in Android Accessibility settings.
8. Enable only the app toggles that you want to test.

The service depends on the accessibility tree exposed by third-party applications. Test each rule against the exact versions of those applications that you intend to support.

## Screenshots

Screenshots will be added to `assets/screenshots/` after the interface is tested on a real device. The planned set is:

1. Home/dashboard with the service status.
2. Independent app toggles.
3. Blocking overlay.

## Known limitations

- Detection is heuristic and depends on text, descriptions and view structure exposed by each target application.
- Third-party applications can change their interfaces without notice, which may require new rules or heuristics.
- Accessibility Service crashes have currently been observed on HyperOS devices. Reports from other Android distributions should include complete device and OS details so they can be investigated separately.
- The repository source and the complete local implementation still need to be synchronised.

## Contributing

Read [CONTRIBUTING.md](CONTRIBUTING.md) before opening an issue or pull request.

## Privacy

Read [docs/PRIVACY_POLICY.md](docs/PRIVACY_POLICY.md). The current implementation is local-first: it has no account system, backend, analytics SDK or network permission.

## License

The repository license is defined in [LICENSE](LICENSE).
