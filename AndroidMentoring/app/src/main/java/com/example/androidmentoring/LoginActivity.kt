package com.example.androidmentoring

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidmentoring.databinding.ActivityLoginBinding
import com.example.androidmentoring.databinding.ActivitySignUpBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignup.setOnClickListener {
            Toast.makeText(this,
                "회원가입 화면으로 전환합니다.", Toast.LENGTH_SHORT)
                .show()
            val intent = Intent(this, SignUpActivity::class.java)
            intent.putExtra("종이","100")
            startActivity(intent)
        }
        binding.junseobutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            
        }
    }
}