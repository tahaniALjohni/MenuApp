package com.example.menuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.change_theclasses, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home -> {
                startActivity(Intent(this,HomeActivity::class.java))
                return true
            }
            R.id.help -> {
                startActivity(Intent(this,HelpActivity::class.java))
                return true
            }
            R.id.about -> {
                Toast.makeText(this,"You Already There", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}