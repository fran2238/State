package com.example.state

object Singleton{
    private var amount:Double = 70.0

    fun getAmount():Double{
        return amount
    }
    fun addAmount(a:Double){

        amount += a
    }
    fun removeAmount(a:Double){
    amount -= a
    }
    fun setAmount(a:Double){
        amount = a
    }
}