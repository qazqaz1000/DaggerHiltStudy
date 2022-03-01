package com.nckim.daggerhiltstudy.views.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nckim.daggerhiltstudy.R
import com.nckim.daggerhiltstudy.repository.AnimalsDataSource
import com.nckim.daggerhiltstudy.repository.CatDataSource
import com.nckim.daggerhiltstudy.repository.DogDataSource
import com.nckim.daggerhiltstudy.repository.FlyCatDataSource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_first.*
import javax.inject.Inject

@AndroidEntryPoint
class FirstActivity : AppCompatActivity() {
    @Inject
    lateinit var catData : CatDataSource

    @Inject
    lateinit var flyCatData : FlyCatDataSource

    @Inject
    lateinit var dogData : DogDataSource

    @Inject
    lateinit var animalsData : AnimalsDataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        textview.text = "activity scoped ${flyCatData.toStringProfile()} ....\n" +
                "${animalsData.myAnimalsPrint()}"
    }
}