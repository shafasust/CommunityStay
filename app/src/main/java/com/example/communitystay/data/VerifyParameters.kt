package com.example.communitystay.data

import android.adservices.appsetid.AppSetId

data class VerifyParameters(
    val appId: String,
    val password: String,
    var referenceNo: String,
    var otp: String
)
