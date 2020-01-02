package com.example.panduanmakansehatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final String id = getIntent().getStringExtra("id");

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.menu1);
        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.menu2);
        LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.menu3);
        LinearLayout linearLayout4 = (LinearLayout)findViewById(R.id.menu4);
        LinearLayout linearLayout5 = (LinearLayout)findViewById(R.id.menu5);
        LinearLayout linearLayout6 = (LinearLayout)findViewById(R.id.menu6);
        LinearLayout linearLayout7 = (LinearLayout)findViewById(R.id.menu7);
        LinearLayout linearLayout8 = (LinearLayout)findViewById(R.id.menu8);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, CekStatusGiziActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, AngkaKecukupanGiziActivity.class);
                startActivity(intent);
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PendomanGiziSeimbang.class);
                startActivity(intent);
            }
        });

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SumberZatGizi.class);
                startActivity(intent);
            }
        });

        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, InfoKandunganGizi.class);
                startActivity(intent);
            }
        });

        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MenuMakanSehatAnak.class);
                startActivity(intent);
            }
        });

        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, TipsTipsMenarik.class);
                startActivity(intent);
            }
        });
    }
}
