package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class ClientProfile:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.client_profile)
    }

    fun clientHome(view: View){
        val intent = Intent(this, ClientDashboard::class.java)
        startActivity(intent)
    }
    
    fun clientNotif(view: View){
        val intent = Intent(this, ClientNotif::class.java)
        startActivity(intent)
    }
    
    fun editProfile(view: View){
        Toast.makeText(this, "Feature has been Deprecated", Toast.LENGTH_SHORT).show()
    }


}