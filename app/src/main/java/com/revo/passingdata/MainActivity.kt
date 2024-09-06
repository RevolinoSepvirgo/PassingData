package com.revo.passingdata

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var etusername : EditText
    private lateinit var  etpassword: EditText
    private  lateinit var  btnlogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etusername = findViewById(R.id.etusername)
        etpassword = findViewById(R.id.etpassword)
        btnlogin = findViewById(R.id.btnlogin)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnlogin.setOnClickListener() {
            var intent = Intent(this@MainActivity, page2::class.java)
            val nUsername = etusername.text.toString()
            val nPassword = etpassword.text.toString()
            intent.putExtra("username", nUsername)
            intent.putExtra("password", nPassword)




            Log.d("username nya : ", nUsername)
            Log.d("Password nya : ", nUsername)
            startActivity(intent)


        }
    }
}