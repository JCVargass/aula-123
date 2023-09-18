package com.example.aula-123;

import
        androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditTextText editText1
    private var editTextText2: EditText? = null
    private var editTextText3: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextText = findViewById<EditText>(R.id.editTextText)
        editTextText2 = findViewById<EditText>(R.id.editTextText2)
        editTextText3 = findViewById<EditText>(R.id.editTextText3)
    }

    fun click(view: View?) {
        val x: Int
        val y: Int
        val soma: Int
        x = editTextText!!.text.toString().toInt()
        y = editTextText2!!.text.toString().toInt()
        soma = x + y
        editTextText3!!.setText(Integer.toString(soma))
    }
}