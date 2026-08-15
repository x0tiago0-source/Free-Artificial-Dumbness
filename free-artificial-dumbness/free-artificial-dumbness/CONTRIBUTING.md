# Contributing to Free Artificial Dumbness

Thank you for helping improve Free Artificial Dumbness. Contributions should keep the application local-first, transparent and focused on giving users control over unwanted AI surfaces in supported social-media apps.

## Before you start

- Read the relevant documentation in `docs/`.
- Use Android Studio with JDK 17.
- Build the project before making changes.
- Test Accessibility Service changes on a real Android device whenever possible.
- Do not commit tokens, keystores, passwords, local configuration or private logs.

## Reporting a bug

Use the [bug report template](.github/ISSUE_TEMPLATE/bug_report.md). Include:

- Device manufacturer and model.
- Android version.
- HyperOS version, if applicable.
- Application version and build variant.
- Target social-media app and its version.
- Relevant Free Artificial Dumbness toggle.
- Exact steps to reproduce the behaviour.
- Expected and observed results.
- Screenshots or redacted logs when they do not contain private information.

Accessibility Service crashes are currently a known issue on HyperOS. Reports from other devices are still valuable because they help determine whether the same failure occurs outside HyperOS.

## Suggesting a feature

Use the [feature request template](.github/ISSUE_TEMPLATE/feature_request.md). Explain the target app or surface, the problem for the user, the expected behaviour and how the feature should interact with the independent per-app toggle model.

## Development workflow

1. Fork the repository or create a feature branch.
2. Keep each change focused on one problem or feature.
3. Update the relevant documentation when behaviour or permissions change.
4. Build the debug variant.
5. Run the available unit and instrumentation tests.
6. Test the Accessibility Service on a real device for changes that inspect or act on accessibility nodes.
7. Open a pull request with a clear description and testing notes.

## Code style

- Follow the existing Kotlin formatting and Android Studio inspections.
- Keep UI code in Jetpack Compose components where the existing architecture uses Compose.
- Keep persistent state access in `FocusPreferencesRepository` rather than writing DataStore operations throughout the UI.
- Keep detection rules explicit and scoped to the relevant package.
- Avoid collecting or transmitting user content.
- Add comments when a heuristic exists to handle a specific third-party UI behaviour.

## Pull requests

A pull request should include:

- A concise summary of the change.
- The affected app package(s) or Android component(s).
- Testing performed and devices used.
- Any changes to permissions, privacy behaviour or user-visible copy.
- Screenshots for meaningful UI changes.

Do not include generated build directories, APK signing material or credentials.

## Commit messages

Use short, imperative messages that describe the change, for example:

- `Add Instagram Support AI detection rule`
- `Fix overlay dismissal after blocked match`
- `Document local privacy behaviour`
