package com.pavel.demo.data.prefs

import android.content.Context
import android.content.SharedPreferences

class PreferenceManager(context: Context) {

    private val IS_FIRST_TIME_LAUNCH = "IsFirstLunch"
    private val PREF_NAME = "app_name_pref"
    private var sp: SharedPreferences? =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    private var editor: SharedPreferences.Editor? = sp!!.edit()


    fun setFirstTimeLaunch(isFirstTime: Boolean) {
        sp!!.edit().putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime).apply()
    }

    fun isFirstTimeLaunch(): Boolean {
        return sp!!.getBoolean(IS_FIRST_TIME_LAUNCH, true)
    }

}