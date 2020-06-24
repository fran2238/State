package com.example.state

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.state.context.Car

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var car:Car = Car()

        car.drive(22.2,7.0)
        car.stop()
        car.drive(40.0,2.2)
        car.stop()
        car.refill(10.2)
        car.drive(200.1,2.0)
        car.drive(1.1,3.1)
        car.refill(30.2)
    }
}