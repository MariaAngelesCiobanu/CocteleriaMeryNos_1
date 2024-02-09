package com.example.cocteleriamerynos

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cocteleriamerynos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.iniciarSesion.setOnClickListener {

            val intent = Intent(this, Page2InfoCocteleria::class.java)
            startActivity(intent)

        }
        binding.idAniadir.setOnClickListener {

            val intent = Intent(this, CreateCoctailActivity::class.java)
            startActivity(intent)

        }
      /*  binding.idCocteles.setOnClickListener {

            val intent = Intent(this, Page2InfoCocteleria::class.java)
            startActivity(intent)

        }*/
    }
}




