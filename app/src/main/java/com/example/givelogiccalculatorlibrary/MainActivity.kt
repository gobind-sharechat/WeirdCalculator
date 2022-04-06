package com.example.givelogiccalculatorlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.calculator_library.Calculator
import com.example.calculator_library.CalculatorLogic

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculator(calculatorLogic = CalculatorLogicImpl.getInstance())
        }
    }
}

class CalculatorLogicImpl private constructor(): CalculatorLogic {

    companion object {

        var INSTANCE: CalculatorLogic? = null

        fun getInstance(): CalculatorLogic {
            if (INSTANCE != null) return INSTANCE as CalculatorLogic
            INSTANCE = CalculatorLogicImpl()
            return INSTANCE as CalculatorLogicImpl
        }
    }

    override fun add(a: Int, b: Int): Int  = a + b
    override fun subtract(a: Int, b: Int): Int = a - b
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
