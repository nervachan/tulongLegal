package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class ClientDashboard : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.client_dashboard)
    }

    fun laywerMatch(view:View){
        val intent = Intent(this, ClientMatchScreen::class.java)
        startActivity(intent)
    }

    fun legalDocu(view:View){
       val intent = Intent(this, ClientLegalDocu::class.java)
       startActivity(intent)

    }
    fun clientProfile(view: View){
        val intent = Intent(this, ClientProfile::class.java)
        startActivity(intent)
    }

    fun clientNotif(view: View) {
        val intent = Intent(this, ClientNotif::class.java)
        startActivity(intent)
    }

}