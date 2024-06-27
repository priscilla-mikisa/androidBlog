package com.akirachix.blog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)
        displayBlogs()


    }
    fun displayBlogs(){
        val blog1 = Blog("Pris","21-9-2024","I wanted to tell the book thief many things, about beauty and brutality. But what could I tell her about those things that she didn't already know? I wanted to explain that I am constatly overestimating and underestimating the human race-that rarely do I ever simply estimate it. I wanted to ask her how the same thing could be so UGLY an so GLORIUOS, and its words and stories so damning and brilliant.","","The Life we Live","See more...")
        val blog2 = Blog("Pris","21-9-2024","I wanted to tell the book thief many things, bout beauty and brutality. But what could I tell her about those things that she didn't already know? I wanted to explain that I am constatly overestimating and underestimating the human race-that rarely do I ever simply estimate it. I wanted to ask her how the same thing could be so UGLY an so GLORIUOS, and its words and stories so damning and brilliant.","","The Life we Live","See more...")
        val blog3 = Blog("Pris","21-9-2024","I wanted to tell the book thief many things, about beauty and brutality. But what could I tell her about those things that she didn't already know? I wanted to explain that I am constatly overestimating and underestimating the human race-that rarely do I ever simply estimate it. I wanted to ask her how the same thing could be so UGLY an so GLORIUOS, and its words and stories so damning and brilliant.","","The Life we Live","See more...")
        val blog4  = Blog("Pris","21-9-2024","I wanted to tell the book thief many things, about beauty and brutality. But what could I tell her about those things that she didn't already know? I wanted to explain that I am constatly overestimating and underestimating the human race-that rarely do I ever simply estimate it. I wanted to ask her how the same thing could be so UGLY an so GLORIUOS, and its words and stories so damning and brilliant.","","The Life we Live","See more...")
        val blog5 = Blog("Pris","21-9-2024","I wanted to tell the book thief many things, about beauty and brutality. But what could I tell her about those things that she didn't already know? I wanted to explain that I am constatly overestimating and underestimating the human race-that rarely do I ever simply estimate it. I wanted to ask her how the same thing could be so UGLY an so GLORIUOS, and its words and stories so damning and brilliant.","","The Life we Live","See more...")
        val blog6 = Blog("Pris","21-9-2024","I wanted to tell the book thief many things, about beauty and brutality. But what could I tell her about those things that she didn't already know? I wanted to explain that I am constatly overestimating and underestimating the human race-that rarely do I ever simply estimate it. I wanted to ask her how the same thing could be so UGLY an so GLORIUOS, and its words and stories so damning and brilliant.","","The Life we Live","See more...")
        val blog7 = Blog("Pris","21-9-2024","I wanted to tell the book thief many things, about beauty and brutality. But what could I tell her about those things that she didn't already know? I wanted to explain that I am constatly overestimating and underestimating the human race-that rarely do I ever simply estimate it. I wanted to ask her how the same thing could be so UGLY an so GLORIUOS, and its words and stories so damning and brilliant.","","The Life we Live","See more...")
        val blog8 = Blog("Pris","21-9-2024","I wanted to tell the book thief many things, about beauty and brutality. But what could I tell her about those things that she didn't already know? I wanted to explain that I am constatly overestimating and underestimating the human race-that rarely do I ever simply estimate it. I wanted to ask her how the same thing could be so UGLY an so GLORIUOS, and its words and stories so damning and brilliant.","","The Life we Live","See more...")
        val blog9 = Blog("Pris","21-9-2024","I wanted to tell the book thief many things, about beauty and brutality. But what could I tell her about those things that she didn't already know? I wanted to explain that I am constatly overestimating and underestimating the human race-that rarely do I ever simply estimate it. I wanted to ask her how the same thing could be so UGLY an so GLORIUOS, and its words and stories so damning and brilliant.","","The Life we Live","See more...")
        val blog10 = Blog("Pris","21-9-2024","I wanted to tell the book thief many things, about beauty and brutality. But what could I tell her about those things that she didn't already know? I wanted to explain that I am constatly overestimating and underestimating the human race-that rarely do I ever simply estimate it. I wanted to ask her how the same thing could be so UGLY an so GLORIUOS, and its words and stories so damning and brilliant.","","The Life we Live","See more...")




        val blogSite = listOf(blog1,blog2,blog3,blog4,blog5,blog6,blog7,blog8,blog9,blog10)
     val blogAdapter = BlogAdapter(blogSite)
     binding.rvBlogs.adapter = blogAdapter


    }
}