package com.gordonez.evaluaciones1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private EditText eCorreo, eUsuario;
    private LinearLayout lProducto1, lProducto2, lProducto3, lProducto4, lProducto5, lProducto6, lProducto7, lProducto8,lProducto9;

    public static final String USUARIO = "usuario";
    public static final String CORREO = "correo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.bt_enviar);
        eCorreo = findViewById(R.id.et_correo);
        eUsuario = findViewById(R.id.et_usuario);


        mButton.setOnClickListener(v ->{

            String usuario = eUsuario.getText().toString();
            String correo = eCorreo.getText().toString();

            Intent mIntent = new Intent(MainActivity.this, Factura.class);

            mIntent.putExtra(USUARIO, usuario);
            mIntent.putExtra(CORREO, correo);

            startActivity(mIntent);

        });

    }


}
