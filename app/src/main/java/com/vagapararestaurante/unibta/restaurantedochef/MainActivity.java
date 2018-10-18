package com.vagapararestaurante.unibta.restaurantedochef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText campoNome;
    private EditText campoSenha;
    private Button logar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome =(EditText) findViewById(R.id.campoSenhaId);
        campoSenha =(EditText) findViewById(R.id.campoNomeId);
        logar =(Button) findViewById(R.id.logarId);

        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoNome = campoNome.getText().toString();
                //String textoSenha = campoSenha.getText().toString();

                startActivity(new Intent(MainActivity.this, MenuActivity.class));
            }
        });







    }
}
