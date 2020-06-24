package com.example.state.state

import com.example.state.Singleton
import com.example.state.context.Car

class OutOfGase(c: Car):CarState {

    private val car:Car = c

    override fun drive(length: Double, liter: Double) {
        println("Du kan ikke kører uden benzin")
    }

    override fun stop() {
        println("er allerede stoppet da der ikke er benzin")
    }

    override fun refill(amount: Double) {

        Singleton.addAmount(amount)
        if (Singleton.getAmount() > 70){
            Singleton.setAmount(70.0)
        }
        var g = Singleton.getAmount()
        println("der er blevet fyldt $amount L på bilen, bilen har nu $g L i alt")
        car.setNewCarState(car.getStopped())
    }


}