package com.lynnpadc.libraryapp.persistance.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.lynnpadc.libraryapp.data.vos.google.SaleInfo

class SaleInfoTypeConverter {
    @TypeConverter
    fun toString(saleInfo: SaleInfo?) :String {
        return Gson().toJson(saleInfo)
    }

    @TypeConverter
    fun toSaleInfo(jsonString:String) : SaleInfo? {
        val saleInfoType = object : TypeToken<SaleInfo?>(){}.type
        return Gson().fromJson(jsonString,saleInfoType)
    }
}