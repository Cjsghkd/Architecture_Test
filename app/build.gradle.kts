plugins {
    id("convention.android.application")
    id("convention.android.hilt")
    alias(libs.plugins.baselineprofile)
}

dependencies {
//    implementation(project(":feature:main"))
    testImplementation(":feature:main")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext)
    androidTestImplementation(libs.androidx.test.espresso)

    baselineProfile(project(":baselineprofile"))
    implementation(libs.androidx.profileinstaller)
}

baselineProfile {
    automaticGenerationDuringBuild = true
}