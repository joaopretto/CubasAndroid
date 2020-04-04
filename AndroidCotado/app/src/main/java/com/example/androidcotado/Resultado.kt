package com.example.androidcotado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado2)

        if (intent != null) {
            val valorinserido = intent.getStringExtra("ValorInserido")
            val valorspinner = intent.getStringExtra("ValorSpinner")

            val resultado = findViewById<TextView>(R.id.resultado)
            if(valorinserido != null){
                if(valorspinner.toString() == "Dolar"){
                    var valor = valorinserido.toDouble() * 5.30
                    val texto = "valor: $valor"
                    resultado.text = texto
                }
                if(valorspinner.toString() == "Euro"){
                    var valor = valorinserido.toDouble() * 5.70
                    val texto = "valor: $valor"
                    resultado.text = texto
                }
                if(valorspinner.toString() == "Peso"){
                    var valor = valorinserido.toDouble() * 0.082
                    val texto = "valor: $valor"
                    resultado.text = texto
                }
            }
        }
    }
}
