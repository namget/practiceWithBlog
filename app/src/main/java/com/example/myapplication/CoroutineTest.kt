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


    --- CoroutineScope ---

    //코루틴 개념익히기
    https://wooooooak.github.io/kotlin/2019/08/25/%EC%BD%94%ED%8B%80%EB%A6%B0-%EC%BD%94%EB%A3%A8%ED%8B%B4-%EA%B0%9C%EB%85%90-%EC%9D%B5%ED%9E%88%EA%B8%B0/
    //medium blog
    https://medium.com/swlh/kotlin-coroutines-in-android-basics-9904c98d4714


    CoroutineScope
    모든 코루틴은 Coroutine Scope 안에서 동작한다. 이것은  Coroutine Context를 파라미터로서 가지고 있다.
    그리고 우리가 사용가능한 여러가지의 스코프가 존재한다.

    1. CoroutineScope : 커스텀한 CoroutineContext를 통해 스코프를 생성한다.
    2. MainScopre : UI Components를 위한 메인스코프를 만든다. SupervisorJob() 과 함게 메인스레드 위에서 동작한다.
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


    fun test() {
        val handler = CoroutineExceptionHandler { _, throwable -> Log.d("demo", "$throwable") }
    }
}
