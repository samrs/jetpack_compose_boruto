package com.example.borutoapp.domain.model

import androidx.annotation.DrawableRes
import com.example.borutoapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: Int,
    val description: Int
) {
    object First: OnBoardingPage(
        image = R.drawable.greetings,
        title = R.string.onboarding_page1_title,
        description = R.string.onboarding_page1_description
    )

    object Second: OnBoardingPage(
        image = R.drawable.explore,
        title = R.string.onboarding_page2_title,
        description = R.string.onboarding_page1_description
    )

    object Third : OnBoardingPage(
        image = R.drawable.power,
        title = R.string.onboarding_page3_title,
        description = R.string.onboarding_page1_description
    )
}
