package com.example.panduanmakansehatanak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class InfoKandunganGizi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_kandungan_gizi);

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add("Bakso");
        list.add("Bihun Goreng");
        list.add("Bubur Ayam");
        list.add("Bubur Kacang Hijau");
        list.add("Gado-gado");
        list.add("Ketoprak");
        list.add("Kupat Tahu");
        list.add("Mie Ayam");
        list.add("Mie Instan");
        list.add("Nasi Goreng");
        list.add("Pecel");
        list.add("Spageti");
        list.add("Ayam Goreng");
        list.add("Burger daging sapi");
        list.add("Donat");
        list.add("Kripik Kentang");
        list.add("Martabak Manis");
        list.add("Martabak Telur");
        list.add("Fanta(250ml)");
        list.add("Coca-cola(250ml)");
        list.add("Sprite(250ml)");
        list.add("Teh Pucuk Harum(240ml)");
        list.add("Nestle Dancow fortigro(125ml)");
        list.add("Ultra Milk(125ml)");
        list.add("Indomilk Kids(230ml)");
        list.add("Ultra mimi kids(125ml)");
        list.add("Wall milky creamy(90ml)");
        list.add("Sprite(250ml)");
        list.add("Sprite(250ml)");
        list.add("Sprite(250ml)");



        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }
}
