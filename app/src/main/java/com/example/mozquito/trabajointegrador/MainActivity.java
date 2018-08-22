package com.example.mozquito.trabajointegrador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUsuario;
    private EditText etContraseña;
    private Button btnIniciarsesion;
    private Button btnCrearUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUi();

    }

    private void setupUi() {
        etUsuario = findViewById(R.id.etUsuario);
        etContraseña = findViewById(R.id.etContraseña);
        btnIniciarsesion = findViewById(R.id.btnIniciarSesion);
        btnCrearUsuario = findViewById(R.id.btnCrearUsuario);

        btnIniciarsesion.setOnClickListener(this);
        btnCrearUsuario.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        int id = v.getId();

        if (id == R.id.btnIniciarSesion) {
            iniciarSesion();
        } else if (id == R.id.btnCrearUsuario) {
            Toast.makeText(this, "Cear Usuario", Toast.LENGTH_SHORT).show();
        }


    }

    private void iniciarSesion() {

        String usuario = etUsuario.getText().toString();
        String contraseña = etContraseña.getText().toString();

        if (usuario.isEmpty() || contraseña.isEmpty()) {
            Toast.makeText(this, "Completar los campos", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);

            intent.putExtra("usuario", usuario);
            intent.putExtra("contraseña", contraseña);

            startActivity(intent);


        }
    }
}
