package com.acclivous.question02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen_two.*

class ScreenTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_two)

        iv_back_screen.setOnClickListener {
            finish()
        }


        go_to_screen_03.setOnClickListener {
            val intent = Intent(this, ScreenThreeActivity::class.java)
            startActivity(intent)
        }
    }
}
