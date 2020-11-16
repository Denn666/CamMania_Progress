package com.tes.cammania

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv_signUp : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tv_signUp = findViewById(R.id.tv_btnSignUp)

        tv_signUp.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.tv_btnSignUp ->{
                val intentRegister = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(intentRegister)
            }
        }
    }
}