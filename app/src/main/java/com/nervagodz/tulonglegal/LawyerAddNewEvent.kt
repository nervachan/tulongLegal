package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class LawyerAddNewEvent : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lawyer_add_new_event)
    }
    
    fun addNewEvent(view: View){
        Toast.makeText(this, "Event has been Added", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, LawyerDashboard::class.java)
        startActivity(intent)
    }
    
}