package com.example.cocteleriamerynos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocteleriamerynos.databinding.ActivityPage2InfoCocteleriaBinding

class Page2InfoCocteleria : AppCompatActivity() {
    private lateinit var binding: ActivityPage2InfoCocteleriaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage2InfoCocteleriaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.volverButton.setOnClickListener{
            finish()
        }
        binding.accesoInvitado.setOnClickListener {

            val intent = Intent(this, CreateCoctailActivity::class.java)
            startActivity(intent)
        }
    }
}