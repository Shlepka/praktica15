package com.example.practica15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Content(view: View) {
        val nameText:EditText = findViewById(R.id.textname)
        val ageText: EditText = findViewById(R.id.textage)
        val monthText: EditText = findViewById(R.id.textmonth)
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        val month = monthText.text.toString().toInt()
        val user: User = User(name, month, age)
        val intent: Intent = Intent(this@MainActivity,
            InformationAnimal::class.java)
        intent.putExtra(user.javaClass.simpleName, user)
        startActivity(intent)

    }
}