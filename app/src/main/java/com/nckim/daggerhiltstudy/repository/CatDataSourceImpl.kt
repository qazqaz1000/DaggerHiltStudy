package com.nckim.daggerhiltstudy.repository

class CatDataSourceImpl : CatDataSource {
    override var shouting: String = "MEOW~~~!"
        set(value) { field = value}

    override fun toStringProfile(): String {
        return "고양이가 $shouting 운다"
    }
}