package com.nishajain.kotinexamples.ToggleButton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import com.nishajain.kotinexamples.R

class ToggleButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)
        val switch = findViewById<Switch>(R.id.switchbtn)
        switch.setOnClickListener{
            if (switch.isChecked()) {
                Toast.makeText(this, "Switch ON", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "Switch OFF", Toast.LENGTH_SHORT).show();
            }
        }
    }
}