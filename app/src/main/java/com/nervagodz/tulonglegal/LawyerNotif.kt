package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class LawyerNotif: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lawyer_notif_tab)
    }

    fun LawyerDashboard(view: View) {
        val intent = Intent(this, LawyerDashboard::class.java)
        startActivity(intent)
    }

    fun LawyerProfile(view: View) {
        val intent = Intent(this, LawyerProfile::class.java)
        startActivity(intent)
    }

    fun checkAllNotifs(view: View){
        Toast.makeText(this, "Displaying all Notifications", Toast.LENGTH_SHORT).show()
    }

    fun checkUnreadNotifs(view: View){
        Toast.makeText(this, "No unread notifications", Toast.LENGTH_SHORT).show()
    }

    fun checkReadNotifs(view: View){
        Toast.makeText(this, "No read notifications", Toast.LENGTH_SHORT).show()

    }
}