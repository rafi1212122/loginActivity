package com.rafi12.emptyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.bahasa -> {
//                Toast.makeText(this, "Setting Bahasa", Toast.LENGTH_SHORT).show()
//            }
//            R.id.tampilan -> {
//                Toast.makeText(this, "Setting Tampilan", Toast.LENGTH_SHORT).show()
//            }
//            R.id.logout -> {
//                startActivity(Intent(this, MainActivity::class.java))
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}