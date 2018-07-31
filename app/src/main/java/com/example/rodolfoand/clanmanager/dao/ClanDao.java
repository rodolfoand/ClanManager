package com.example.rodolfoand.clanmanager.dao;

import android.util.Log;

import com.example.rodolfoand.clanmanager.models.Clan;
import com.example.rodolfoand.clanmanager.util.JSONParser;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ClanDao {

    public static ClanDao instance = new ClanDao();

    private int code;
    private String json;
    private String url = "https://api.royaleapi.com/clan/";

    private ClanDao() {
    }

    public Clan getClan(String tag){
        Clan clan = null;

        try {
            json = new JSONParser.Consultar(url + tag, new JSONParser.DataCallBack() {
                @Override
                public void setResponse(int code, String json) {
                    Log.d("ClanDao", code + "");
                }
            }).execute().get();
            if (json != null) {
                ObjectMapper mapper = new ObjectMapper();
                clan = mapper.readValue(new StringReader(json), Clan.class);
            }
        } catch (Exception e){
            Log.d("ClanDao", e.toString());
        }
        return clan;
    }

    public List<Clan> getList(){

        Clan clan = instance.getClan("8g90080j");
        List<Clan> list = new ArrayList<>();
        list.add(instance.getClan("8g90080j"));


        return list;
    }
}
