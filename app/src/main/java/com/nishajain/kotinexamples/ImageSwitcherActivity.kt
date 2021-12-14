package com.nishajain.kotinexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class ImageSwitcherActivity : AppCompatActivity() {
    private val images = intArrayOf(R.drawable.android,
        R.drawable.android1, R.drawable.android2)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_switcher)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.imageSwitcher)
        val right = findViewById<Button>(R.id.rightBtn)
        val left = findViewById<Button>(R.id.leftBtn)


        imgSwitcher?.setFactory({
            val imgView = ImageView(applicationContext)
            imgView.scaleType = ImageView.ScaleType.CENTER_CROP
            imgView
        })

        imgSwitcher?.setImageResource(images[index])

        left.setOnClickListener {
            if(index+2  >= images.size){
                index = index - 1
                imgSwitcher?.setImageResource(images[index])
            }
        }
        right.setOnClickListener {

            if(index+1 < images.size){
                index = index + 1
                imgSwitcher?.setImageResource(images[index])
            }
        }
    }
}