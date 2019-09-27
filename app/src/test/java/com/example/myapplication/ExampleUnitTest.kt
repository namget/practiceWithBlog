package com.example.myapplication

import kotlinx.coroutines.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    @Test
    fun oroutineTest1() {
        val job = GlobalScope.launch(Dispatchers.Default) {
            withTimeout(4200L) {
                repeat(10) {
                    delay(1000L)
                    println("I'm working")
                }
            }
        }
        runBlocking {
            job.join()
            println("Coroutine is done..!")
        }
    }

}
