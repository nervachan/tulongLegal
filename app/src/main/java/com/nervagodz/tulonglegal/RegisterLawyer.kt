package com.nervagodz.tulonglegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class RegisterLawyer: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_lawyer)

    }

    fun lawyerLogin(view: View){
        val intent = Intent(this, LawyerLoginPage::class.java)
        startActivity(intent)
    }
}