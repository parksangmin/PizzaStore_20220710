package com.sangmin.pizzastore_20220710

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


//       val 입력값변수 = 들고들어갈데이터

        changeBtn.setOnClickListener {
            val inputNick = changeNicEdt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNick)
            setResult(RESULT_OK, resultIntent)
            finish()
        }


    }
}