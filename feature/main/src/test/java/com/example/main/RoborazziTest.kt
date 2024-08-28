package com.example.main

import androidx.compose.material3.Text
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@RunWith(RobolectricTestRunner::class)
class RoborazziTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun roborazziTest() {
        composeRule.setContent {
            Test(name = "Roborazzi")
        }

        composeRule
            .onNode(hasText("Hello Roborazzi!"))
            .captureRoboImage()

        composeRule
            .onRoot()
            .captureRoboImage()
    }
}