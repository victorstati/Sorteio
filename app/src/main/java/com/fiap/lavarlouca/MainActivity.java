package com.fiap.lavarlouca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearLouca(View view){
        TextView sorteado = (TextView) findViewById(R.id.felicitadoLouca);
        int numero = new Random().nextInt(3);
        String nome;
        switch (numero){
            case 0:
                //nome = "Rogério";
                sorteado.setText("Sorteado é Rogério");
                break;
            case 1:
                //nome = "Luiz";
                sorteado.setText("Sorteado é Luiz");
                break;
            case 2:
                //nome = "Elisa";
                sorteado.setText("Sorteado é Elisa");
                break;
            default:
                //nome="ninguém";
                sorteado.setText("Sorteado é ninguém");
                break;
        }
        sorteado.setText("Sorteado é: "+ numero);
    }
}
