package com.sangmin.pizzastore_20220710

import java.io.Serializable

class StoreData(
    val name : String,
    val score : Double,
    val phoneNum : String,
    val logUrl : String,
) : Serializable{
}