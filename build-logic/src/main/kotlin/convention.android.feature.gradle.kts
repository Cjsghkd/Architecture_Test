import com.example.architecture_test.configureComposeAndroid
import gradle.kotlin.dsl.accessors._cb41af676f88d94563fb18deaa5153de.android

plugins {
    id("convention.android.library")
    id("convention.android.hilt")
    kotlin("plugin.compose")
}

android {
    configureComposeAndroid(this)
}