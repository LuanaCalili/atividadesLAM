package com.example.alunos.intentimplicita;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirUrl(View v) {
        EditText url = (EditText) findViewById(R.id.txtUrl);
        String aURL = url.getText().toString();
        if(aURL.matches("")) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Digite um endereço web...", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        Intent intencao = new Intent(Intent.ACTION_VIEW, Uri.parse(aURL.toLowerCase()));
        startActivity(intencao);
    }
}
