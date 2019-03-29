package com.gordonez.evaluaciones1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Factura extends AppCompatActivity {

    private TextView tUser, tCorreo;
    private Button bShare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        tUser = findViewById(R.id.tv_user);
        tCorreo = findViewById(R.id.tv_email);

        Intent intent = getIntent();

        if (intent != null) {
            if (intent.getAction() == Intent.ACTION_SEND) {
                String foo = intent.getStringExtra(Intent.EXTRA_TEXT);
                Toast.makeText(this, foo, Toast.LENGTH_LONG).show();
            } else {
                tUser.setText(intent.getStringExtra(MainActivity.USUARIO));
                tCorreo.setText(intent.getStringExtra(MainActivity.CORREO));
            }
        }


    }
}
