package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class ClientNotif :ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.client_notif_tab)
    }

    fun clientHome(view: View){
        val intent = Intent(this, ClientDashboard::class.java)
        startActivity(intent)
    }

    fun clientProfile(view: View){
        val intent = Intent(this, ClientProfile::class.java)
        startActivity(intent)
    }

    fun checkRead(view: View){
        Toast.makeText(this, "No read notifs", Toast.LENGTH_SHORT).show()
    }
    
    fun checkUnread(view: View){
        Toast.makeText(this, "No unread notifs", Toast.LENGTH_SHORT).show()
        
    }
    
    fun checkAll(view: View){
        Toast.makeText(this, "All notifs has been displayed", Toast.LENGTH_SHORT).show()
    }
}