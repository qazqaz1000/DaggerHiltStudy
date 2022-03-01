package com.nckim.daggerhiltstudy.repository

interface CatDataSource : AnimalDataSource {
    var shouting : String
}