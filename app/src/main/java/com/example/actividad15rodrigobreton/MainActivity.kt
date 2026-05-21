package com.example.actividad15rodrigobreton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.actividad15rodrigobreton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvwNews.layoutManager = LinearLayoutManager(this)
        binding.rvwNews.adapter = NoticiaAdapter(getNews())
    }

    private fun getNews(): List<Noticia> {
        val lista = mutableListOf<Noticia>()
        for (i in 1..50) {
            lista.add(Noticia("Noticia $i", "Descripción de la noticia $i"))
        }
        return lista
    }
}