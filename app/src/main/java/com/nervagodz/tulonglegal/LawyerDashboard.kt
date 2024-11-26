package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class LawyerDashboard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lawyer_dashboard)
    }

    fun checkLaywerNotif(view: View) {
        val intent = Intent(this, LawyerNotif::class.java)
        startActivity(intent)

    }

    fun checkLawyerProfile(view: View) {
        val intent = Intent(this, LawyerProfile::class.java)
        startActivity(intent)
    }

    fun addNewEvent(view: View){
        val intent = Intent(this, LawyerAddNewEvent::class.java)
        startActivity(intent)
    }
}