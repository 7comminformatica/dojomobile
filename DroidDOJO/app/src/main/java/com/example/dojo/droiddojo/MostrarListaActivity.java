package com.example.dojo.droiddojo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.dojo.droiddojo.adapter.RecyclerViewListaAdapter;
import com.example.dojo.droiddojo.pojo.ItemListaPojo;

import java.util.ArrayList;
import java.util.List;

public class MostrarListaActivity extends AppCompatActivity {

    private RecyclerView recyclerViewListaUsuarios;
    private Context mContext;
    private List<ItemListaPojo> listaMostrada = new ArrayList<ItemListaPojo>();
    private Button btnSortear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_lista);

        recyclerViewListaUsuarios = (RecyclerView) findViewById(R.id.recyclerViewLista);
        btnSortear = (Button) findViewById(R.id.btnSortear);

        adicionarALista();

        btnSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupRecyclerView();
            }
        });


    }

    private void adicionarALista() {
        ItemListaPojo itemListaPojo1 = new ItemListaPojo();
        itemListaPojo1.setId(0);
        itemListaPojo1.setNomeUsuario("joao");
        itemListaPojo1.setData("hoje");

        listaMostrada.add(itemListaPojo1);

        ItemListaPojo itemListaPojo2 = new ItemListaPojo();
        itemListaPojo1.setId(1);
        itemListaPojo1.setNomeUsuario("joao");
        itemListaPojo1.setData("amanha");

        listaMostrada.add(itemListaPojo2);

        ItemListaPojo itemListaPojo3 = new ItemListaPojo();
        itemListaPojo1.setId(2);
        itemListaPojo1.setNomeUsuario("joao");
        itemListaPojo1.setData("hoje");

        listaMostrada.add(itemListaPojo3);

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        RecyclerViewListaAdapter adapter = new RecyclerViewListaAdapter(listaMostrada, mContext);
        recyclerViewListaUsuarios.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewListaUsuarios.setAdapter(adapter);
    }


}
