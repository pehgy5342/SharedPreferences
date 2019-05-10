package com.example.pehgy.sharedpreference

import android.content.Context
import android.content.SharedPreferences

class SharedPreferenceClass(context: Context) {


    var sharedPreferences: SharedPreferences


    init {
        sharedPreferences = context.getSharedPreferences("name", Context.MODE_PRIVATE)

    }

    fun record(input: String) {
        sharedPreferences.edit().putString("word", input).apply()

    }

    fun show(): String {


        //回傳從key:word的字串，()裡的數值必為字串要用""，雙驚嘆號為一定存在此function
        return sharedPreferences.getString("word", "")!!
    }


}