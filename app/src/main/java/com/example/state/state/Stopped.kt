package com.example.state.state

import com.example.state.Singleton
import com.example.state.context.Car

class Stopped(car: Car) :CarState {

private val c:Car = car
    override fun drive(length: Double, liter: Double) {
        var gasUsed = length / liter
        Singleton.removeAmount(gasUsed)
        var total = Singleton.getAmount()
        if (total<= 0){
            Singleton.setAmount(0.0)
            println("bilen er løbet tør for benzin")
            c.setNewCarState(c.getOutOfGase())
        }else
        {
            println("Bilen Køere nu")
            c.setNewCarState(c.getRunning())
        }

    }

    override fun stop() {
        println("bilen er allerede stoppet")
    }

    override fun refill(amount: Double) {
        var s = Singleton.getAmount()
        Singleton.addAmount(amount)
        var t = Singleton.getAmount()
        println("der er blevet tanket $amount L på bilen den har nu $t L i alt")
    }


}