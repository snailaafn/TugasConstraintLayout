package com.example.tugasconstraintlayout

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTxtEmail = findViewById<TextInputEditText>(R.id.edit_txtEmail)
        val editTxtFullname = findViewById<TextInputEditText>(R.id.edit_txtFullname)
        val editTxtUsername = findViewById<TextInputEditText>(R.id.edit_txtUsername)
//        val editTxtPassword = findViewById<TextInputEditText>(R.id.edit_txtPassword)
        val btnSignUp = findViewById<Button>(R.id.btn_signUp)

        btnSignUp.setOnClickListener {
            val email = editTxtEmail.text
            val fullname = editTxtFullname.text
            val username = editTxtUsername.text
//            val password = editTxtPassword.text.toString()

            val toastMessage = "$email, $fullname, $username"
            Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show()
        }
    }
}
