@file:Suppress("DEPRECATION")

package com.nervagodz.tulonglegal

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nervagodz.tulonglegal.ui.theme.TulongLegalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)
    }


    //login cluster
    fun clientLogin(view: View){
        setContentView(R.layout.client_dashboard)
    }
    //lawyer side login
    fun lawyerLogin(view: View){
        setContentView(R.layout.login_page_lawyer)
    }
    //end of login cluster

    //register cluster
    fun register(view: View){
        setContentView(R.layout.register_front) // front page
    }

    //if client registers
    fun registerClient(view: View){
        setContentView(R.layout.register_client)
    }

    //if lawyer registers
    fun registerLawyer(view: View){
        setContentView(R.layout.register_lawyer)
    }
    //end of register cluster

    //client side widgets
    //client checks legal documents
    fun legalDocu(view: View){
        setContentView(R.layout.client_legal_docu_lib)
    }
    //client matches for laywer
    fun lookForLawyer(view: View){
        setContentView(R.layout.client_match_screen)
    }

    //bottom toolbar
    fun checkNotifs(view: View){ //check notifs
        setContentView(R.layout.notif_tab)
    }

    fun checkProfile(view: View){ //check profile
        setContentView(R.layout.client_profile)
    }

    fun toHome(view: View){
        setContentView(R.layout.client_dashboard)
    }
    //end of client side widgets

    //laywer side

    fun lawyerHome(view: View){
        setContentView(R.layout.lawyer_dashboard)
    }

    fun addLawyerevent(view: View){
        setContentView(R.layout.lawyer_add_new_event)
    }

    fun checkNotifsLawyer(view: View){
        setContentView(R.layout.notif_tab)
    }
 // camil gracceeeeeeeeeeeee//
}



