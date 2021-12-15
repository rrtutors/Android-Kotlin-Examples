package com.nishajain.kotinexamples.RotateAnimationImage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.nishajain.kotinexamples.R

class RotateAnimation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotate_animation)
        val left = findViewById<Button>(R.id.left)
        val right = findViewById<Button>(R.id.right)
        val image = findViewById<ImageView>(R.id.image1)


        right.setOnClickListener {
            image.animate().apply {
                duration = 2000
                rotationYBy(360f)
                rotationY(360f)
            }.start()
        }
        left.setOnClickListener{
            image.animate().apply {
                duration = 2000
                rotationYBy(-360f)
                rotationY(-360f)
            }.start()
        }

    }
}