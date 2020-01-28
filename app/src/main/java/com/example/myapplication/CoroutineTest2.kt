package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

/**
 * Created by Namget on 2019.10.04.
 */
class CoroutineTest2 : AppCompatActivity() {

    private val supervisorJob = SupervisorJob()
    val uiScope = CoroutineScope(Dispatchers.Main + supervisorJob)
    val ioScope = CoroutineScope(Dispatchers.IO + supervisorJob)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        Log.e("11", "a0")
//        CoroutineScope(Dispatchers.Main).launch {
//            Log.e("11", "a66666")
//            CoroutineScope(Dispatchers.Main).launch {
//                a1()
//            }
//            CoroutineScope(Dispatchers.Main).launch {
//                a2()
//            }
//
//            Log.e("11", "a77777")
//        }
//        Log.e("11", "a8")

        uiScope.launch {
            delay(5000)
            Log.e("11", "a111111")
        }

//        ioScope.launch {
//            delay(10000)
//            Log.e("11", "a111111")
//        }

    }

    suspend fun a1() {
        delay(2000)
        Log.e("11", "a111111")
    }

    suspend fun a2() {
        delay(1000)
        Log.e("11", "a222222")
    }

    fun a3(){
        Log.e("11", "a3 fun")
    }
    fun a4(){
        Log.e("11", "a4 fun")

    }


}