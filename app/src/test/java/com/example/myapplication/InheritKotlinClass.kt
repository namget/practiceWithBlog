package com.example.myapplication

import org.junit.Test

/**
 * Created by Namget on 2020.01.14.
 */
class InheritKotlinClass {

    @Test
    fun main(){
        val sub = Sub(10,"aa")
    }

    open class Super {
        val a = println("super a")


        constructor(age: Int, address: String) {
            println("super constructor 2")
        }

        constructor(age: Int, address: String, company: String) {
            println("super constructor 3")
        }

        init {
            println("super init")
        }

        val b = println("super b")
    }

    class Sub : Super {

        val c = println("Sub.c")
        val d = println("Sub.d")

        constructor(age: Int, address: String) : super(age, address) {
            println("Sub constructor")
        }

        init{
            println("Sub init")
        }

    }


}