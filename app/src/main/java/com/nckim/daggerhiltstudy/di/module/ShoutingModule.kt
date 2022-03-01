package com.nckim.daggerhiltstudy.di.module

import com.nckim.daggerhiltstudy.repository.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class ShoutingModule {
    @Provides
    @ActivityScoped
    fun provideCatShouting() : CatDataSource {
        return CatDataSourceImpl()
    }

    @Provides
    @ActivityScoped
    fun provideFlyCat() : FlyCatDataSource{
        return FlyCatDataSourceImpl()
    }

    @Provides
    @ActivityScoped
    fun provideDogShouting(): DogDataSource{
        return DogDataSourceImpl()
    }
}