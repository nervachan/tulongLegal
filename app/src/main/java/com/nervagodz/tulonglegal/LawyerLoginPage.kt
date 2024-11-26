package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class LawyerLoginPage: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page_lawyer)
    }


    fun lawyerLogin(view: View){
        val intent = Intent(this, LawyerDashboard::class.java)
        startActivity(intent)
    }

    fun lawyerRegister(view: View){
        val intent = Intent(this, RegisterLawyer::class.java)
        startActivity(intent)
    }

    fun changeLoginToClient(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}