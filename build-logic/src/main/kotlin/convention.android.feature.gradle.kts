import com.example.architecture_test.configureComposeAndroid

plugins {
    id("convention.android.library")
    id("convention.android.hilt")
}

android {
    configureComposeAndroid(this)
}