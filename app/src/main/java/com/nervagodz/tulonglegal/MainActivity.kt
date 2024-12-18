@file:Suppress("DEPRECATION")

package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.client_login_page)
    }

    fun loginClient(view: View){
        val intent = Intent(this, ClientDashboard::class.java)
        startActivity(intent)
    }

    fun changeLoginToLawyer(view: View){
        val intent = Intent(this, LawyerLoginPage::class.java)
        startActivity(intent)

    }

    fun registerAccount(view: View){
        val intent = Intent(this, ClientRegister::class.java)
        startActivity(intent)

    }
}



