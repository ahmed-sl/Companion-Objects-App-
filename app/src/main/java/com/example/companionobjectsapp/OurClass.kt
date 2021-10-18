package com.example.companionobjectsapp

import android.view.View
// step 1 create classes
class OurClass {
// step 2 chose what we need to make fun or varibal our poth

    companion object  {
        val nghit = 0
        val day = 1

        fun createBK(layout: View, time: Int) {

           when(time){

               0 -> {layout.setBackgroundResource(R.drawable.night)}
               1 -> {layout.setBackgroundResource(R.drawable.day)}
           }
        }
    }
}