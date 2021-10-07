package learn.idn.beginingproject

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

        val dataGambar = arrayOf("https://cdn-icons-png.flaticon.com/512/149/149071.png",
            "https://cdn-icons-png.flaticon.com/512/149/149071.png")

        val dataJudul = arrayOf("PayPal", "Cashapp")

        val dataSubjudul = arrayOf("PayPal: Your security code is: 875393. It expires in 10 minutes. Don't share this code with anyone.", "Cash App: (201) 857-7757 has been unlinked from your Cash App account")

        val dataTanggal = arrayOf("28 Sep", "27 Sep")

        val rvitem:RecyclerView = findViewById(R.id.rv_item)
        rvitem.adapter = AdapterRecyclerView(this, dataGambar, dataJudul, dataTanggal, dataSubjudul)
        rvitem.layoutManager = LinearLayoutManager(this)
        rvitem.setHasFixedSize(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.bahasa -> {
                Toast.makeText(this, "Pengaturan Bahasa", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.tampilan -> {
                Toast.makeText(this, "Pengaturan Tampilan", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.logout -> {
                startActivity(Intent(this, LoginActivity::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}