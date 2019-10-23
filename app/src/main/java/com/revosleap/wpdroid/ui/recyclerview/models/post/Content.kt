package com.revosleap.wpdroid.ui.recyclerview.models.post


import com.google.gson.annotations.SerializedName

data class Content(
    @SerializedName("protected")
    var `protected`: Boolean,
    @SerializedName("rendered")
    var rendered: String
)