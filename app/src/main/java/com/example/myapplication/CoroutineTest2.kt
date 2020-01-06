package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by Namget on 2019.10.04.
 */
class CoroutineTest2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.Main).launch {
            a1()
            a2()
            Log.e("11","a3")
        }
        Log.e("11","a4")

    }

    suspend fun a1() {
        delay(2000)
        Log.e("11","a1")
    }

    suspend fun a2() {
        delay(1000)
        Log.e("11","a2")
    }


}