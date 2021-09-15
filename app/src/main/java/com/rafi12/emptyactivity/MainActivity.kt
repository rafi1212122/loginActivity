package com.rafi12.emptyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var dataEmail: Array<String>
    private lateinit var dataPass: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editEmail:EditText = findViewById((R.id.mail_input))
        val editPassword:EditText = findViewById((R.id.pass_input))

        val loginBtn:Button = findViewById(R.id.login_btn)
        val registerBtn:Button = findViewById(R.id.reg_btn)

        val showPass:CheckBox = findViewById(R.id.show_pass)
        val remember:CheckBox = findViewById(R.id.rember)

        dataEmail= arrayOf("rafi1212122@outlook.com", "abdurachmanrafi394@gmail.com")
        dataPass = arrayOf("12345678", "1234567890")

        loginBtn.setOnClickListener {
            auth(editEmail.text.toString(),editPassword.text.toString())
        }
    }

    fun auth(email:String,password:String){
        for (i in dataEmail.indices){
            val getEmailData = dataEmail.get(i)
            val getPassData = dataPass.get(i)
            if (getEmailData == email && getPassData == password){
                Toast.makeText(this, "Logged in", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Salah", Toast.LENGTH_SHORT).show()
            }

        }
    }
}