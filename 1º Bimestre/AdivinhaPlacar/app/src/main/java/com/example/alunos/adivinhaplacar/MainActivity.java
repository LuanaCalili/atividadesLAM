package com.example.alunos.adivinhaplacar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Confirma() {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        int x = gerador.nextInt(1000) + 1;


        int a;
        int t;
        t = 0;


            EditText userInput = findViewById(R.id.editText);
            String teste = userInput.getText().toString();
            a = Integer.parseInt(teste);

        while(a != x) {
            if (a < x) {
                TextView etiqueta = (TextView) findViewById(R.id.Resultado);
                etiqueta.setText(getResources().getString(R.string.lblResultado3));
            } else if (a > x) {
                TextView etiqueta = (TextView) findViewById(R.id.Resultado);
                etiqueta.setText(getResources().getString(R.string.lblResultado4));
            }
            t++;
        }
        if (a == x) {
            TextView etiqueta = (TextView) findViewById(R.id.Resultado);
            etiqueta.setText(getResources().getString(R.string.lblResultado2));
            t++;
        }


        }


}
