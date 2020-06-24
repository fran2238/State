package com.example.state.state

import com.example.state.context.Car

class Running(car: Car) :CarState {
    private val c:Car = car
    override fun drive(length: Double, liter: Double) {

        println("Bilen kørere allerede")
    }

    override fun stop() {
       println("bilen er stopet")
        c.setNewCarState(c.getStopped())
    }

    override fun refill(amount:Double) {
        println("du kan ikke fylde benzin på bilen mens den kører")
    }
}