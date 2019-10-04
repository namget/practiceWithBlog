package com.example.myapplication

import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {



    /**
     *  doOnError보다 onErrorResumeNext가 먼저 나오게되면 error를 next로 내려주게된다.
     * */
    @Test
    fun test() {
//        Observable.just("emit 1", "emit 2", Exception())
//            .subscribeOn(AndroidSchedulers.mainThread())
//            .doOnError {}
//            .onErrorResumeNext(Observable.just("emmit 3"))
//            .subscribe {
//
//
//            }

        Observable.create(ObservableOnSubscribe<String> { subscriber ->
            println("Start to subscribe items")
            subscriber.onError(Throwable("Occurs Error!!"))
            subscriber.onNext("emit 1")
            subscriber.onNext("emit 2")
//            subscriber.onError(Throwable("Occurs Error!!"))
        })
            .onErrorResumeNext(
                Observable.just("emit 3")
            )
            .doOnError { println("doOnError") }
            .subscribe(
                { next -> println("Next : $next") },
                { err -> println("Error : " + err.toString()) })
    }

/*
    @Test
    fun blockingTest() {
        GlobalScope.launch {
            delay(1000L)
            println("World!")
        }
        printlnlnln("Hello,")
        runBlocking {
            delay(2000L)
            printlnln("Coroutine is done..!")
        }
    }


    fun main()= runBlocking {
        launch {
            delay(200L)
            printlnln("Task from runBlocking")
        }
        coroutineScope{
            launch {
                delay(500L)
                printlnln("Task from nested launch")
            }
            delay(100L)
            printlnln("Task from coroutine scope")
        }

        printlnln("Coroutine scope is over")

    }


    fun coroutineTest1() {
        val job = GlobalScope.launch(Dispatchers.Default) {
            withTimeout(4200L) {
                repeat(10) {
                    delay(1000L)
                    printlnln("I'm working")
                }
            }
        }
        runBlocking {
            job.join()
            printlnln("Coroutine is done..!")
        }
    }*/

}
