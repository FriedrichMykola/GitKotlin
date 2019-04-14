package com.example.business.friedrich.kuzan.githubkotlin

data class Mathematician(val mName: String, var mAge: Int) {
    fun increment() : Int = ++mAge
}