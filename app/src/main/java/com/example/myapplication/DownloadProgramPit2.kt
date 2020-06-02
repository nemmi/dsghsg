package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.LinearLayout
import android.widget.ScrollView
import kotlinx.android.synthetic.main.activity_download_program_pit.*
import kotlinx.android.synthetic.main.activity_download_program_pit2.*
import kotlinx.android.synthetic.main.activity_download_program_pit2.imageButton17
import kotlinx.android.synthetic.main.activity_download_program_pit2.imageButton18
import kotlinx.android.synthetic.main.activity_download_program_pit2.imageButton19
import kotlinx.android.synthetic.main.activity_download_program_pit2.imageButton20
import kotlinx.android.synthetic.main.activity_download_program_pit2.sunday
import kotlinx.android.synthetic.main.activity_download_program_pit2.monday2

class DownloadProgramPit2 : AppCompatActivity() {

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
        setContentView(R.layout.activity_download_program_pit2)

    monday2.setOnClickListener { val first=Intent(this, DownloadProgramPit::class.java)
        startActivity(first)}
    imageButton20.setOnClickListener { val first=Intent(this, DownloadProgramPit3::class.java)
        startActivity(first)}

        imageButton19.setOnClickListener { val four=Intent(this, DownloadProgramPit4::class.java)
            startActivity(four)}

        imageButton18.setOnClickListener { val five=Intent(this, DownloadProgramPit5::class.java)
            startActivity(five)}

        imageButton17.setOnClickListener { val six=Intent(this, DownloadProgramPit6::class.java)
            startActivity(six)}

        sunday.setOnClickListener { val seven=Intent(this, DownloadProgramPit7::class.java)
            startActivity(seven)}

        imageButton162.setOnClickListener { val backtotrener=Intent(this, ProfileTrener::class.java)
            startActivity(backtotrener)}

        imageButton30.setOnClickListener { val Client= Intent(this, ListClient::class.java)
            startActivity(Client)}

        imageButton29.setOnClickListener { val Client= Intent(this, SpisocChatov::class.java)
            startActivity(Client)}

        imageButton31.setOnClickListener { val Client= Intent(this, ProfileClientView::class.java)
            startActivity(Client)}

    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }
}
