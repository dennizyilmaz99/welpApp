package com.denniz.labb_1_androidutveckling

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.app.AlertDialog

class SignInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        supportActionBar?.hide()

        var userList = ArrayList<User>(
            listOf(
                User(
                    "Denniz", "denniz"
                )
            )
        )



        val signInBtn: Button = findViewById(R.id.signInBtn)
        val textUsername: EditText = findViewById(R.id.textUsername)
        val txtPass: EditText = findViewById(R.id.textPass)
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)

        signInBtn.setOnClickListener{

            if(textUsername.text.toString().isEmpty() || txtPass.text.toString().isEmpty()){
                builder.setTitle("Sign in")
                    .setMessage("You can't sign in without credentials. Please try again.")
                    .setPositiveButton("OK") {dialog, which ->

                    }
                val dialog = builder.create()
                dialog.show()

            }else if(textUsername.text.toString() != userList[0].username && txtPass.text.toString() != userList[0].password){
                builder.setTitle("Sign in")
                    .setMessage("Wrong username and password. Please try again.")
                    .setPositiveButton("OK") {dialog, which ->

                    }
                val dialog = builder.create()
                dialog.show()

            }else if(textUsername.text.toString() != userList[0].username){
                builder.setTitle("Sign in")
                    .setMessage("Wrong username. Please try again.")
                    .setPositiveButton("OK") {dialog, which ->
                    }
                val dialog = builder.create()
                dialog.show()

            }else if(txtPass.text.toString() != userList[0].password){
                builder.setTitle("Sign in")
                    .setMessage("Wrong password. Please try again.")
                    .setPositiveButton("OK") {dialog, which ->

                    }
                val dialog = builder.create()
                dialog.show()


            }
                else{
                    val intent = Intent(this, LogInActivity::class.java).apply{
                        putExtra("username", textUsername.text.toString())
                    }
                    startActivity(intent)
            }
        }
    }
}