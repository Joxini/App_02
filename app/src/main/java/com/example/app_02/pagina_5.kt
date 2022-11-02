package com.example.app_02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class pagina_5 : AppCompatActivity(), View.OnLongClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina5)
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf( "Nota #1","Nota #2",
        "Nota #3","Nota #4","Nota #5","Nota #6","Nota #7","Nota #8","Nota #9","Nota #10","Nota #11","Nota #12","Nota #13","Nota #14","Nota #15","Nota #16")

        // access the listView from xml file
        val mListView = findViewById<ListView>(R.id.ltListaEventos)
        mListView.setOnLongClickListener(this)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users )
        mListView.adapter = arrayAdapter

    }


    override fun onLongClick(v: View?): Boolean {
        val builder = AlertDialog.Builder(this);
        val items2 = arrayOf("","");
        items2[0]="Eliminar evento";
        items2[1] = "Cancelar";
        builder.setTitle("Eliminar Evento").setItems(items2) { dialog, which ->
                if (which == 0) {
                    val intent = Intent(this, pagina_4::class.java)
                    startActivity(intent)

                } else if (which == 1) {
                    val intent = Intent(this, pagina_5::class.java)
                    startActivity(intent)
                }
            }
        val dialog = builder.create();
        dialog.show();
        return false
    }
}

