package com.brunoleonardo.mypizza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // Action sur le button
    fun goToSecondActivity(view: View) {
        // definition de l'intent pour lancer l'activité 2
        val intent = Intent(this, MainActivity2::class.java)
        // methode pour lancer l'activité 2
        startActivity(intent)
    }


}