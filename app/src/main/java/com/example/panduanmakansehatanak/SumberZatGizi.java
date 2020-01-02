package com.example.panduanmakansehatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SumberZatGizi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumber_zat_gizi);

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.idsumberzatgizi1);
        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.idsumberzatgizi2);
        LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.idsumberzatgizi3);
        LinearLayout linearLayout4 = (LinearLayout)findViewById(R.id.idsumberzatgizi4);
        LinearLayout linearLayout5 = (LinearLayout)findViewById(R.id.idsumberzatgizi5);


        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SumberZatGizi.this, Menu4_1Activity.class);
                startActivity(intent);
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SumberZatGizi.this, Menu4_2Activity.class);
                startActivity(intent);
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SumberZatGizi.this, Menu4_3Activity.class);
                startActivity(intent);
            }
        });

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SumberZatGizi.this, Menu4_4Activity.class);
                startActivity(intent);
            }
        });


        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SumberZatGizi.this, Menu4_5Activity.class);
                startActivity(intent);
            }
        });


    }
}
