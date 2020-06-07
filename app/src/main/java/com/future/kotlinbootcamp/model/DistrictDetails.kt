package com.future.kotlinbootcamp.model

import com.google.gson.annotations.SerializedName

data class DistrictDetails(
    @SerializedName("districtDetailId")
    var districtDetailId: Int? = null,
    @SerializedName("districtDetailIdName")
    var districtDetailIdName: String? = null,
    @SerializedName("districtCoronaPeople")
    var districtCoronaPeople: Int? = null,
    @SerializedName("districtDetailIdIsActive")
    var districtDetailIdIsActive: Boolean? = false
)