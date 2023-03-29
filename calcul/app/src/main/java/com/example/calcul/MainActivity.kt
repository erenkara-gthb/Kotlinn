package com.example.calcul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var number1 :Int? = null
    var number2 :Int? = null
    var result  :Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mysum(view : View)
    {

        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber3.text.toString().toIntOrNull()



        if(number1 == null || number2 == null)
        {
            resultText.text = "Error"
        }
        else
        {
            val result = number1!! + number2!!
            resultText.text = "Result: $result"
        }




    }
    fun mysub(view : View)
    {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber3.text.toString().toIntOrNull()



        if(number1 == null || number2 == null)
        {
            resultText.text = "Error"
        }
        else
        {
            val result = number1!! - number2!!
            resultText.text = "Result: $result"
        }


    }
    fun mymultiply(view : View)
    {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber3.text.toString().toIntOrNull()



        if(number1 == null || number2 == null)
        {
            resultText.text = "Error"
        }
        else
        {
            val result = number1!! * number2!!
            resultText.text = "Result: $result"
        }

    }
    fun mydiv(view : View)
    {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber3.text.toString().toIntOrNull()



        if(number1 == null || number2 == null)
        {
            resultText.text = "Error"
        }
        else
        {
            val result = number1!! / number2!!
            resultText.text = "Result: $result"
        }

    }


}