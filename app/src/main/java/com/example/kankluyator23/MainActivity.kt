package com.example.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kankluyator23.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etFirstNumber = findViewById<EditText>(R.id.etFirstNumber)
        val etSecondNumber = findViewById<EditText>(R.id.etSecondNumber)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        btnAdd.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toDoubleOrNull()
            val num2 = etSecondNumber.text.toString().toDoubleOrNull()

            if (num1 == null || num2 == null) {
                tvResult.text = "Iltimos, sonlarni kiriting!"
            } else {
                tvResult.text = "Natija: ${num1 + num2}"
            }
        }

        btnSubtract.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toDoubleOrNull()
            val num2 = etSecondNumber.text.toString().toDoubleOrNull()

            if (num1 == null || num2 == null) {
                tvResult.text = "Iltimos, sonlarni kiriting!"
            } else {
                tvResult.text = "Natija: ${num1 - num2}"
            }
        }

        btnMultiply.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toDoubleOrNull()
            val num2 = etSecondNumber.text.toString().toDoubleOrNull()

            if (num1 == null || num2 == null) {
                tvResult.text = "Iltimos, sonlarni kiriting!"
            } else {
                tvResult.text = "Natija: ${num1 * num2}"
            }
        }

        btnDivide.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toDoubleOrNull()
            val num2 = etSecondNumber.text.toString().toDoubleOrNull()

            if (num1 == null || num2 == null) {
                tvResult.text = "Iltimos, sonlarni kiriting!"
            } else if (num2 == 0.0) {
                tvResult.text = "0 ga bo‘lish mumkin emas!"
            } else {
                tvResult.text = "Natija: ${num1 / num2}"
            }
        }
    }
}
