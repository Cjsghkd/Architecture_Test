import com.example.architecture_test.configureComposeAndroid

plugins {
    id("alio.android.library")
    id("alio.android.hilt")
}

android {
    configureComposeAndroid(this)

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}