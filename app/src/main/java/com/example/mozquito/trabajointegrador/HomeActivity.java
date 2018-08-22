package com.example.mozquito.trabajointegrador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private String usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        assignIntentVariable();
        Toast.makeText(this, "Hola " + usuario, Toast.LENGTH_SHORT).show();
    }

    private void assignIntentVariable() {

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            usuario = bundle.getString("usuario");
        }
    }
}
