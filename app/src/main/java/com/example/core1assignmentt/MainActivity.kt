package com.example.core1assignmentt


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private var score: Button? = null
    private var steal: Button? = null
    private var reset: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUI()
        score!!.setOnClickListener {
            val newText = Integer.toString(textView!!.text.toString().toInt() + 1)
            textView!!.text = newText
        }
        steal!!.setOnClickListener {
            if (textView!!.text.toString().toInt() != 0) {
                val newText = Integer.toString(textView!!.text.toString().toInt() - 1)
                textView!!.text = newText
            }
        }

    }


    fun resetTextView(view: View?) {
        textView!!.text = "0"
    }


    private fun setUI() {
        textView = findViewById(R.id.integer_number_1)
        score = findViewById(R.id.increase_1)
        steal = findViewById(R.id.decrease_1)
        reset = findViewById(R.id.reset_button)
    }
}
