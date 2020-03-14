package com.jesley.blooddonation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class login_activity : AppCompatActivity() {


    lateinit var topic: TextView
    lateinit var mobnum : EditText
    lateinit var pass : EditText
    lateinit var login :Button
    lateinit var forgot :TextView
    lateinit var reg :TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activity)

                   topic = findViewById(R.id.topic)
                    mobnum= findViewById(R.id.mobnum)
                    pass= findViewById(R.id.pass)
                    login= findViewById(R.id.login)
                    forgot= findViewById(R.id.forgot)
                     reg= findViewById(R.id.reg)
        login.setOnClickListener {Toast.makeText(this@login_activity,
            "Your login process is successfull"
            ,Toast.LENGTH_LONG).show() }

    }
}
