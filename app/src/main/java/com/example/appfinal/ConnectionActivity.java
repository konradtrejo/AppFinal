package com.example.appfinal;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConnectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);
        TextView bienvenida =(TextView) findViewById(R.id.Bienvenida);
        Button conectar= (Button) findViewById(R.id.conectar);
        String cadena_bienvenida=  getIntent().getStringExtra("username");
        bienvenida.setText("Bienvenido "+ cadena_bienvenida + "al juego");

        ActivityResultLauncher<Intent> startActivityForResult = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == AppCompatActivity.RESULT_OK) {
                        Intent data = result.getData();
                        // ...
                    }
                }
        );
        conectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),GameActivity.class);
                //intent.putExtra("username",username.getText().toString());
                startActivityForResult.launch(intent);
            }
        });
    }
}