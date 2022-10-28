package com.example.practica15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InformationAnimal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information_animal)
        val textView: TextView = findViewById(R.id.textView)
        var user: User = User()
        val arguments: Bundle? = intent.extras
        if (arguments != null) {
            user =
                arguments.getParcelable<User>(user.javaClass.simpleName) as User
            textView.text =
                " Год: ${user.getAge()} \nМесяц:${user.getMonth()} \nПорода: ${user.getName()}"

        }
    }
}