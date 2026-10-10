## KAPT Plugin (Step 13)

The lab guide asked me to add `id("kotlin-kapt")` to `build.gradle.kts (Module :app)`. Gradle failed with:

> The 'org.jetbrains.kotlin.kapt' plugin is not compatible with built-in Kotlin support.

This happened because my version of Android Studio uses the newer built-in Kotlin setup, while the lab guide was written for an older setup.

I removed `id("kotlin-kapt")` and kept:

- `dataBinding = true`
- `viewBinding = true`

I did not use the suggested workaround (`android.builtInKotlin=false`) because it would disable newer Gradle features.

After removing KAPT, Gradle synced successfully and Data Binding worked correctly: `ActivityMainBinding` was generated, the `tenant` variable worked, and the screen updated when SAVE was clicked. I tested this on the Pixel 6 emulator.
