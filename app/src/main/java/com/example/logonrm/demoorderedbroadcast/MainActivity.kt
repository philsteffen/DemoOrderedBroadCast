package com.example.logonrm.demoorderedbroadcast

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var botao:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btEnviar.setOnClickListener{
            sendBroadcast(Intent("MeuOrderedBoadCast"))
        }

        /*
        botao = findViewById(R.id.btEnviar)
        botao.setOnClickListener({
            sendBroadcast(Intent("MeuOrderedBoadCast"))
        })
        */
    }
}
