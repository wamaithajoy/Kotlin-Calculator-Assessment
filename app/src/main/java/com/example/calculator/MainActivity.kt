package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var etFirstNumber: TextInputEditText
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var etSecondNumber: TextInputEditText
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvResult: TextView
    lateinit var btnCalculate: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
    }
    fun castViews(){
     tilFirstNumber=findViewById(R.id.tilFirstNumber)
        etFirstNumber=findViewById(R.id.etFirstNumber)
     tilSecondNumber=findViewById(R.id.tilSecondNumber)
        etSecondNumber=findViewById(R.id.etSecondNumber)
     btnAddition=findViewById(R.id.btnAddition)
     btnSubtraction=findViewById(R.id.btnSubtraction)
     btnModulus=findViewById(R.id.btnModulus)
     btnDivision=findViewById(R.id.btnDivision)
     tvResult=findViewById(R.id.tvResult)
     btnCalculate=findViewById(R.id.btnCalculate)

     btnAddition.setOnClickListener {
         var number1=etFirstNumber.text.toString().toInt()
         var number2=etSecondNumber.text.toString().toInt()
         addition(number1, number2)
     }
     btnSubtraction.setOnClickListener {
         var number1=etFirstNumber.text.toString().toInt()
         var number2=etSecondNumber.text.toString().toInt()
         subtraction(number1, number2)
     }
     btnDivision.setOnClickListener {
         var number1=etFirstNumber.text.toString().toInt()
         var number2=etSecondNumber.text.toString().toInt()
         division(number1, number2)
     }
     btnModulus.setOnClickListener {
         var number1=etFirstNumber.text.toString().toInt()
         var number2=etSecondNumber.text.toString().toInt()
         remainder(number1, number2)
     }
     btnCalculate.setOnClickListener {
         validating()
     }

    }
    fun addition(number1:Int,number2:Int){
     var sum=number1+number2
     tvResult.text=sum.toString()
    }
    fun subtraction(number1:Int,number2: Int){
    var minus=number1-number2
    tvResult.text=minus.toString()
    }
    fun division(number1: Int,number2: Int){
    var divide=number1/number2
    tvResult.text=divide.toString()
    }
    fun remainder(number1: Int,number2: Int){
     var modulus=number1%number2
     tvResult.text=modulus.toString()
    }
    fun validating(){
        var error=false
        tilFirstNumber.error=null
        tilSecondNumber.error=null

    var numberone=etFirstNumber.text.toString()
    if (numberone.isBlank()){
        tilFirstNumber.error="First number is required"
    }
    var numbertwo=etSecondNumber.text.toString()
    if (numbertwo.isBlank()){
        tilSecondNumber.error="Second number is required"
    }

    }

}