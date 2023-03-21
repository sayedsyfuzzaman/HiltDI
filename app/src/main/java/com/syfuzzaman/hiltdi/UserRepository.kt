package com.syfuzzaman.hiltdi

import android.util.Log
import javax.inject.Inject

const val TAG = "HILT-DI"

class UserRepository @Inject constructor(val loggerService: LoggerService){
    fun saveUser(email: String, passowrd:String){
//        Log.d(TAG, "User saved in DB")
        loggerService.log("User saved in DB")
    }

}