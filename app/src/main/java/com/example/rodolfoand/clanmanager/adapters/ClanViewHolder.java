package com.example.rodolfoand.clanmanager.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rodolfoand.clanmanager.R;
import com.example.rodolfoand.clanmanager.models.Clan;

public class ClanViewHolder extends RecyclerView.ViewHolder {

    private ClanAdapter clanAdapter;

    private TextView tvNome;

    public ClanViewHolder(@NonNull View itemView, ClanAdapter adapter) {
        super(itemView);
        this.clanAdapter = adapter;
        tvNome = itemView.findViewById(R.id.tvNomeItemClan);

    }

    public void fillClan(Clan clan){
        tvNome.setText(clan.getName());

    }
}
