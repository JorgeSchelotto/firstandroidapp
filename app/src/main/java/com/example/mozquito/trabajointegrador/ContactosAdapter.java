package com.example.mozquito.trabajointegrador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


public class ContactosAdapter extends BaseAdapter {

    private List<Contacto> contactos;

    public ContactosAdapter(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public ContactosAdapter() {
    }

    @Override
    public int getCount() {
        return contactos.size();
    }

    @Override
    public Object getItem(int position) {
        return contactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return contactos.get(position).getTelefono();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contacto contacto = (Contacto) getItem(position);

        View viewContacto;
        if (convertView == null) {
           viewContacto = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacto, parent, false);

        } else {

            viewContacto = convertView;
        }

        TextView txtNombre = viewContacto.findViewById(R.id.txtNombre);
        TextView txtApellido = viewContacto.findViewById(R.id.txtApellido);
        TextView txtTelefono = viewContacto.findViewById(R.id.txtTelefono);

        txtNombre.setText(contacto.getNombre());
        txtApellido.setText(contacto.getApellido());
        txtTelefono.setText(String.valueOf(contacto.getTelefono()));

        return viewContacto;
    }

    public void removeContacto(Contacto contacto) {
        contactos.remove(contacto);
        notifyDataSetChanged();
    }
}
