package com.example.menuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.change_theclasses, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home -> {
                Toast.makeText(this,"You Already There",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.help -> {
                startActivity(Intent(this,HelpActivity::class.java))
                return true
            }
            R.id.about -> {
                startActivity(Intent(this,AboutActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}