package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_otchet_pitanie5.*

class OtchetPitanie5 : AppCompatActivity() {

    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }

    private fun hideSystemUI() {

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otchet_pitanie5)

         monday5.setOnClickListener { val first=Intent(this, OtchetPitanie::class.java)
     startActivity(first)}

        tuesday5.setOnClickListener { val second= Intent(this, OtchetPitanie2::class.java)
            startActivity(second)}

        imageButton20.setOnClickListener { val third= Intent (this, OtchetPitanie3::class.java)
            startActivity(third)}

        imageButton19.setOnClickListener { val four= Intent(this, OtchetPitanie4::class.java)
            startActivity(four)}

        /*imageButton18.setOnClickListener { val five= Intent(this, OtchetPitanie5::class.java)
            startActivity(five)}*/

        imageButton17.setOnClickListener { val six= Intent(this, OtchetPitanie6::class.java)
            startActivity(six)}

        sunday5.setOnClickListener { val seven= Intent(this, OtchetPitanie7::class.java)
            startActivity(seven)}

        imageButton165.setOnClickListener { val backtotrener= Intent(this, ProfileTrener::class.java)
            startActivity(backtotrener)}

        Clienti.setOnClickListener { val Client= Intent(this, ListClient::class.java)
            startActivity(Client)}

        groupchat.setOnClickListener { val Client= Intent(this, SpisocChatov::class.java)
            startActivity(Client)}

        btn_profileClient.setOnClickListener { val Client= Intent(this, ProfileClientView::class.java)
            startActivity(Client)}

    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }
}
