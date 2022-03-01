package com.nckim.daggerhiltstudy.repository

class FlyCatDataSourceImpl : FlyCatDataSource{
    override var fly: String = "하늘하늘"
        set(value) { field = value }
    override var shouting: String = "미유미유"
        set(value) { field = value}

    override fun toStringProfile(): String {
        return "고양이가 $shouting 울고 $fly 날아간다"
    }
}