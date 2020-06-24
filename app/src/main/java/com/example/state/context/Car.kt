package com.example.state.context

import com.example.state.Singleton
import com.example.state.state.CarState
import com.example.state.state.OutOfGase
import com.example.state.state.Running
import com.example.state.state.Stopped

class Car() {

    var running: Running = Running(this)
    var stopped: Stopped = Stopped(this)
    var outOfGase: OutOfGase = OutOfGase(this)
    var carState:CarState = stopped

    var tank:Double = Singleton.getAmount()


    init {
        if (tank <= 0){
            carState = getOutOfGase()
        }
    }


    fun setNewCarState(cs:CarState){
       carState = cs
    }
    fun drive(lenght: Double, liter: Double){
        carState.drive(lenght,liter)
    }
    fun stop(){
        carState.stop()
    }
    fun refill(amount:Double){
        carState.refill(amount)
    }

    fun getRunning():CarState{
        return running
    }
    fun getStopped():CarState{
        return stopped
    }
    fun getOutOfGase():CarState{
        return outOfGase
    }

}