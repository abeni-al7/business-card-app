# Business Card

A single-screen digital business card showing a logo, name and title, followed by contact details.

Built while following Google's [Android Basics with Compose](https://developer.android.com/courses/android-basics-compose/course) course (the "Business card app" practice problem).

## Features

- Intro section with the Android logo, name and job title
- Contact section with phone, GitHub handle and email, each with a Material icon
- All text comes from `strings.xml`, so the card is easy to customize

## Built with

- Kotlin, Jetpack Compose, Material 3
- `Column`/`Row` layouts and Material Icons (`Call`, `Share`, `Email`)
- Min SDK 24, target/compile SDK 35

## Run it

1. Open the project folder in Android Studio and let Gradle sync.
2. Run the `app` configuration on an emulator or device (Android 7.0 / API 24 or newer).

Or, with a device or emulator connected:

```sh
./gradlew installDebug
```
