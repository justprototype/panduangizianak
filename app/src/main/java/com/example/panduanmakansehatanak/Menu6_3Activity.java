package com.example.panduanmakansehatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Menu6_3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu6_3);

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.idresep1);
        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.idresep2);
        LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.idresep3);
        LinearLayout linearLayout4 = (LinearLayout)findViewById(R.id.idresep4);
        LinearLayout linearLayout5 = (LinearLayout)findViewById(R.id.idresep5);
        LinearLayout linearLayout6 = (LinearLayout)findViewById(R.id.idresep6);
        LinearLayout linearLayout7 = (LinearLayout)findViewById(R.id.idresep7);
        LinearLayout linearLayout8 = (LinearLayout)findViewById(R.id.idresep8);
        LinearLayout linearLayout9 = (LinearLayout)findViewById(R.id.idresep9);
        LinearLayout linearLayout10 = (LinearLayout)findViewById(R.id.idresep10);

        LinearLayout linearLayout11 = (LinearLayout)findViewById(R.id.idresep11);
        LinearLayout linearLayout12 = (LinearLayout)findViewById(R.id.idresep12);
        LinearLayout linearLayout13 = (LinearLayout)findViewById(R.id.idresep13);
        LinearLayout linearLayout14 = (LinearLayout)findViewById(R.id.idresep14);
        LinearLayout linearLayout15 = (LinearLayout)findViewById(R.id.idresep15);
        LinearLayout linearLayout16 = (LinearLayout)findViewById(R.id.idresep16);
        LinearLayout linearLayout17 = (LinearLayout)findViewById(R.id.idresep17);
        LinearLayout linearLayout18 = (LinearLayout)findViewById(R.id.idresep18);
        LinearLayout linearLayout19 = (LinearLayout)findViewById(R.id.idresep19);
        LinearLayout linearLayout20 = (LinearLayout)findViewById(R.id.idresep20);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep1Activity.class);
                startActivity(intent);
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep2Activity.class);
                startActivity(intent);
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep3Activity.class);
                startActivity(intent);
            }
        });

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep4Activity.class);
                startActivity(intent);
            }
        });

        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep5Activity.class);
                startActivity(intent);
            }
        });


        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep6Activity.class);
                startActivity(intent);
            }
        });

        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep7Activity.class);
                startActivity(intent);
            }
        });

        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep8Activity.class);
                startActivity(intent);
            }
        });

        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep9Activity.class);
                startActivity(intent);
            }
        });

        linearLayout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep10Activity.class);
                startActivity(intent);
            }
        });


        linearLayout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep11Activity.class);
                startActivity(intent);
            }
        });

        linearLayout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep12Activity.class);
                startActivity(intent);
            }
        });

        linearLayout13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep13Activity.class);
                startActivity(intent);
            }
        });

        linearLayout14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep14Activity.class);
                startActivity(intent);
            }
        });

        linearLayout15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep15Activity.class);
                startActivity(intent);
            }
        });


        linearLayout16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep16Activity.class);
                startActivity(intent);
            }
        });

        linearLayout17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep17Activity.class);
                startActivity(intent);
            }
        });

        linearLayout18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep18Activity.class);
                startActivity(intent);
            }
        });

        linearLayout19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep19Activity.class);
                startActivity(intent);
            }
        });

        linearLayout20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu6_3Activity.this, Resep20Activity.class);
                startActivity(intent);
            }
        });



    }
}
