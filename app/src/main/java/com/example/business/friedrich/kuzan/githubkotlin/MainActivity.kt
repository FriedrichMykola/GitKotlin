package com.example.business.friedrich.kuzan.githubkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val mRectangle: Rectangle = Rectangle(12.6f, 30.3f)
    lateinit var mSquare: Square

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSquare = Square(12.5f)
        println(mRectangle.mArea)
    }
}
