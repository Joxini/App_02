package com.example.app_02

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import java.nio.file.attribute.AclEntry.Builder

class pagina_3 : AppCompatActivity(), CalendarView.OnDateChangeListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina3)

        val calendarView: CalendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(this);


    }

    override fun onSelectedDayChange(view: CalendarView, year: Int, month: Int, dayOfMonth: Int) {
        val builder = AlertDialog.Builder(this);
        val items = arrayOf("","","");
        items[0]="Agregar evento";
        items[1] = "Ver eventos";
        items[2] = "Cancelar";

        builder.setTitle("Seleccione una tarea")
            .setItems(items) { dialog, which ->
                if(which==0) {
                    val intent = Intent(this, pagina_4::class.java)
                    startActivity(intent)

                    }else if(which==1){
                    val intent = Intent(this, pagina_5::class.java)
                    startActivity(intent)
                    }
                }

        val dialog = builder.create();
        dialog.show();

    }



}

//private operator fun DialogInterface.OnClickListener.invoke(override: Any, any: Any): DialogInterface.OnClickListener? {
//
//}

