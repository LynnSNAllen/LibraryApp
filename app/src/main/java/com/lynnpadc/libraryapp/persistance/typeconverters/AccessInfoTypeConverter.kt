package com.lynnpadc.libraryapp.persistance.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.lynnpadc.libraryapp.data.vos.google.AccessInfo

class AccessInfoTypeConverter {
    @TypeConverter
    fun toString(accessInfo: AccessInfo?) :String {
        return Gson().toJson(accessInfo)
    }

    @TypeConverter
    fun toAccessInfo(jsonString:String) : AccessInfo? {
        val accessInfoType = object : TypeToken<AccessInfo?>(){}.type
        return Gson().fromJson(jsonString,accessInfoType)
    }
}