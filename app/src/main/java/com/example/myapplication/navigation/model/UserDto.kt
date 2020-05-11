package com.example.myapplication.navigation.model

import java.sql.Timestamp
import javax.annotation.Nonnull

data class UserDto(var userId : String?=null,
                   var userEmail : String? = null,
                   var userPassword : String?=null,
                   var phoneNumber : Int?=null,
                   var nickname:String?=null,
                   var created_at:Long?=null,
                   var updated_at:Long?=null)


