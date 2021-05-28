package com.example.contadordepessoaskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var calc: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPlus.setOnClickListener {
            calc++
            setLabels()
        }

        buttonMinus.setOnClickListener {
            calc--
            setLabels()
        }

       // buttonPlus.setOnClickListener(this)
      //buttonMinus.setOnClickListener(this)
    }
    /**override fun onClick(view: View) {
        val id = view.id
        val plus = R.id.buttonPlus

        if (id == plus) {
            calc++
            setLabels()


        } else if (id == R.id.buttonMinus) {
            calc--
            setLabels()
        }

    }**/

    private fun setLabels(){
        textPeople.text = "Pessoas:${calc}"
        textEnter.text = edit()
    }

    private fun edit(): String {
        return when {
            calc < 0 -> "Mundo invertido!!!"
            calc < 10 -> "Pode entrar!"
            else -> "Lotado!"
        }
    }

}
