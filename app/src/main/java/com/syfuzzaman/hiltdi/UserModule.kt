package com.syfuzzaman.hiltdi

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    //    @Binds
//    abstract fun bindUserRepository(sqlRepository: SQLRepository): UserRepository

    @Provides
//    @Named("firebase") //qualifiers
    @FirebaseQualifier
    fun provideFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }

    @Provides
    @Named("sql")
    fun provideSQLRepository(): UserRepository {
        return SQLRepository()
    }
}