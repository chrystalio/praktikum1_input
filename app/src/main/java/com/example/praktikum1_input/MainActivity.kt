package com.example.praktikum1_input

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etTulisan: EditText
    private lateinit var tvTulisan: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTulisan = findViewById(R.id.et_tulisan) // Initialize the EditText
        tvTulisan = findViewById(R.id.tv_tulisan) // Initialize the TextView

        etTulisan.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // TODO: Implement what you want to do after text changes
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do Nothing
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                tvTulisan.text = "Hello, " + p0.toString()
            }
        })
    }
}
