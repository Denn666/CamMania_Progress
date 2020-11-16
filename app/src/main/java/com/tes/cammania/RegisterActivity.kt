package com.tes.cammania

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv_login : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        tv_login = findViewById(R.id.tv_btnLogIn)

        tv_login.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.tv_btnLogIn -> {
                val intentLogin = Intent(this@RegisterActivity,MainActivity::class.java)
                startActivity(intentLogin)
            }
        }
    }


}