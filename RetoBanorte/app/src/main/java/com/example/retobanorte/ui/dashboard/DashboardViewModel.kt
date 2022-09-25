package com.example.retobanorte.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
<<<<<<< HEAD
        value = ""
=======
        value = "Transferencia"
>>>>>>> 21122353571384cfd4e13eade14308ca07410ddf
    }
    val text: LiveData<String> = _text
}