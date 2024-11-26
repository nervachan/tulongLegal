package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class ClientRegister: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_client)
    }
    
    fun registerClient(view: View){
        Toast.makeText(this, "Account has been successfully registered!", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, ClientDashboard::class.java)
        startActivity(intent)
    }
}