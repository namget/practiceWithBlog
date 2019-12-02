package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*


/**
 * Created by Namget on 2019.09.24.
 */

class CoroutineTest : AppCompatActivity() {

    val supervisorJob = SupervisorJob()

    /**
    용어정리

    --GlobalScope --
    해당 어플리케이션의 전체 생명주기를 따른다.

    --- 코루틴 빌더---
    /*launch */
    launch = job을 반환 서버의 작업의 결과값을 받을 필요 없을때
    join 작업중인 상태가 있으면 해당 작업이 끝난후에 아래의 작업을 시킴

    /*async*/
    async = defered를 반환하며
    await = 작업중인 값을 기다리며 리턴값을 반환


    -- 함수 ---
    - delay 는 suspend 함수이다.  suspend란 잠시 중단한다는 의미, 중단후에 resume을 시키는데,
    코루틴은 일시중지, 스레드입장에선 non-blocking

    - runBlocking 는 해당 작업이 끝날때까지 스레드를 블락시킴


     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main3()
    }

    //main thread blocking
    private fun main() {
        runBlocking {
            //start main coroutine
            launch {
                delay(1000L)
                Log.e("coroutine", "world")
            }
            Log.e("coroutine", "Hello")
        }
        //main thread blocking
        Log.e("coroutine", "end")
    }

    //job.join
    fun main2() {
        runBlocking {
            //start main coroutine
            val job = launch {
                delay(1000L)
                Log.e("coroutine", "world")
            }
            job.join() // join일경우 job의
            Log.e("coroutine", "Hello")
        }
        //main thread blocking
        Log.e("coroutine", "end")
    }

    private fun main3() {
        runBlocking {
            //start main coroutine
            val deferred = async {

                delay(1000L)
                val world = "world"
                world
            }
            val data = deferred.await() //
            Log.e("coroutine", "Hello $data")
        }
        //main thread blocking
        Log.e("coroutine", "end")
    }


}
