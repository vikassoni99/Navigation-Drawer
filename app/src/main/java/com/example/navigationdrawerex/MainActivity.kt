package com.example.navigationdrawerex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val  actionbar=supportActionBar
        actionbar?.title="Vatsapp"

        val Toggle:ActionBarDrawerToggle=object:ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            (R.string.open),
            (R.string.close)
        ){}
        Toggle.isDrawerIndicatorEnabled=true
        drawer_layout.addDrawerListener(Toggle)
        Toggle.syncState()
        navigationView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.nav_first_fragment-> {
                Toast.makeText(this, "First", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_second_fragment -> {
                Toast.makeText(this, "Second", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_third_fragment -> {
                Toast.makeText(this, "Third", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_fourth -> {
                Toast.makeText(this, "4", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_fifth -> {
                Toast.makeText(this, "5", Toast.LENGTH_SHORT).show()
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}

