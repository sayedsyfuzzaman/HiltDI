package com.syfuzzaman.hiltdi

import android.util.Log
import javax.inject.Inject

const val TAG = "HILT-DI"

interface UserRepository{
    fun saveUser(email: String, passowrd:String)
}

class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, passowrd:String){
        Log.d(TAG, "User saved in SQL")
//        loggerService.log("User saved in DB")
    }
}
class FirebaseRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, passowrd:String){
        Log.d(TAG, "User saved in Firebase")
//        loggerService.log("User saved in DB")
    }
}