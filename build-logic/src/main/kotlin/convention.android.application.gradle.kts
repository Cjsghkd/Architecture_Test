import com.example.architecture_test.configureComposeAndroid
import com.example.architecture_test.configureKotlinAndroid

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    configureKotlinAndroid(this)
    configureComposeAndroid(this)

    defaultConfig {
        targetSdk = 34
    }
}