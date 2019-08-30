package com.example.bis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBisAdapter extends RecyclerView.Adapter<ListBisAdapter.ListViewHolder> {
    private ArrayList<Bis_Data> BisList;

    public ListBisAdapter(ArrayList<Bis_Data> list) {
        this.BisList = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_bis, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Bis_Data data_mobil =BisList.get(position);
        Glide.with(holder.itemView.getContext()).load(data_mobil.getFoto())
                .apply(new RequestOptions()).override(60, 60)
                .into(holder.fotoBis);

        holder.namaBis.setText(data_mobil.getNama());
        holder.descBis.setText(data_mobil.getDesc());
    }

    @Override
    public int getItemCount() {
        return BisList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoBis;
        TextView namaBis, descBis;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoBis = itemView.findViewById(R.id.foto_bis);
            namaBis = itemView.findViewById(R.id.nama);
            descBis = itemView.findViewById(R.id.desc);

        }
    }
}
