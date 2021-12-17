package com.nishajain.kotinexamples.ContextMenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.nishajain.kotinexamples.R

class ContextActivity : AppCompatActivity() {

    lateinit var linearLayout: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)
        val pressMe = findViewById<TextView>(R.id.pressMe)
        linearLayout  = findViewById(R.id.linearLayout)
        registerForContextMenu(pressMe)

    }
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_items, menu)
    }


    override fun onContextItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when(id){
            R.id.green ->{
                linearLayout.setBackgroundColor(Color.GREEN)
                return true
            }
            R.id.yellow ->{
                linearLayout.setBackgroundColor(Color.YELLOW)
                return true
            }
            R.id.gray ->{
                linearLayout.setBackgroundColor(Color.GRAY)
                return true
            }
            else -> return super.onContextItemSelected(item)

        }
    }
}