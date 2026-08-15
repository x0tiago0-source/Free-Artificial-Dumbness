# Roadmap

This roadmap follows the current application direction. Items are not promises of a release date.

## Current implementation

- Android application in Kotlin.
- Jetpack Compose dashboard.
- Independent toggles for WhatsApp, Instagram, Facebook and X/Twitter.
- Accessibility-based detection rules.
- Context-specific handling for Instagram and WhatsApp.
- Local blocking overlay for general supported matches.
- Local storage of toggle state and the latest block summary.

## Next Android priorities

- Synchronise the complete local implementation with the GitHub repository.
- Test and refine detection rules against current WhatsApp, Instagram, Facebook and X/Twitter releases.
- Investigate and document Accessibility Service crashes observed on HyperOS.
- Add automated tests for rule matching, toggle persistence and block-state updates.
- Improve block statistics beyond the latest-event summary.
- Add a stable, user-facing release build and signed APK process.

## Planned features

- More reliable individual blocking rules for Meta AI, Support AI and Grok surfaces.
- Configurable blocking message or inspirational text.
- Black theme, white theme and follow-system theme options.
- Optional ability to hide unused app toggles.
- Minimalist floating top menu and dynamic bottom navigation.
- Google Account or Apple ID integration only if a privacy-preserving storage design is approved.

## Future platform work

- iOS support in a dedicated future phase.
- Expansion to additional platforms and AI surfaces, such as TikTok AI and Snapchat My AI, after technical feasibility and privacy review.
