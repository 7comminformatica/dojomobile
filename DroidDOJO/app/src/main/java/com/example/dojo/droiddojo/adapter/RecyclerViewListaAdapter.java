package com.example.dojo.droiddojo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dojo.droiddojo.R;
import com.example.dojo.droiddojo.pojo.ItemListaPojo;

import java.util.List;

public class RecyclerViewListaAdapter extends RecyclerView.Adapter<RecyclerViewListaAdapter.ViewHolder>{

    private List<ItemListaPojo> listaItemPojo;
    private Context mContext;

    public RecyclerViewListaAdapter(List<ItemListaPojo> listaItemPojo, Context mContext) {
        this.listaItemPojo = listaItemPojo;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_content_item, viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ItemListaPojo item = listaItemPojo.get(i);

        viewHolder.nomeMostrado.setText(item.getNomeUsuario());
        viewHolder.dataMostarda.setText(item.getData());
    }

    @Override
    public int getItemCount() {
        return listaItemPojo.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nomeMostrado;
        private TextView dataMostarda;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeMostrado = (TextView) itemView.findViewById(R.id.nomeMostardo);
            dataMostarda = (TextView) itemView.findViewById(R.id.dataMostrada);
        }
    }
}
