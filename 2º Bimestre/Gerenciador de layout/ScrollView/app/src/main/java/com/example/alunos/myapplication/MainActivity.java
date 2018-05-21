package com.example.alunos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = new TextView();
        text.setText("Texto do rótulo");
        text.setTextColor(getResources().getColor(R.color.textoDestacado));
        text.setTextAppearance(this,R.style.estiloExemplo);
    }
}

