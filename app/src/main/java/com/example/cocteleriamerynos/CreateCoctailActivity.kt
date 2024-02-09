package com.example.cocteleriamerynos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cocteleriamerynos.databinding.ActivityCreateCoctailBinding

class CreateCoctailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateCoctailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCoctailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.aniadirBoton.setOnClickListener{
            val name=binding.nombreCocktail.text.toString()
            val price=binding.precioCocktail.text.toString()
            val description=binding.descripcionCocktail.text.toString()
            val cocktail = Cocktail(
                name= name,
                price= price,
                description = description
            )
            Toast.makeText(this, "COCKTAIL AÑADIDO", Toast.LENGTH_SHORT).show()
        }
    }
}