package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*


/**
 * Created by Namget on 2019.09.24.
 */

class CoroutineTest : AppCompatActivity() {

    val supervisorJob = SupervisorJob()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
    fun test2(){
        val job = GlobalScope.launch (Dispatchers.Default){
            repeat(10) {
                delay(1000L)
                println("I'm working")
            }
        }
        runBlocking {
            delay(1000L)
            job.join()
        }
    }

    fun test1() {

    }

}
