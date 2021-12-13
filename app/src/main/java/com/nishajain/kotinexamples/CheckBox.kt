package com.nishajain.kotinexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class CheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
        val checkbox = findViewById<CheckBox>(R.id.cb)

        checkbox.setOnClickListener{
            if (checkbox.isChecked){
                Toast.makeText(this, "Its Morning", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Not Morning", Toast.LENGTH_SHORT).show();
            }
        }
    }
}