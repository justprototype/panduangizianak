package com.example.panduanmakansehatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class TipsTipsMenarik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_tips_menarik);

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.idtips1);
        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.idtips2);
        LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.idtips3);
        LinearLayout linearLayout4 = (LinearLayout)findViewById(R.id.idtips4);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipsTipsMenarik.this, Menu7_1Activity.class);
                startActivity(intent);
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipsTipsMenarik.this, Menu7_2Activity.class);
                startActivity(intent);
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipsTipsMenarik.this, Menu7_3Activity.class);
                startActivity(intent);
            }
        });

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipsTipsMenarik.this, Menu7_4Activity.class);
                startActivity(intent);
            }
        });
    }
}
