package com.example.state.state

interface CarState {
    fun drive(length: Double, liter: Double)
    fun stop()
    fun refill(amount:Double)
}