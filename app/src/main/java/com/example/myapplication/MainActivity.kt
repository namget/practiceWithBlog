package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    suspend fun fetchUser(): CoroutineScope {
        return CoroutineScope(Dispatchers.IO)
    }

    /*fun fetchUser(): User {
        //if network call -> NetworkOnMainThreadException
        return User("이재우", 28)
    }*/

    fun showUser(user: User) {
        //show user
    }

    fun showUserHighOrderFunction(user: () -> User) {

    }

    fun fetchAndShowUser() {
//        showUser(fetchUser())
//        showUserHighOrderFunction { fetchUser() }
    }

    data class User(val name: String, val age: Int)

}
