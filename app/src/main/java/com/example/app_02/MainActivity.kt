package com.example.app_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtUsuario: EditText = findViewById(R.id.txtUsuario)
        val txtContra: EditText = findViewById(R.id.txtContra)
        val btnValidar: Button = findViewById(R.id.btnValidar)

        btnValidar.setOnClickListener {
            var aplicar = true
            if(txtUsuario.text.toString().trim().isEmpty()){
                Toast.makeText(this,R.string.val_usuario, Toast.LENGTH_SHORT).show()
                txtUsuario.requestFocus()
                aplicar = false
            }else if(txtContra.text.toString().trim().isEmpty()){
                Toast.makeText(this,R.string.val_contra, Toast.LENGTH_SHORT).show()
                txtContra.requestFocus()
                aplicar = false
            }

            if(aplicar){
                //LLamado de la segunda pagina
                val btn2: Button = findViewById(R.id.btnValidar)

                btn2.setOnClickListener {

                    val intent: Intent = Intent(this, pagina_3::class.java)
                    startActivity(intent)
                }
            }
        }
        //LLamado de la segunda pagina
        val btn: Button = findViewById(R.id.btn_registrate)

        btn.setOnClickListener {
            val intent: Intent = Intent(this, pagina_2::class.java)
            startActivity(intent)
        }
    }
}