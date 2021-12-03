package com.example.guiaboyaca;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.guiaboyaca.datos.Producto;
import com.google.android.gms.maps.model.LatLng;


import java.util.ArrayList;


public class ListFragment extends Fragment {


    ArrayList<Producto> Lugares;

    public ListFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Lugares = new ArrayList<>();

        Producto producto = new Producto();

        producto.setImage(R.drawable.m2);
        producto.setTitulo("Peña de oti");
        producto.setDesc("Peña de oti");
        producto.setLatLng(new LatLng(5.708229892397891, -72.84280578465645));


        Lugares.add(producto);
        Producto producto2 = new Producto();
        producto2.setImage(R.drawable.m1);
        producto2.setTitulo("Some p");
        producto2.setDesc("Some desc");
        producto2.setLatLng(new LatLng(4.570868,4.570868));
        Lugares.add(producto2);


        if(Lugares.size() == 0){
            Toast.makeText(getContext(), "No hay productos agregados", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(this.getContext()).inflate(R.layout.fragment_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(new MyAdapter(this.getContext(),Lugares));


        return view;
    }
}