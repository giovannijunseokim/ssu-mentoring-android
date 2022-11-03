package com.example.androidmentoring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidmentoring.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}