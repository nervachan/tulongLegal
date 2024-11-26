package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class ClientLegalDocu:ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.client_legal_docu_lib)
    }

    fun clientHome(view: View){
        val intent = Intent(this, ClientDashboard::class.java)
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