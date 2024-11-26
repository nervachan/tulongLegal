package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class LawyerProfile: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lawyer_profile)
    }

    fun editProfile(view: View){
        Toast.makeText(this, "Feature has been Deprecated :)", Toast.LENGTH_SHORT).show()
    }

    fun LawyerDashboard(view: View) {
        val intent = Intent(this, LawyerDashboard::class.java)
        startActivity(intent)
    }

    fun lawyerNotif(view: View) {
        val intent = Intent(this, LawyerNotif::class.java)
        startActivity(intent)

    }
}