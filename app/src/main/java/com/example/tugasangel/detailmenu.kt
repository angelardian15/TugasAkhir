package com.example.tugasangel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageButton
import com.google.android.material.bottomsheet.BottomSheetBehavior

class detailmenu : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailmenu)

       var sheet = findViewById<FrameLayout>(R.id.sheet)
        BottomSheetBehavior.from(sheet).apply {
            peekHeight= 1230
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }

        val back: ImageButton = findViewById(R.id.back)
        back.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.back->{
                val intent = Intent(this@detailmenu,home1::class.java)
                startActivity(intent)
            }
        }
    }
}