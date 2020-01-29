package com.example.myapplication.coroutine

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.MainActivity
import kotlinx.coroutines.*
import java.io.IOException


/**
 * Created by Namget on 2019.09.24.
 */

class CoroutineTest : AppCompatActivity() {

    val supervisorJob = SupervisorJob()


    /**
    용어정리


    --- CoroutineScope ---

    //코루틴 개념익히기
    https://wooooooak.github.io/kotlin/2019/08/25/%EC%BD%94%ED%8B%80%EB%A6%B0-%EC%BD%94%EB%A3%A8%ED%8B%B4-%EA%B0%9C%EB%85%90-%EC%9D%B5%ED%9E%88%EA%B8%B0/
    //medium blog
    https://medium.com/swlh/kotlin-coroutines-in-android-basics-9904c98d4714


    CoroutineScope
    모든 코루틴은 Coroutine Scope 안에서 동작한다. 이것은  Coroutine Context를 파라미터로서 가지고 있다.
    그리고 우리가 사용가능한 여러가지의 스코프가 존재한다.

    1. CoroutineScope : 커스텀한 CoroutineContext를 통해 스코프를 생성한다.
    2. MainScope : UI Components를 위한 메인스코프를 만든다. SupervisorJob() 과 함게 메인스레드 위에서 동작한다.
    child job의 실패는 다른것들에 영향을 미치지 않는다.
    public fun MainScope : CroutineScope = ContextScope(SupervisorJob() + Dispatchers.Main)

    3. GlobalScope : 해당 어플리케이션의 전체 생명주기를 따른다.


    --- 코루틴 빌더 Couroutine Builder---
    /*launch */
    launch = job을 반환 서버의 작업의 결과값을 받을 필요 없을때
    join 작업중인 상태가 있으면 해당 작업이 끝난후에 아래의 작업을 시킴

    /*async*/
    async = defered를 반환하며
    await = 작업중인 값을 기다리며 리턴값을 반환

    runBlocking 는 해당 작업이 끝날때까지 스레드를 블락시킴


    -- 함수 ---
    - delay 는 suspend 함수이다.  suspend란 잠시 중단한다는 의미, 중단후에 resume을 시키는데,
    코루틴은 일시중지, 스레드입장에선 non-blocking

    ---- suspend & resume ----
    suspend : 현재의 코루틴을 멈춘다
    resume : 멈춰있던 코루틴 부분을 다시 시작한다.


    -- dispatchers --
    coroutine context는 어떤 스레드에서 해당 coroutine을 실행할지에 대한 dispatcher 정보를 담고있다.
    IO , Main, Default, Unconfined
    https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-dispatcher/
    Dispatchers.Main + Job()

    Default: 백그라운드 풀의 스레드를 공유해서 사용한다./ 최대 스레드 사용 갯수는 씨피유의 수와 같다.
    IO: Default와 스레드를 공유하면서 스레드의 수는 parallelism에 의해 제한된다. 보통 64스레드 혹은 코어의 갯수이다.
    Main: 안드로이드 메인 스레드와 동일하다.
    Unconfined: Coroutine dispatcher는 어떠한 스레드에도 없고 코루틴은 현재의 첫번째 스레드에서 실행된다.


    -- CoroutineExceptionHandler --
    uncaught exceptions을 핸들링 가능하다.

    1.



    -- Coroutine Body --
    CoroutineScope(Dispatchers.Main + Job()).launch {
    //Coroutine body
    }


    코루틴
    두개의 비동기를 합쳐 하나의 zip형태로 처리하는 방법
    https://stackoverflow.com/questions/56622619/zip-network-requests-via-kotlin-coroutine-flow


     < ---  suspend 와 blocking---- >
     supsend와 blocking은 비슷하지만 실질적으론 완전 다르다.
    blocking 은 같은 스레드로 실행된 부모의 실행을 정지시키는것을 의미한다. 만약 UI스레드에서 블락킹을 시키면 실행이 끝날때까지 UI 입력을 블락한다.





     //예제 테스트 결과

    suspend fun a1() {
    delay(2000)
    Log.e("11", "a111111")
    }

    suspend fun a2() {
    delay(1000)
    Log.e("11", "a222222")
    }

    CoroutineScope(Dispatchers.Main).launch {
    Log.e("11", "a66666")
    a1()
    a2()
    Log.e("11", "a77777")
    }

    하나의 코루틴 스코프에서는 딜레이 동작이 처리된 후 동작
    결과
     a6666
     a111111
     a2222222
     a777777


    CoroutineScope(Dispatchers.Main).launch {
      Log.e("11", "a66666")
      CoroutineScope(Dispatchers.Main).launch {
         a1()
       }
       CoroutineScope(Dispatchers.Main).launch {
         a2()
       }
      Log.e("11", "a77777")
    }

     각자의 코루틴 스코프를 동작시킬경우 부모와는 다르게 자식의 코루틴 스코프를 생성
      결과
     a66666
     a7777
     a222222
     a111111

     코루틴을 동작시키다가 cancel을 시키지 않고 화면을 나간다면
     memory leak 혹은 resource 낭비


    */


    fun a() {
        CoroutineScope(Dispatchers.Main + Job()).launch {
            val user = fetchUser()

        }
    }

    suspend fun fetchUser(): MainActivity.User = withContext(Dispatchers.IO) {
        //todo
        MainActivity.User("11", 11);
    }


    suspend fun fetchDocs() {
        val result = getInternet("www.naver.com")
        show(result)
    }

    fun show(ss: String) {
    }

    suspend fun getInternet(url: String) = withContext(Dispatchers.IO) {
        "ss"
    }

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

    //handler
    fun test() {
        val handler = CoroutineExceptionHandler { _, throwable ->
            //1.코루틴을 try catch로 묶게되면 안됨
            //2.이 핸들러는 CancellationException을 무시해버림
            //3. 따라서 invokeOnCompletion을 이용해야함
            Log.d("demo", "$throwable")
        }

        CoroutineScope(Dispatchers.Main + handler).launch {
            doSomeThing()
        }


        val job = CoroutineScope(Dispatchers.Main).launch {
            doSomeThing2()
        }

        job.invokeOnCompletion {
            val error = it ?: return@invokeOnCompletion
        }


    }

    suspend fun doSomeThing() {
        delay(1000)
        throw IOException()
    }

    suspend fun doSomeThing2() {
        delay(1000)
        throw CancellationException()
    }

    fun jobTest() {
        /**
         *        parentJob
         *        childJob1
         *  childJob2 childJob3
         */
        val parentJob = Job()
        val childJob1 = CoroutineScope(parentJob).launch {
            val childJob2 = launch { }
            val childJob3 = launch { }
        }


        /**
         *  parentJob1        patentJob2
         *  childJobN1        childJobN3
         *  childJobN2
         */
        val parentJob1 = Job()
        val parentJob2 = Job()
        val childJobN1 = CoroutineScope(parentJob1).launch {
            val childJobN2 = launch { }
            val childJobN3 = launch(parentJob2) { }
        }

        //이렇게 할경우 부모가 취소되면 자식도 즉시 취소된다.
        // 자식에서 취소나 실패가 일어날경우 즉시 부모와 다른 자식도 취소된다.

        val prJob = Job()
        CoroutineScope(Dispatchers.Main + prJob).launch {
            val childJob = launch {
                delay(5000)
                //실행 못함
            }
            launch {
                delay(1000)
                prJob.cancel() //1초후에 부모의 잡을 멈춘다.
            }
        }
    }

}
