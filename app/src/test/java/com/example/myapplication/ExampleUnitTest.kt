package com.example.myapplication

import io.reactivex.Single
import io.reactivex.SingleOnSubscribe
import io.reactivex.SingleSource
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
//            .doOnError {println("doOnError")}
//            .onErrorResumeNext(Observable.just("emmit 3"))
//            .subscribe {
//
//            }

        Single.create(SingleOnSubscribe<String> {
            it.onError(NullPointerException())
        }).onErrorResumeNext {
                println("singlesource : ")
            SingleSource {
                Single.concat(Single.just(123), Single.just("1"))
                    .filter { it is String }
                    .first("zzz")
            }
        }.subscribe(
            { next -> println("Next : $next") },
            { err -> println("Error : " + err.toString()) })


/*        Observable.create(ObservableOnSubscribe<String> { subscriber ->
            println("Start to subscribe items1")
            subscriber.onNext("emit 1")
            subscriber.onNext("emit 2")
            subscriber.onError(Throwable("Occurs Error!!"))
//            subscriber.onError(Throwable("Occurs Error!!"))
        })
            .doOnError { println("doOnError1") }
//            .onErrorResumeNext(
//                Observable.create(ObservableOnSubscribe<String> { subscriber ->
//                    println("Start to subscribe items2")
//                    subscriber.onNext("emit 55")
//                    subscriber.onNext("emit 66")
//                    subscriber.onError(Throwable("Occurs Error!!"))
//                })
//            )
//            .doOnError { println("doOnError2") }
            .subscribe(
                { next -> println("Next : $next") },
                { err -> println("Error : " + err.toString()) })*/
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
