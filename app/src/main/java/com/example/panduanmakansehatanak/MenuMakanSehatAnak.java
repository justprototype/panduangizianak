package com.example.panduanmakansehatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MenuMakanSehatAnak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makan_sehat_anak);

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.idmenumakansehat1);
        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.idmenumakansehat2);
        LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.idmenumakansehat3);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuMakanSehatAnak.this, Menu6_1Activity.class);
                startActivity(intent);
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuMakanSehatAnak.this, Menu6_2Activity.class);
                startActivity(intent);
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuMakanSehatAnak.this, Menu6_3Activity.class);
                startActivity(intent);
            }
        });
    }
}
