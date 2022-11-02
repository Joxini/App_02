package  com.example.app_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class pagina_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina4)

        val NombreEvento: EditText = findViewById(R.id.edtNombreEvento)
        val Ubicacion: EditText = findViewById(R.id.edtUbicacion)
        val fechadesde: EditText = findViewById(R.id.edtFechaDesde)
        val fechahasta: EditText = findViewById(R.id.edtFechaHasta)
        val horadesde: EditText = findViewById(R.id.edtHoraInicio)
        val horahasta: EditText = findViewById(R.id.edtHoraHasta)
        val descripcion: EditText = findViewById(R.id.edtDescripcion)

        val bundle = intent.extras;
        bundle?.getInt("dia");
        bundle?.getInt("mes");
        bundle?.getInt("anio");
        val dia = 0
        val mes = 0
        val anio = 0
        fechadesde.setText(" " + dia +" - " + mes + " - " + anio + " - ");
        fechahasta.setText(" " + dia +" - " + mes + " - " + anio + " - ");
        val guardar: Button = findViewById(R.id.btnGuardar)
        val cancelar: Button = findViewById(R.id.btnCancelar)

//        guardar.setOnClickListener(this);
//        cancelar.setOnClickListener(this);

        //LLamado de la segunda pagina
        val btn4: Button = findViewById(R.id.btnCancelar)

        btn4.setOnClickListener {
            val intent: Intent = Intent(this, pagina_3::class.java)
            startActivity(intent)
        }

        val btn5: Button = findViewById(R.id.btnGuardar)

        btn5.setOnClickListener {
            val intent: Intent = Intent(this, pagina_3::class.java)
            startActivity(intent)
        }

    }



}



