package com.nishajain.kotinexamples

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener{
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Delete Wallpaper")
            dialog.setMessage("Do you really want to delete?")
            dialog.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(
                    this,
                    "Hello",
                    Toast.LENGTH_SHORT
                ).show()
                dialog.dismiss()
            })
            dialog.setNegativeButton("No", DialogInterface.OnClickListener{
                    dialog, which ->
                dialog.dismiss()
            })

            dialog.show()
        }
    }
}