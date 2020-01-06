package com.example.myapplication/*
package com.example.myapplication

import android.content.SharedPreferences
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

*/
/**
 * Created by Namget on 2020.01.02.
 *//*

class KtxTest : Fragment() {

    //https://developer.android.com/kotlin/ktx
    //https://developer.android.com/topic/libraries/architecture/coroutines

    lateinit var sharedPreferences: SharedPreferences
    // core KTX에 포함
    fun shared() {
        val value = false
        //before
        sharedPreferences
                .edit()
                .putBoolean("key", value)
                .apply()

        //after async
        sharedPreferences.edit { putBoolean("key", value) }
        //or  sync
        sharedPreferences.edit(commit = true) { putBoolean("key", value) }
    }

    // implementation "androidx.collection:collection-ktx:1.1.0"
    fun collection() {
        val combinedArrayList = arrayListOf(1, 2, 3) + arrayListOf(4, 5, 6)
        val newArrayList = combinedArrayList + 7 + 8
    }

    // Fragment 에 ktx가 있다.
    // 뷰모델을 delegate 해서 지연초기화 가능
    // activityViewModel도 가능
    //implementation "androidx.fragment:fragment-ktx:1.1.0"
    fun fragment() {
        // Get a reference to the ViewModel scoped to this Fragment
        val viewModel by viewModels<MyViewModel>()
        val viewModelWithFactory by viewModels<MyViewModel> { viewModelFactory }
        // Get a reference to the ViewModel scoped to its Activity
        val viewModel2 by activityViewModels<MyViewModel>()
    }

    class MyViewModel : ViewModel()
    class User()


    //implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0-rc03"
    fun lifecycle() {
        //suspend function 만 사용가능
        whenStarted {
            // The block inside will run only when Lifecycle is at least STARTED.
            // It will start executing when fragment is started and
            // can call other suspend methods.
            loadingView.visibility = View.VISIBLE
            val canAccess = withContext(Dispatchers.IO) {
                checkUserAccess()
            }

            // When checkUserAccess returns, the next line is automatically
            // suspended if the Lifecycle is not *at least* STARTED.
            // We could safely run fragment transactions because we know the
            // code won't run unless the lifecycle is at least STARTED.
            loadingView.visibility = View.GONE
            if (canAccess == false) {
                //접근 불가능하면 popBackStack
                findNavController().popBackStack()
            } else {
                //접근 가능하면 showContent
                showContent()
            }

            // This line runs only after the whenStarted block above has completed.

        }

    }

    //Lifecycle 2
    class MyFragment : Fragment() {
        init {
            //viewmodel scope를 이용한 방법
            // 코루틴이 실행되는 동안 액티비티나 클래스가 destroy된다면 코루틴은 자동으로 canceled 된다.
            lifecycleScope.launchWhenStarted {
                try {
                    // Call some suspend functions.
                } finally {
                    // This line might execute after Lifecycle is DESTROYED.
                    if (lifecycle.state >= STARTED) {
                        // Here, since we've checked, it is safe to run any
                        // Fragment transactions.
                    }
                }
            }
        }
    }


    // implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0-rc03"
    // coroutine을 이용해서 비동기로 LiveData를 이용하는 방법이다.
    // loadUser는 suspend function 이여야 하고 동작이 완료되면 user로 emit 한다.
    fun liveData() {
        val user: LiveData<User> = liveData {
            val data = database.loadUser() // loadUser is a suspend function.
            emit(data)
        }
    }

    // sealed class를 이용한 방법
    val user: LiveData<Result> = liveData {
        emit(Result.loading())
        try {
            emit(Result.success(fetchUser()))
        } catch (ioException: Exception) {
            emit(Result.error(ioException))
        }
    }


    // implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0-rc03"
    // viewModelScope
    class MainViewModel : ViewModel() {
        // Make a network request without blocking the UI thread
        private fun makeNetworkRequest() {
            // launch a coroutine in viewModelScope
            viewModelScope.launch {
                //                remoteApi.slowFetch()
//                ...
            }
        }
        // No need to override onCleared()
    }
    //뷰모델 스코프는 뷰모델이 cleared 되면 코루틴은 취소된다.


    //implementation "com.google.android.play:core-ktx:1.6.4"
    // appUpdateManger
    fun playKtx(){
        */
/*manager.requestUpdateFlow().collect
        { updateResult ->
            when (updateResult) {
                is AppUpdateResult.Available -> TODO()
                is AppUpdateResult.InProgress -> TODO()
                is AppUpdateResult.Downloaded -> TODO()
                AppUpdateResult.NotAvailable -> TODO()
            }
        }*//*

    }



}*/
