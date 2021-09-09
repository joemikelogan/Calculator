package com.itstop.calculator

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {

    lateinit var etInput: EditText
    lateinit var tvResult: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        tvResult = findViewById(R.id.tvResult)
    }

    fun clear(view: android.view.View) {
        //var inputValue = Integer.parseInt(etInput.text.toString())
        //var currentValue = Integer.parseInt(tvResult.text.toString())
        tvResult.setText(""+0)
        etInput.setText(""+0)
    }

    fun equals(view: android.view.View) {
        var currentValue = Integer.parseInt(tvResult.text.toString())
        //tvResult.setText(""+0)
    }

    fun add(view: android.view.View) {
        var currentValue = Integer.parseInt(tvResult.text.toString())
        tvResult.setText(""+0)
    }

    fun subtract(view: android.view.View) {
        var currentValue = Integer.parseInt(tvResult.text.toString())
        //tvResult.setText(""+0)
    }

    fun multiply(view: android.view.View) {
        var currentValue = Integer.parseInt(tvResult.text.toString())
        //tvResult.setText(""+0)
    }

    fun divide(view: android.view.View) {
        var currentValue = Integer.parseInt(tvResult.text.toString())

        //result divided by currentValue
        tvResult.setText(""+ currentValue)
    }
}