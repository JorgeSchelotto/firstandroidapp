package com.example.mozquito.trabajointegrador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;

import static com.example.mozquito.trabajointegrador.R.id.lvContactos;

public class HomeActivity extends AppCompatActivity {

    private String usuario;
    private ListView lvContactos;
    private List<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        createContactos();
        initializeListView();

        assignIntentVariable();
        Toast.makeText(this, "Hola " + usuario, Toast.LENGTH_SHORT).show();
    }

    private void initializeListView() {
        lvContactos = findViewById(R.id.lvContactos);
        final ContactosAdapter adapter = new ContactosAdapter(contactos);
        lvContactos.setAdapter(adapter);
        lvContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contacto contacto = (Contacto) adapter.getItem(position);
                Toast.makeText(HomeActivity.this, "Hola " + contacto.getNombre(), Toast.LENGTH_SHORT).show();

            }


        });

        lvContactos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Contacto contacto = (Contacto) adapter.getItem(position);
                adapter.removeContacto(contacto);
                Toast.makeText(HomeActivity.this, "Se elimino el contacto", Toast.LENGTH_SHORT).show();
                return true;
            }
        });


    }

    private void createContactos() {
        contactos = new ArrayList<>();
        contactos.add(new Contacto(123456, "Jorge", "Schelotto"));
        contactos.add(new Contacto(456789, "Rodolfo", "Schelotto"));
        contactos.add(new Contacto(789456, "Jorge", "Schelotto"));
        contactos.add(new Contacto(456123, "Camila", "Schelotto"));
        contactos.add(new Contacto(159951, "Eugenia", "Schelotto"));
        contactos.add(new Contacto(357753, "Carlos", "Schelotto"));
        contactos.add(new Contacto(123456, "Jorge", "Schelotto"));
        contactos.add(new Contacto(456789, "Rodolfo", "Schelotto"));
        contactos.add(new Contacto(789456, "Jorge", "Schelotto"));
        contactos.add(new Contacto(456123, "Camila", "Schelotto"));
        contactos.add(new Contacto(159951, "Eugenia", "Schelotto"));
        contactos.add(new Contacto(357753, "Carlos", "Schelotto"));


    }

    private void assignIntentVariable() {

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            usuario = bundle.getString("usuario");
        }
    }
}
