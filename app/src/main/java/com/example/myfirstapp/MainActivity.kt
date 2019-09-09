package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // We are currently working on new_branch branch.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
