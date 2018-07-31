package com.example.rodolfoand.clanmanager.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rodolfoand.clanmanager.R;
import com.example.rodolfoand.clanmanager.models.Clan;

import java.util.List;

public class ClanAdapter extends RecyclerView.Adapter {


    private Context context;
    private List<Clan> listClan;

    public ClanAdapter(List<Clan> list, Context ctx) {
        this.listClan = list;
        this.context = ctx;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemlist_clan, viewGroup, false);
        ClanViewHolder holder = new ClanViewHolder(view, this);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ClanViewHolder holder = (ClanViewHolder)viewHolder;
        Clan clan = listClan.get(i);
        ((ClanViewHolder) viewHolder).fillClan(clan);

    }

    @Override
    public int getItemCount() {
        return listClan.size();
    }
}
