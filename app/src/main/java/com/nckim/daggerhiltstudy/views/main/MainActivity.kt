package com.nckim.daggerhiltstudy.views.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.nckim.daggerhiltstudy.R
import com.nckim.daggerhiltstudy.databinding.ActivityMainBinding
import com.nckim.daggerhiltstudy.repository.AnimalsDataSource
import com.nckim.daggerhiltstudy.repository.CatDataSource
import com.nckim.daggerhiltstudy.repository.DogDataSource
import com.nckim.daggerhiltstudy.repository.FlyCatDataSource
import com.nckim.daggerhiltstudy.views.first.FirstActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var catData : CatDataSource

    @Inject
    lateinit var flyCatData : FlyCatDataSource

    @Inject
    lateinit var dogData : DogDataSource

    @Inject
    lateinit var animalsData : AnimalsDataSource

    lateinit var binding : ActivityMainBinding

    var catShouting = "catData.shouting"
    var flyCatShouting = "flyCatData.shouting"
    var dogShouting = "dogData.shouting"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this

        catShouting = catData.shouting
        flyCatShouting = flyCatData.shouting
        dogShouting = dogData.shouting


        cat.text = flyCatData.shouting + flyCatData.fly
        button.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        })
    }

    fun updateShouting(){
        catData.shouting = cat_edit.text.toString()
        flyCatData.shouting = flycat_edit.text.toString()
        dogData.shouting = dog_edit.text.toString()

        cat.text = catData.toStringProfile()
        flycat.text = flyCatData.toStringProfile()
        dog.text = dogData.toStringProfile()

        animalsData.addAnimal(catData)
        animalsData.addAnimal(flyCatData)
        animalsData.addAnimal(dogData)
        animails.text = animalsData.myAnimalsPrint()
    }
}