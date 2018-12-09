package com.example.neox.calc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onNumberButtonClick(view: View) {
        val buttonSelected = view as Button
        var clickedButtonValue = textField.text.toString()
        when(buttonSelected.id) {
            b0.id -> clickedButtonValue += "0"
            b1.id -> clickedButtonValue += "1"
            b2.id -> clickedButtonValue += "2"
            b3.id -> clickedButtonValue += "3"
            b4.id -> clickedButtonValue += "4"
            b5.id -> clickedButtonValue += "5"
            b6.id -> clickedButtonValue += "6"
            b7.id -> clickedButtonValue += "7"
            b8.id -> clickedButtonValue += "8"
            b9.id -> clickedButtonValue += "9"
            plusMinus.id -> clickedButtonValue = "-$clickedButtonValue"
            dot.id -> clickedButtonValue += "."
            mult.id -> clickedButtonValue += "*"
            div.id -> clickedButtonValue += "/"
            add.id -> clickedButtonValue += "+"
            subtr.id -> clickedButtonValue += "-"
            percent.id -> clickedButtonValue += "%"
        }
        textField.setText(clickedButtonValue)
    }
}
