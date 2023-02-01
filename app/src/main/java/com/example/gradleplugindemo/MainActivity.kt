package com.example.gradleplugindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.apache.commons.lang3.StringUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val str = ""
        StringUtils.isBlank(str)
    }
}