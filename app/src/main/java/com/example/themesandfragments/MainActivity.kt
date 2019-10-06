package com.example.themesandfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.title="TOOLBAR"
        button.setOnClickListener {
            startActivity(Intent(this,Main2Activity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =when(item.itemId){
        R.id.me ->{
            Toast.makeText(this,"Menu Selected",Toast.LENGTH_LONG).show()
            true
        }
        R.id.settings->{
            Toast.makeText(this,"Settings Opened",Toast.LENGTH_LONG).show()
            true
        }
        else->super.onOptionsItemSelected(item)
    }
}

