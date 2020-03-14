package com.jesley.blooddonation

import android.content.Intent
import android.location.Address
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var name: TextView
    lateinit var namebox: EditText
    lateinit var address: TextView
    lateinit var addressbox: EditText
    lateinit var bloodgp: TextView
    lateinit var bloodgpbox: EditText
    lateinit var phone: EditText
    lateinit var phonebox: EditText
    lateinit var update: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        title = "Life Saver"

        name = findViewById(R.id.name)
        namebox = findViewById(R.id.namebox)
        address = findViewById(R.id.address)
        addressbox = findViewById(R.id.addressbox)
        bloodgp = findViewById(R.id.bloodgp)
        bloodgpbox = findViewById(R.id.bloodgpbox)
        phone = findViewById(R.id.phone)
        phonebox = findViewById(R.id.phonebox)
        update = findViewById(R.id.update)
       update.setOnClickListener {
           Toast.makeText(this@MainActivity,
               "YOU HAVE BEEN UPDATED",
               Toast.LENGTH_LONG).show()

           )
       }
    }
}