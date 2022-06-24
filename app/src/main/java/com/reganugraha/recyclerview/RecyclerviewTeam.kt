package com.reganugraha.recyclerview

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.reganugraha.recyclerview.adapter.AdapterTeamBola
import com.reganugraha.recyclerview.databinding.ActivityMainBinding
import com.reganugraha.recyclerview.model.pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listpemain = ArrayList<pemain>()
        listpemain.add(pemain( "Karim Benzema", R.drawable.benzema,"Penyerang", "1,85 m", "Lyon (Prancis)","1984"))
        listpemain.add(pemain("Marcello",R.drawable.img,"Belakang","1,74 m", "Brazil","1987"))
        listpemain.add(pemain("Sergio Ramos",R.drawable.ramos,"Belakang","1,84 m","Spain","1986"))

        binding.list.adapter = AdapterTeamBola(this,listpemain,object : AdapterTeamBola.OnClickListener {
            override fun detailData(item: pemain?) {
                TODO("Not yet implemented")
            }
        })
    }
}