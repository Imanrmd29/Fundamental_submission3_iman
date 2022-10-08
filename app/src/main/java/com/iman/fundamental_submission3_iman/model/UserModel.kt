package com.iman.fundamental_submission3_iman.model

import com.google.gson.annotations.SerializedName

data class  UserModel(
    @field:SerializedName("items")
    val items : ArrayList<User>


)