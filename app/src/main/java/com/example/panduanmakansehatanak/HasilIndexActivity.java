package com.example.panduanmakansehatanak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilIndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_index);

        TextView berat = (TextView)findViewById(R.id.berat);
        TextView tinggi = (TextView)findViewById(R.id.tinggi);
        TextView berattinggi = (TextView)findViewById(R.id.berattinggi);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String stringberat = extras.getString("key1");
            String stringtinggi = extras.getString("key2");
            String stringberattinggi = extras.getString("key3");

            berat.setText(stringberat);
            tinggi.setText(stringtinggi);
            berattinggi.setText(stringberattinggi);
//get the value based on the key
        }
    }
}
