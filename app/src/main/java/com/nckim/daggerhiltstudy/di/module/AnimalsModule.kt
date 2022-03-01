package com.nckim.daggerhiltstudy.di.module

import com.nckim.daggerhiltstudy.repository.AnimalsDataSource
import com.nckim.daggerhiltstudy.repository.CatDataSource
import com.nckim.daggerhiltstudy.repository.CatDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AnimalsModule {
    @Provides
    @Singleton
    fun provideAnimalsDataSource() : AnimalsDataSource{
        return AnimalsDataSource()
    }

}