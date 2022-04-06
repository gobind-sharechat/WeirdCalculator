package com.example.calculator_library

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@androidx.compose.runtime.Composable
fun Calculator(calculatorLogic: CalculatorLogic) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Log.d("Calculator_screen", "${calculatorLogic.add(0, 4)} ${calculatorLogic.subtract(1, 19)}")
    }
}
