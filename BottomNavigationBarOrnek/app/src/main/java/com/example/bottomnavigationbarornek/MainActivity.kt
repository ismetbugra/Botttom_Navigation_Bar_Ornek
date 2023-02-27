package com.example.bottomnavigationbarornek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val home=HomeFragment()
        val settings=SettingsFragment()
        val account=AccountFragment()

        bottomNavigationBar.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home-> fragmentDegis(home)
                R.id.settings->fragmentDegis(settings)
                R.id.account-> fragmentDegis(account)
            }
            true
        }

        }
    fun fragmentDegis(fragment:Fragment){
        val fragmentManager=supportFragmentManager
        val transaction=fragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView,fragment).commit()
    }

    }


