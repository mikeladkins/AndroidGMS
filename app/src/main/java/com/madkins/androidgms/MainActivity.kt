package com.madkins.androidgms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private val TAG = "MAIN ACTIVITY"

class MainActivity : AppCompatActivity() {
    private lateinit var btnLogin : Button
    private lateinit var btnCreateAccount : Button
    private lateinit var btnManageAccount : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Main Activity onCreate")

        btnLogin = findViewById(R.id.ButtonLogin)
        btnCreateAccount = findViewById(R.id.ButtonCreateAccount)
        btnManageAccount = findViewById(R.id.ButtonManageAccount)

        btnLogin.setOnClickListener{
            val intent = Intent(this, RosterDisplayActivity::class.java)
            startActivity(intent)
        }
    }
}