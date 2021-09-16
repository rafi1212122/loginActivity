package com.rafi12.emptyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class LoginActivity : AppCompatActivity() {
    private lateinit var dataEmail: Array<String>
    private lateinit var dataPass: Array<String>
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editEmail:EditText = findViewById((R.id.mail_input))
        val editPassword:EditText = findViewById((R.id.pass_input))

        val loginBtn:Button = findViewById(R.id.login_btn)
        val registerBtn:Button = findViewById(R.id.reg_btn)

        val showPass:CheckBox = findViewById(R.id.show_pass)
        val remember:CheckBox = findViewById(R.id.rember)

        progressBar = findViewById(R.id.prog_bar)

        dataEmail= arrayOf("rafi1212122@outlook.com", "abdurachmanrafi394@gmail.com")
        dataPass = arrayOf("12345678", "1234567890")

        loginBtn.setOnClickListener {
            progressBar?.visibility = View.VISIBLE
            auth(editEmail.text.toString(),editPassword.text.toString())
        }

        registerBtn.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    fun auth(email:String,password:String){
        for (i in dataEmail.indices){
            val getEmailData = dataEmail.get(i)
            val getPassData = dataPass.get(i)
            if (getEmailData == email && getPassData == password){
                Toast.makeText(this, "Logged in", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, HomeActivity::class.java))
                break
            }else{
                Toast.makeText(this, "Salah", Toast.LENGTH_SHORT).show()
            }

        }
        progressBar?.visibility = View.GONE
    }
}