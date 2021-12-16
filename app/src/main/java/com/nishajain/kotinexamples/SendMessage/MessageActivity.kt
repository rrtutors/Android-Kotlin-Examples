package com.nishajain.kotinexamples.SendMessage

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.nishajain.kotinexamples.R

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        val btn = findViewById<Button>(R.id.sendSMS)
        val phoneNo = findViewById<EditText>(R.id.etPhone)
        val message = findViewById<EditText>(R.id.etMessage)
        val permissionRequest = 101

        fun myMessage() {
            val myNumber: String = phoneNo.text.toString().trim()
            val myMsg: String = message.text.toString().trim()
            if (myNumber == "" || myMsg == "") {
                Toast.makeText(this, "Field cannot be empty", Toast.LENGTH_SHORT).show()
            } else {
                if (TextUtils.isDigitsOnly(myNumber)) {
                    val smsManager: SmsManager = SmsManager.getDefault()
                    smsManager.sendTextMessage("+91 " + myNumber, null, myMsg, null, null)
                    Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show()
                    phoneNo.text.clear()
                    message.text.clear()
                } else {
                    Toast.makeText(this, "Please enter the correct number", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }

        btn.setOnClickListener {

            val permissionCheck =
                ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)
            if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
                myMessage()
            } else {
                ActivityCompat.requestPermissions(
                    this, arrayOf(Manifest.permission.SEND_SMS),
                    permissionRequest
                )
            }

        }
    }

}