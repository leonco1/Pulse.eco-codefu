package com.codefu.pulse_eco.domain.models

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
open class UserActivityLog(
    open val userId: String? = "",
    open val activityName:String="",
    open val date: String? = "",
    open val description: String? = "",
    open val points: Int? = 0
    )