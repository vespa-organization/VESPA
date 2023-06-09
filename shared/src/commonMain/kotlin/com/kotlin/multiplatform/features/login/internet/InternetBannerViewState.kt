package com.kotlin.multiplatform.features.login.internet

import com.kotlin.multiplatform.core.presentation.BaseViewState

sealed class InternetBannerViewState : BaseViewState {
    object Show : InternetBannerViewState()
    object Hide : InternetBannerViewState()
}
