package com.rafi12.emptyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val dataGambar = arrayOf("https://images.tokopedia.net/img/cache/900/VqbcmM/2021/9/27/47fa325b-cf68-47ce-9e10-7b11755aaa3c.jpg",
                                "https://images.tokopedia.net/img/cache/900/attachment/2018/10/8/153900654759468/153900654759468_6851d83f-8f1d-435b-9a0f-709ced84e7d9.png")

        val dataJudul = arrayOf("Hoodie Putih", "Digital Piano")

        val dataSubjudul = arrayOf("45k+", "1k+")

        val rvitem:RecyclerView = findViewById(R.id.rv_item)
        rvitem.adapter = AdapterRecyclerView(this, dataGambar, dataJudul, dataSubjudul)
        rvitem.layoutManager = LinearLayoutManager(this)
        rvitem.setHasFixedSize(true)
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