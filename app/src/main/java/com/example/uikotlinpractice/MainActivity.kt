package com.example.uikotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//     확인 버튼이 눌릴시 이벤트

        okBtn.setOnClickListener {

            val inputContent = contentEdt.text.toString()

            resultTxt.text = inputContent
        }
    }
}