package com.example.panduanmakansehatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PendomanGiziSeimbang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendoman_gizi_seimbang);

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.idpedomangizi1);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PendomanGiziSeimbang.this, Menu3_1Activity.class);
                startActivity(intent);

            }
        });

        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.idpedomangizi2);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PendomanGiziSeimbang.this, Menu3_2Activity.class);
                startActivity(intent);

            }
        });

        LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.idpedomangizi3);
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PendomanGiziSeimbang.this, Menu3_3Activity.class);
                startActivity(intent);

            }
        });

        LinearLayout linearLayout4 = (LinearLayout)findViewById(R.id.idpedomangizi4);
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PendomanGiziSeimbang.this, Menu3_4Activity.class);
                startActivity(intent);

            }
        });

        LinearLayout linearLayout5 = (LinearLayout)findViewById(R.id.idpedomangizi5);
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PendomanGiziSeimbang.this, Menu3_5Activity.class);
                startActivity(intent);

            }
        });

        LinearLayout linearLayout6 = (LinearLayout)findViewById(R.id.idpedomangizi6);
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PendomanGiziSeimbang.this, Menu3_6Activity.class);
                startActivity(intent);

            }
        });
    }
}
