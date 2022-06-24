package com.reganugraha.recyclerview

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.reganugraha.recyclerview.model.pemain

class MainActivity : AppCompatActivity() {
    override fun detailData(item : pemain?){
        Dialog(this@MainActivity).apply { requestWindowFeature(Window.FEATURE_NO_TITLE)
        setCancelable(true)
        setContentView(R.layout.detail_data_pemain)

        val image = this.findViewById<ImageView>(R.id.image_pemain)
        val nama = this.findViewById<TextView>(R.id.txt_namapemain)
        val posisi = this.findViewById<TextView>(R.id.txt_posisi)
        val tinggi = this.findViewById<TextView>(R.id.txt_tinggibadan)
        val tgllahir = this.findViewById<TextView>(R.id.txt_tanggallahir)
        val btn = this.findViewById<Button>(R.id.btnClose)

        image.setImageResource(item?.foto?:0)
        nama.text = "${item?.nama}"
        posisi.text = "${item?.posisi}"
        tinggi.text = "${item?.tinggi}"
        tgllahir.text = "${tgllahir}"

        btn.setOnClickListener{
            this.dismiss()
        }
        }.show()
    }
}