package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        box_one_text.setOnClickListener{
            makeColored(it)//"it" mean "this" in java
        }

        box_two_text.setOnClickListener{
            makeColored(it)//"it" mean "this" in java
        }

        box_three_text.setOnClickListener{
            makeColored(it)//"it" mean "this" in java
        }

        box_four_text.setOnClickListener{
            makeColored(it)//"it" mean "this" in java
        }

        box_five_text.setOnClickListener{
            makeColored(it)//"it" mean "this" in java
        }
        
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
        }
    }

}
