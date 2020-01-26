package br.edu.infnet.designnavegacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adiciona nossa Toolbar como Action Bar do app
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            // selecionou item com ID "info_item"
            R.id.info_item -> Toast.makeText(this,
                R.string.informacao,
                Toast.LENGTH_LONG).show()
            R.id.home_item-> {
                nav_fragment.findNavController().navigate(R.id.homeFragment)
            }
            R.id.nav_item -> {
                findNavController(R.id.nav_fragment).navigate(R.id.dateFragment)
            }
        }
        return true
    }
}
