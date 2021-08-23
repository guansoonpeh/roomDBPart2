package com.example.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.roomdb.data.ProductDAO
import com.example.roomdb.data.ProductDB

class MainActivity : AppCompatActivity() {
    lateinit var dao: ProductDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dao = ProductDB.getInstance(application).productDao

        val btnInsert :Button = findViewById(R.id.btnInsert)
        btnInsert.setOnClickListener(){

        }


        val btnGet :Button = findViewById(R.id.btnGet)
        btnGet.setOnClickListener(){

        }

    }
}