package com.example.borutoapp.data.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class DatabaseConverter {

    private val gson = Gson()

    @TypeConverter
    fun convertListToString(list: List<String?>?): String {
        return gson.toJson(list)
    }

    @TypeConverter
    fun convertStringToList(string: String?): List<String> {
        val listType = object : TypeToken<ArrayList<String?>?>() {}.type
        return gson.fromJson(string, listType)
    }
}