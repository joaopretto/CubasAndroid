package com.example.androidcotado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        option = findViewById(R.id.spinner) as Spinner
        result = findViewById(R.id.textView) as TextView

        val options = arrayOf("Dolar", "Euro", "Peso")
        var selecionado = ""

        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                result.text = "Seleciona a Opção"
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                result.text = options.get(position)
                selecionado = options.get(position)
            }
        }
        botao.setOnClickListener{
            val intencao = Intent(this@MainActivity, Resultado::class.java)
            intencao.putExtra("ValorInserido",valor.text.toString() )
            intencao.putExtra("ValorSpinner",selecionado)
            startActivity(intencao)
        }

    }
}
