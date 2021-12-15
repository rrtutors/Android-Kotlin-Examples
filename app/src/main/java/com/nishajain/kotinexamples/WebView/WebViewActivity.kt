package com.nishajain.kotinexamples.WebView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import com.nishajain.kotinexamples.R

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val webview = findViewById<WebView>(R.id.webView)
        val show = findViewById<Button>(R.id.show)

        // Load Html content as a string

//        val htmlData: String =  "<html><body><h1>Hello, Developers!</h1></body></html>"
//        val mimeType: String = "text/html"
//        val utfType: String = "UTF-8"
//        webview.loadData(htmlData,mimeType,utfType)


        // Load url data
        val url = "https://rrtutors.com/"
        show.setOnClickListener{
            webview.loadUrl(url)
        }

    }
}