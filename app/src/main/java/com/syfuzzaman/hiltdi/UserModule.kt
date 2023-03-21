package com.syfuzzaman.hiltdi

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
class UserModule {
    @Provides
    fun provideUserRepository():UserRepository{
        return FirebaseRepository()
    }
//
//    @Provides
//    fun pUR():UserRepository{
//        return SQLRepository()
//    }
}