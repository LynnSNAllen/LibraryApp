package com.lynnpadc.libraryapp.persistance.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.lynnpadc.libraryapp.data.vos.google.SearchInfo

class SearchInfoTypeConverter {
    @TypeConverter
    fun toString(searchInfo: SearchInfo?) :String {
        return Gson().toJson(searchInfo)
    }

    @TypeConverter
    fun toSearchInfo(jsonString:String) : SearchInfo? {
        val searchInfoType = object : TypeToken<SearchInfo?>(){}.type
        return Gson().fromJson(jsonString,searchInfoType)
    }
}