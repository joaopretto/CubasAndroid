package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        float imc;
        Button btCalcular = (Button) findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView) findViewById(R.id.editAltura);
                TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
                TextView tvDescricao = (TextView) findViewById(R.id.tvDescricao);
                int peso = Integer.parseInt(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                imc = peso / (altura * altura);
                if (imc[0]<18.5){
                    tvResultado.setText(imc[0]+"");
                    tvDescricao.setText("Baixo Peso");
                }
                else if(imc[0]<25){
                    tvResultado.setText(imc[0]+"");
                    tvDescricao.setText("Peso Adequado");
                }
                else if(imc[0]<30){
                    tvResultado.setText(imc[0]+"");
                    tvDescricao.setText("Sobrepeso");
                }
                else{
                    tvResultado.setText(imc[0]+"");
                    tvDescricao.setText("Obesidade");
                }
            }
        }):
    }
}
