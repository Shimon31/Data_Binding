package com.example.simpledatabinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.simpledatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val mUser = User("Shimon","shimon@gmail.com")
        val mPost = Post("This is Title","This is a Description")

        binding.apply {
            user= mUser
            post= mPost
        }

    }
}