package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class ClientMatchScreen: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.client_match_screen)

    }

    fun clientHome(view: View){
        val intent = Intent(this, ClientDashboard::class.java)
        startActivity(intent)
    }

    fun clientProfile(view: View){
        val intent = Intent(this, ClientProfile::class.java)
        startActivity(intent)
    }

    fun clientNotif(view: View){
        val intent = Intent(this, ClientNotif::class.java)
        startActivity(intent)
    }
    
    fun clientMatch(view: View){
        Toast.makeText(this, "No Lawyers Found, Go to their office now -John Perry Pakingan", Toast.LENGTH_SHORT).show()
    }
}