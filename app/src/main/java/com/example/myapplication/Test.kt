package com.example.myapplication

import io.reactivex.Single
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by Namget on 2019.09.26.
 */


class Test {

    data class Person(val name: String = "namget", val age: Int = 20)

    val single: Single<Person> = Single.create { Person("aa", 10) }

    fun main() {

        single.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<Person> {
                override fun onSuccess(t: Person) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onSubscribe(d: Disposable) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onError(e: Throwable) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }
            })


    }


    sealed class mySealed<out R>(){
        data class Success<out T>(val person: T) : mySealed<T>()
        data class Error(val exception: Exception) : mySealed<Nothing>()
        object loading : mySealed<Nothing>()

    }
}