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
        launchTest()
    }


    // bridging blocking and non-blocking worlds
    // delay == Thread.sleep()
    fun main() {
        GlobalScope.launch {
            delay(1000L)
            println("world")
        }
        println("Hello,")
        // block main thread
//        Thread.sleep(2000)

        runBlocking {
            delay(2000L)
        }
    }

    fun launchTest() {
        val scope = CoroutineScope(Dispatchers.Main)
        val job = scope.launch {
            repeat(5) {
                delay(1000L)
                println("m1 coroutine $it")
            }
            CoroutineScope(Dispatchers.Main).launch {
                repeat(5) {
                    delay(1000L)
                    println("m2 coroutine $it")
                }
            }
            CoroutineScope(Dispatchers.Main).launch {
                repeat(5) {
                    delay(1000L)
                    println("m3 coroutine $it")
                }
            }
        }
    }

    fun deferTest(){
        val defered : Deferred<String> = CoroutineScope(Dispatchers.Main).async{
            "result"
        }



    }

    fun main4() {
        val job = GlobalScope.launch(Dispatchers.Default) {
            repeat(10) {
                delay(1000L)
                println("I'm working")
            }
        }

        runBlocking {
            job.cancelAndJoin()
            println("Coroutine is done..!")
        }
    }


    fun main3() = runBlocking<Unit> {
        GlobalScope.launch {
            delay(1000L)
            println("World!")
        }
        println("Hello")
        delay(2000L) //
    }


    fun main2() {
        //blocking
        GlobalScope.launch {
            delay(1000L)
            println("world")
        }
    }


    fun test2() {
        val job = GlobalScope.launch(Dispatchers.Default) {
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
}
