package com.example.panduanmakansehatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AngkaKecukupanGiziActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka_kecukupan_gizi);

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.idangkagizi1);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AngkaKecukupanGiziActivity.this, Menu2_13Activity.class);
                startActivity(intent);

            }
        });

        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.idangkagizi2);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AngkaKecukupanGiziActivity.this, Menu2_46Activity.class);
                startActivity(intent);

            }
        });

        LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.idangkagizi3);
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AngkaKecukupanGiziActivity.this, Menu2_79Activity.class);
                startActivity(intent);

            }
        });

        LinearLayout linearLayout4 = (LinearLayout)findViewById(R.id.idangkagizi4);
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AngkaKecukupanGiziActivity.this, Menu2_1012Activity.class);
                startActivity(intent);

            }
        });
    }
}
