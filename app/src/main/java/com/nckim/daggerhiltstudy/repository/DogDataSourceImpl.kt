package com.nckim.daggerhiltstudy.repository

class DogDataSourceImpl : DogDataSource {
    override var shouting: String = "Bow !"
        set(value) { field = value}

    override fun toStringProfile(): String {
        return "강아지가 $shouting 울고있다"
    }
}