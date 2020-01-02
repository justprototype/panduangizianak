package com.example.panduanmakansehatanak;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CekStatusGiziActivity extends AppCompatActivity {

    String beratbadan,tinggibadan,umurbadan ,spinnerr;
    String bb,tb,bt;
    String tet;

    Double skorberat ;
    Double skortinggi ;
    Double skorberattinggi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_status_gizi);
        Button hitung = (Button)findViewById(R.id.hitung);
        final String id = getIntent().getStringExtra("id");
        final TextView test = (TextView)findViewById(R.id.test);

        final EditText berat = (EditText)findViewById(R.id.idberat);
        final EditText tinggi = (EditText)findViewById(R.id.idtinggi);
        final EditText umur = (EditText)findViewById(R.id.idusia);

        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add("Laki-laki");
        list.add("Perempuan");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);


        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    spinnerr = spinner2.getSelectedItem().toString();
                    beratbadan = berat.getText().toString();
                    tinggibadan = tinggi.getText().toString();
                    umurbadan = umur.getText().toString();



            if (spinnerr.equals("Laki-laki")) {

                if(umurbadan.equals("0")){
                    skorberat = Double.parseDouble(beratbadan) - 3.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 49.9;
                }

                if(umurbadan.equals("1")){
                    skorberat = Double.parseDouble(beratbadan) - 4.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 54.7;
                }

                if(umurbadan.equals("2")){
                    skorberat = Double.parseDouble(beratbadan) - 5.6;
                    skortinggi = Double.parseDouble(tinggibadan) - 58.4;
                }
                if(umurbadan.equals("3")){
                    skorberat = Double.parseDouble(beratbadan) - 6.4;
                    skortinggi = Double.parseDouble(tinggibadan) - 61.4;
                }
                if(umurbadan.equals("4")){
                    skorberat = Double.parseDouble(beratbadan) - 7.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 63.9;
                }
                if(umurbadan.equals("5")){
                    skorberat = Double.parseDouble(beratbadan) - 7.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 65.9;
                }
                if(umurbadan.equals("6")){
                    skorberat = Double.parseDouble(beratbadan) - 7.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 67.6;
                }
                if(umurbadan.equals("7")){
                    skorberat = Double.parseDouble(beratbadan) - 8.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 69.2;
                }
                if(umurbadan.equals("8")){
                    skorberat = Double.parseDouble(beratbadan) - 8.6;
                    skortinggi = Double.parseDouble(tinggibadan) - 70.6;
                }
                if(umurbadan.equals("9")){
                    skorberat = Double.parseDouble(beratbadan) - 8.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 72.0;
                }
                if(umurbadan.equals("10")){
                    skorberat = Double.parseDouble(beratbadan) - 9.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 73.3;
                }
                if(umurbadan.equals("11")){
                    skorberat = Double.parseDouble(beratbadan) - 9.4;
                    skortinggi = Double.parseDouble(tinggibadan) - 74.5;
                }
                if(umurbadan.equals("12")){
                    skorberat = Double.parseDouble(beratbadan) - 9.6;
                    skortinggi = Double.parseDouble(tinggibadan) - 75.7;
                }
                if(umurbadan.equals("13")){
                    skorberat = Double.parseDouble(beratbadan) - 9.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 76.9;
                }
                if(umurbadan.equals("14")){
                    skorberat = Double.parseDouble(beratbadan) - 10.1;
                    skortinggi = Double.parseDouble(tinggibadan) - 78.0;
                }
                if(umurbadan.equals("15")){
                    skorberat = Double.parseDouble(beratbadan) - 10.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 79.1;
                }
                if(umurbadan.equals("16")){
                    skorberat = Double.parseDouble(beratbadan) - 10.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 80.2;
                }
                if(umurbadan.equals("17")){
                    skorberat = Double.parseDouble(beratbadan) - 10.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 81.2;
                }
                if(umurbadan.equals("18")){
                    skorberat = Double.parseDouble(beratbadan) - 10.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 82.3;
                }
                if(umurbadan.equals("19")){
                    skorberat = Double.parseDouble(beratbadan) - 11.1;
                    skortinggi = Double.parseDouble(tinggibadan) - 83.2;
                }
                if(umurbadan.equals("20")){
                    skorberat = Double.parseDouble(beratbadan) - 11.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 84.2;
                }
                if(umurbadan.equals("21")){
                    skorberat = Double.parseDouble(beratbadan) - 11.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 85.1;
                }
                if(umurbadan.equals("22")){
                    skorberat = Double.parseDouble(beratbadan) - 11.8;
                    skortinggi = Double.parseDouble(tinggibadan) - 86.0;
                }
                if(umurbadan.equals("23")){
                    skorberat = Double.parseDouble(beratbadan) - 12.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 86.9;
                }
                if(umurbadan.equals("24")){
                    skorberat = Double.parseDouble(beratbadan) - 12.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 87.8;
                }
                if(umurbadan.equals("25")){
                    skorberat = Double.parseDouble(beratbadan) - 12.4;
                    skortinggi = Double.parseDouble(tinggibadan) - 88.0;
                }
                if(umurbadan.equals("26")){
                    skorberat = Double.parseDouble(beratbadan) - 12.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 88.8;
                }
                if(umurbadan.equals("27")){
                    skorberat = Double.parseDouble(beratbadan) - 12.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 89.6;
                }
                if(umurbadan.equals("28")){
                    skorberat = Double.parseDouble(beratbadan) - 12.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 90.4;
                }
                if(umurbadan.equals("29")){
                    skorberat = Double.parseDouble(beratbadan) - 13.1;
                    skortinggi = Double.parseDouble(tinggibadan) - 91.2;
                }
                if(umurbadan.equals("30")){
                    skorberat = Double.parseDouble(beratbadan) - 13.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 91.9;
                }
                if(umurbadan.equals("31")){
                    skorberat = Double.parseDouble(beratbadan) - 13.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 92.7;
                }
                if(umurbadan.equals("32")){
                    skorberat = Double.parseDouble(beratbadan) - 13.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 93.4;
                }
                if(umurbadan.equals("33")){
                    skorberat = Double.parseDouble(beratbadan) - 13.8;
                    skortinggi = Double.parseDouble(tinggibadan) - 94.1;
                }
                if(umurbadan.equals("34")){
                    skorberat = Double.parseDouble(beratbadan) - 14.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 94.8;
                }
                if(umurbadan.equals("35")){
                    skorberat = Double.parseDouble(beratbadan) - 14.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 95.4;
                }
                if(umurbadan.equals("36")){
                    skorberat = Double.parseDouble(beratbadan) - 14.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 96.1;
                }
                if(umurbadan.equals("37")){
                    skorberat = Double.parseDouble(beratbadan) - 14.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 96.7;
                }
                if(umurbadan.equals("38")){
                    skorberat = Double.parseDouble(beratbadan) - 14.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 97.4;
                }
                if(umurbadan.equals("39")){
                    skorberat = Double.parseDouble(beratbadan) - 14.8;
                    skortinggi = Double.parseDouble(tinggibadan) - 98.0;
                }
                if(umurbadan.equals("40")){
                    skorberat = Double.parseDouble(beratbadan) - 15.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 98.6;
                }
                if(umurbadan.equals("41")){
                    skorberat = Double.parseDouble(beratbadan) - 15.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 99.2;
                }
                if(umurbadan.equals("42")){
                    skorberat = Double.parseDouble(beratbadan) - 15.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 99.9;
                }
                if(umurbadan.equals("43")){
                    skorberat = Double.parseDouble(beratbadan) - 15.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 100.4;
                }
                if(umurbadan.equals("44")){
                    skorberat = Double.parseDouble(beratbadan) - 15.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 101.0;
                }
                if(umurbadan.equals("45")){
                    skorberat = Double.parseDouble(beratbadan) - 15.8;
                    skortinggi = Double.parseDouble(tinggibadan) - 101.6;
                }
                if(umurbadan.equals("46")){
                    skorberat = Double.parseDouble(beratbadan) - 16.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 102.2;
                }
                if(umurbadan.equals("47")){
                    skorberat = Double.parseDouble(beratbadan) - 16.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 102.8;
                }
                if(umurbadan.equals("48")){
                    skorberat = Double.parseDouble(beratbadan) - 16.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 103.3;
                }
                if(umurbadan.equals("49")){
                    skorberat = Double.parseDouble(beratbadan) - 16.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 103.9;
                }
                if(umurbadan.equals("50")){
                    skorberat = Double.parseDouble(beratbadan) - 16.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 104.4;
                }
                if(umurbadan.equals("51")){
                    skorberat = Double.parseDouble(beratbadan) - 16.8;
                    skortinggi = Double.parseDouble(tinggibadan) - 105.0;
                }
                if(umurbadan.equals("52")){
                    skorberat = Double.parseDouble(beratbadan) - 17.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 105.6;
                }
                if(umurbadan.equals("53")){
                    skorberat = Double.parseDouble(beratbadan) - 17.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 106.1;
                }
                if(umurbadan.equals("54")){
                    skorberat = Double.parseDouble(beratbadan) - 17.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 106.7;
                }
                if(umurbadan.equals("55")){
                    skorberat = Double.parseDouble(beratbadan) - 17.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 107.2;
                }
                if(umurbadan.equals("56")){
                    skorberat = Double.parseDouble(beratbadan) - 17.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 107.8;
                }
                if(umurbadan.equals("57")){
                    skorberat = Double.parseDouble(beratbadan) - 17.8;
                    skortinggi = Double.parseDouble(tinggibadan) - 108.3;
                }
                if(umurbadan.equals("58")){
                    skorberat = Double.parseDouble(beratbadan) - 18.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 108.9;
                }
                if(umurbadan.equals("59")){
                    skorberat = Double.parseDouble(beratbadan) - 18.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 109.4;
                }
                if(umurbadan.equals("60")){
                    skorberat = Double.parseDouble(beratbadan) - 18.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 110.0;
                }

                if(tinggibadan.equals("45")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.4;
                }
                if(tinggibadan.equals("45.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.5;
                }
                if(tinggibadan.equals("46")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.6;
                }
                if(tinggibadan.equals("46.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.7;
                }
                if(tinggibadan.equals("47")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.8;
                }
                if(tinggibadan.equals("47.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.9;
                }
                if(tinggibadan.equals("48")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.9;
                }
                if(tinggibadan.equals("48.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.0;
                }
                if(tinggibadan.equals("49")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.1;
                }
                if(tinggibadan.equals("49.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.2;
                }
                if(tinggibadan.equals("50")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.3;
                }
                if(tinggibadan.equals("50.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.4;
                }
                if(tinggibadan.equals("51")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.5;
                }
                if(tinggibadan.equals("51.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.6;
                }
                if(tinggibadan.equals("52")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.8;
                }
                if(tinggibadan.equals("52.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.9;
                }
                if(tinggibadan.equals("53")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.0;
                }
                if(tinggibadan.equals("53.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.1;
                }
                if(tinggibadan.equals("54")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.3;
                }
                if(tinggibadan.equals("54.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.4;
                }
                if(tinggibadan.equals("55")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.5;
                }
                if(tinggibadan.equals("55.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.7;
                }
                if(tinggibadan.equals("56")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.8;
                }
                if(tinggibadan.equals("56.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.0;
                }
                if(tinggibadan.equals("57")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.1;
                }
                if(tinggibadan.equals("57.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.3;
                }
                if(tinggibadan.equals("58")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.4;
                }
                if(tinggibadan.equals("58.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.6;
                }
                if(tinggibadan.equals("59")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.7;
                }
                if(tinggibadan.equals("59.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.9;
                }
                if(tinggibadan.equals("60")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.0;
                }
                if(tinggibadan.equals("60.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.1;
                }
                if(tinggibadan.equals("61")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.3;
                }
                if(tinggibadan.equals("61.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.4;
                }
                if(tinggibadan.equals("62")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.5;
                }
                if(tinggibadan.equals("62.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.7;
                }
                if(tinggibadan.equals("63")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.8;
                }
                if(tinggibadan.equals("63.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.9;
                }
                if(tinggibadan.equals("64")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.0;
                }
                if(tinggibadan.equals("64.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.1;
                }
                if(tinggibadan.equals("65")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.3;
                }
                if(tinggibadan.equals("65.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.4;
                }
                if(tinggibadan.equals("66")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.5;
                }
                if(tinggibadan.equals("66.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.6;
                }
                if(tinggibadan.equals("67")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.7;
                }
                if(tinggibadan.equals("67.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.9;
                }
                if(tinggibadan.equals("68")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.0;
                }
                if(tinggibadan.equals("68.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.1;
                }
                if(tinggibadan.equals("69")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.2;
                }
                if(tinggibadan.equals("69.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.3;
                }
                if(tinggibadan.equals("70")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.4;
                }
                if(tinggibadan.equals("70.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.5 ;
                }
                if(tinggibadan.equals("71")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.6;
                }
                if(tinggibadan.equals("71.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.8;
                }
                if(tinggibadan.equals("72")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.9;
                }
                if(tinggibadan.equals("72.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.0;
                }
                if(tinggibadan.equals("73")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.1;
                }
                if(tinggibadan.equals("73.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.2;
                }
                if(tinggibadan.equals("74")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.3;
                }
                if(tinggibadan.equals("74.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.4;
                }
                if(tinggibadan.equals("75")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.5;
                }
                if(tinggibadan.equals("75.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.6;
                }
                if(tinggibadan.equals("76")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.7;
                }
                if(tinggibadan.equals("76.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.8;
                }
                if(tinggibadan.equals("77")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.9;
                }
                if(tinggibadan.equals("77.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.0;
                }
                if(tinggibadan.equals("78")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.1;
                }
                if(tinggibadan.equals("78.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.2;
                }
                if(tinggibadan.equals("79")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.3;
                }
                if(tinggibadan.equals("79.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.4;
                }
                if(tinggibadan.equals("80")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.4;
                }
                if(tinggibadan.equals("80.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.5 ;
                }
                if(tinggibadan.equals("81")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.6;
                }
                if(tinggibadan.equals("81.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.7;
                }
                if(tinggibadan.equals("82")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.8;
                }
                if(tinggibadan.equals("82.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.9;
                }
                if(tinggibadan.equals("83")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.0;
                }
                if(tinggibadan.equals("83.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.2;
                }
                if(tinggibadan.equals("84")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.3;
                }
                if(tinggibadan.equals("84.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.4;
                }
                if(tinggibadan.equals("85")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.5;
                }
                if(tinggibadan.equals("85.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.6;
                }
                if(tinggibadan.equals("86")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.7;
                }
                if(tinggibadan.equals("86.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.9;
                }
                if(tinggibadan.equals("87")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.0;
                }
                if(tinggibadan.equals("87.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.1;
                }
                if(tinggibadan.equals("88")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.2;
                }
                if(tinggibadan.equals("88.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.4;
                }
                if(tinggibadan.equals("89")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.5;
                }
                if(tinggibadan.equals("89.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.6;
                }
                if(tinggibadan.equals("90")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.7;
                }
                if(tinggibadan.equals("90.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.8 ;
                }
                if(tinggibadan.equals("91")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.0;
                }
                if(tinggibadan.equals("91.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.1;
                }
                if(tinggibadan.equals("92")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.2;
                }
                if(tinggibadan.equals("92.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.3;
                }
                if(tinggibadan.equals("93")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.4;
                }
                if(tinggibadan.equals("93.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.5;
                }
                if(tinggibadan.equals("94")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.7;
                }
                if(tinggibadan.equals("94.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.8;
                }
                if(tinggibadan.equals("95")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.9;
                }
                if(tinggibadan.equals("95.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.0;
                }
                if(tinggibadan.equals("96")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.1;
                }
                if(tinggibadan.equals("96.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.3;
                }
                if(tinggibadan.equals("97")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.4;
                }
                if(tinggibadan.equals("97.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.5;
                }
                if(tinggibadan.equals("98")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.6;
                }
                if(tinggibadan.equals("98.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.8;
                }
                if(tinggibadan.equals("99")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.9;
                }
                if(tinggibadan.equals("99.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.0;
                }
                if(tinggibadan.equals("100")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.2;
                }
                if(tinggibadan.equals("100.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.3 ;
                }
                if(tinggibadan.equals("101")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.4;
                }
                if(tinggibadan.equals("101.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.6;
                }
                if(tinggibadan.equals("102")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.7;
                }
                if(tinggibadan.equals("102.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.9;
                }
                if(tinggibadan.equals("103")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.0;
                }
                if(tinggibadan.equals("103.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.2;
                }
                if(tinggibadan.equals("104")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.3;
                }
                if(tinggibadan.equals("104.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.5;
                }
                if(tinggibadan.equals("105")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.6;
                }
                if(tinggibadan.equals("105.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.8;
                }
                if(tinggibadan.equals("106")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.9;
                }
                if(tinggibadan.equals("106.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.1;
                }
                if(tinggibadan.equals("107")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.3;
                }
                if(tinggibadan.equals("107.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.4;
                }
                if(tinggibadan.equals("108")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.6;
                }
                if(tinggibadan.equals("108.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.8;
                }
                if(tinggibadan.equals("109")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.9;
                }
                if(tinggibadan.equals("109.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 18.1;
                }
                if(tinggibadan.equals("110")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 18.3;
                }



                if(skorberat < -3 ){
                    bb = "Gizi Buruk";

                }
                if( -3 <= skorberat && skorberat < -2){
                    bb = "Gizi Kurang";
                }

                if( -2 <= skorberat && skorberat < 2){
                    bb = "Gizi Baik";
                }

                if( 2 < skorberat){
                    bb = "Gizi Lebih";
                }

                if(skortinggi < -3 ){
                    tb = "Sangat Pendek";
                }
                if( -3 <= skortinggi && skortinggi < -2){
                    tb = "Pendek";
                }

                if( -2 <= skortinggi){
                    tb = "Normal";
                }

                if(skorberattinggi < -3 ){
                    bt = "sangat Kurus";

                }
                if( -3 <= skorberattinggi && skorberattinggi < -2){
                    bt = "Kurus";
                }

                if( -2 <= skorberattinggi && skorberattinggi < 2){
                    bt = "Normal";
                }

                if( 2 < skorberattinggi){
                    bt = "Gemuk";
                }



                Intent intent = new Intent(CekStatusGiziActivity.this, HasilIndexActivity.class);
                intent.putExtra("key1", bb);
                intent.putExtra("key2", tb);
                intent.putExtra("key3", bt);
                intent.putExtra("id", id);

                startActivity(intent);

            }


            if(spinnerr.equals("Perempuan")){
                if(umurbadan.equals("0")){
                    skorberat = Double.parseDouble(beratbadan) - 3.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 49.1;
                }

                if(umurbadan.equals("1")){
                    skorberat = Double.parseDouble(beratbadan) - 4.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 53.7;
                }
                if(umurbadan.equals("2")){
                    skorberat = Double.parseDouble(beratbadan) - 5.1;
                    skortinggi = Double.parseDouble(tinggibadan) - 57.1;
                }
                if(umurbadan.equals("3")){
                    skorberat = Double.parseDouble(beratbadan) - 5.8;
                    skortinggi = Double.parseDouble(tinggibadan) - 59.8;
                }
                if(umurbadan.equals("4")){
                    skorberat = Double.parseDouble(beratbadan) - 6.4;
                    skortinggi = Double.parseDouble(tinggibadan) - 62.1;
                }
                if(umurbadan.equals("5")){
                    skorberat = Double.parseDouble(beratbadan) - 6.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 64.0;
                }
                if(umurbadan.equals("6")){
                    skorberat = Double.parseDouble(beratbadan) - 7.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 65.7;
                }
                if(umurbadan.equals("7")){
                    skorberat = Double.parseDouble(beratbadan) - 7.6;
                    skortinggi = Double.parseDouble(tinggibadan) - 67.3;
                }
                if(umurbadan.equals("8")){
                    skorberat = Double.parseDouble(beratbadan) - 7.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 68.7;
                }
                if(umurbadan.equals("9")){
                    skorberat = Double.parseDouble(beratbadan) - 8.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 70.1;
                }
                if(umurbadan.equals("10")){
                    skorberat = Double.parseDouble(beratbadan) - 8.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 71.5;
                }
                if(umurbadan.equals("11")){
                    skorberat = Double.parseDouble(beratbadan) - 8.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 72.8;
                }
                if(umurbadan.equals("12")){
                    skorberat = Double.parseDouble(beratbadan) - 8.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 74.0;
                }
                if(umurbadan.equals("13")){
                    skorberat = Double.parseDouble(beratbadan) - 9.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 75.2;
                }
                if(umurbadan.equals("14")){
                    skorberat = Double.parseDouble(beratbadan) - 9.4;
                    skortinggi = Double.parseDouble(tinggibadan) - 76.4;
                }
                if(umurbadan.equals("15")){
                    skorberat = Double.parseDouble(beratbadan) - 9.6;
                    skortinggi = Double.parseDouble(tinggibadan) - 77.5;
                }
                if(umurbadan.equals("16")){
                    skorberat = Double.parseDouble(beratbadan) - 9.8;
                    skortinggi = Double.parseDouble(tinggibadan) - 78.6;
                }
                if(umurbadan.equals("17")){
                    skorberat = Double.parseDouble(beratbadan) - 10.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 79.7;
                }
                if(umurbadan.equals("18")){
                    skorberat = Double.parseDouble(beratbadan) - 10.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 80.7;
                }
                if(umurbadan.equals("19")){
                    skorberat = Double.parseDouble(beratbadan) - 10.4;
                    skortinggi = Double.parseDouble(tinggibadan) - 81.7;
                }
                if(umurbadan.equals("20")){
                    skorberat = Double.parseDouble(beratbadan) - 10.6;
                    skortinggi = Double.parseDouble(tinggibadan) - 82.7;
                }
                if(umurbadan.equals("21")){
                    skorberat = Double.parseDouble(beratbadan) - 10.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 83.7;
                }
                if(umurbadan.equals("22")){
                    skorberat = Double.parseDouble(beratbadan) - 11.1;
                    skortinggi = Double.parseDouble(tinggibadan) - 84.6;
                }
                if(umurbadan.equals("23")){
                    skorberat = Double.parseDouble(beratbadan) - 11.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 85.5;
                }
                if(umurbadan.equals("24")){
                    skorberat = Double.parseDouble(beratbadan) - 11.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 86.4;
                }
                if(umurbadan.equals("25")){
                    skorberat = Double.parseDouble(beratbadan) - 11.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 86.6;
                }
                if(umurbadan.equals("26")){
                    skorberat = Double.parseDouble(beratbadan) - 11.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 87.4;
                }
                if(umurbadan.equals("27")){
                    skorberat = Double.parseDouble(beratbadan) - 12.1;
                    skortinggi = Double.parseDouble(tinggibadan) - 88.3;
                }
                if(umurbadan.equals("28")){
                    skorberat = Double.parseDouble(beratbadan) - 12.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 89.1;
                }
                if(umurbadan.equals("29")){
                    skorberat = Double.parseDouble(beratbadan) - 12.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 89.9;
                }
                if(umurbadan.equals("30")){
                    skorberat = Double.parseDouble(beratbadan) - 12.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 90.7;
                }
                if(umurbadan.equals("31")){
                    skorberat = Double.parseDouble(beratbadan) - 12.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 91.4;
                }
                if(umurbadan.equals("32")){
                    skorberat = Double.parseDouble(beratbadan) - 13.1;
                    skortinggi = Double.parseDouble(tinggibadan) - 92.2;
                }
                if(umurbadan.equals("33")){
                    skorberat = Double.parseDouble(beratbadan) - 13.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 92.9;
                }
                if(umurbadan.equals("34")){
                    skorberat = Double.parseDouble(beratbadan) - 13.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 93.6;
                }
                if(umurbadan.equals("35")){
                    skorberat = Double.parseDouble(beratbadan) - 13.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 94.4;
                }
                if(umurbadan.equals("36")){
                    skorberat = Double.parseDouble(beratbadan) - 13.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 95.1;
                }
                if(umurbadan.equals("37")){
                    skorberat = Double.parseDouble(beratbadan) - 14.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 95.7;
                }
                if(umurbadan.equals("38")){
                    skorberat = Double.parseDouble(beratbadan) - 14.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 96.4;
                }
                if(umurbadan.equals("39")){
                    skorberat = Double.parseDouble(beratbadan) - 14.4;
                    skortinggi = Double.parseDouble(tinggibadan) - 97.1;
                }
                if(umurbadan.equals("40")){
                    skorberat = Double.parseDouble(beratbadan) - 14.6;
                    skortinggi = Double.parseDouble(tinggibadan) - 97.7;
                }
                if(umurbadan.equals("41")){
                    skorberat = Double.parseDouble(beratbadan) - 14.8;
                    skortinggi = Double.parseDouble(tinggibadan) - 98.4;
                }
                if(umurbadan.equals("42")){
                    skorberat = Double.parseDouble(beratbadan) - 15.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 99.0;
                }
                if(umurbadan.equals("43")){
                    skorberat = Double.parseDouble(beratbadan) - 15.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 99.7;
                }
                if(umurbadan.equals("44")){
                    skorberat = Double.parseDouble(beratbadan) - 15.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 100.3;
                }
                if(umurbadan.equals("45")){
                    skorberat = Double.parseDouble(beratbadan) - 15.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 100.9;
                }
                if(umurbadan.equals("46")){
                    skorberat = Double.parseDouble(beratbadan) - 15.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 101.5;
                }
                if(umurbadan.equals("47")){
                    skorberat = Double.parseDouble(beratbadan) - 15.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 102.1;
                }
                if(umurbadan.equals("48")){
                    skorberat = Double.parseDouble(beratbadan) - 16.1;
                    skortinggi = Double.parseDouble(tinggibadan) - 102.7;
                }
                if(umurbadan.equals("49")){
                    skorberat = Double.parseDouble(beratbadan) - 16.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 103.3;
                }
                if(umurbadan.equals("50")){
                    skorberat = Double.parseDouble(beratbadan) - 16.4;
                    skortinggi = Double.parseDouble(tinggibadan) - 103.9;
                }
                if(umurbadan.equals("51")){
                    skorberat = Double.parseDouble(beratbadan) - 16.6;
                    skortinggi = Double.parseDouble(tinggibadan) - 104.5;
                }
                if(umurbadan.equals("52")){
                    skorberat = Double.parseDouble(beratbadan) - 16.8;
                    skortinggi = Double.parseDouble(tinggibadan) - 105.0;
                }
                if(umurbadan.equals("53")){
                    skorberat = Double.parseDouble(beratbadan) - 17.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 105.6;
                }
                if(umurbadan.equals("54")){
                    skorberat = Double.parseDouble(beratbadan) - 17.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 106.2;
                }
                if(umurbadan.equals("55")){
                    skorberat = Double.parseDouble(beratbadan) - 17.3;
                    skortinggi = Double.parseDouble(tinggibadan) - 106.7;
                }
                if(umurbadan.equals("56")){
                    skorberat = Double.parseDouble(beratbadan) - 17.5;
                    skortinggi = Double.parseDouble(tinggibadan) - 107.3;
                }
                if(umurbadan.equals("57")){
                    skorberat = Double.parseDouble(beratbadan) - 17.7;
                    skortinggi = Double.parseDouble(tinggibadan) - 107.8;
                }
                if(umurbadan.equals("58")){
                    skorberat = Double.parseDouble(beratbadan) - 17.9;
                    skortinggi = Double.parseDouble(tinggibadan) - 108.4;
                }
                if(umurbadan.equals("59")){
                    skorberat = Double.parseDouble(beratbadan) - 18.0;
                    skortinggi = Double.parseDouble(tinggibadan) - 108.9;
                }
                if(umurbadan.equals("60")){
                    skorberat = Double.parseDouble(beratbadan) - 18.2;
                    skortinggi = Double.parseDouble(tinggibadan) - 109.4;
                }

                if(tinggibadan.equals("45")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.5;
                }
                if(tinggibadan.equals("45.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.5;
                }
                if(tinggibadan.equals("46")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.6;
                }
                if(tinggibadan.equals("46.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.7;
                }
                if(tinggibadan.equals("47")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.8;
                }
                if(tinggibadan.equals("47.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 2.9;
                }
                if(tinggibadan.equals("48")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.0;
                }
                if(tinggibadan.equals("48.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.1;
                }
                if(tinggibadan.equals("49")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.2;
                }
                if(tinggibadan.equals("49.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.3;
                }
                if(tinggibadan.equals("50")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.4;
                }
                if(tinggibadan.equals("50.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.5;
                }
                if(tinggibadan.equals("51")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.6;
                }
                if(tinggibadan.equals("51.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.7;
                }
                if(tinggibadan.equals("52")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.8;
                }
                if(tinggibadan.equals("52.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 3.9;
                }
                if(tinggibadan.equals("53")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.0;
                }
                if(tinggibadan.equals("53.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.2;
                }
                if(tinggibadan.equals("54")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.3;
                }
                if(tinggibadan.equals("54.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.4;
                }
                if(tinggibadan.equals("55")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.5;
                }
                if(tinggibadan.equals("55.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.7;
                }
                if(tinggibadan.equals("56")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 4.8;
                }
                if(tinggibadan.equals("56.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.0;
                }
                if(tinggibadan.equals("57")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.1;
                }
                if(tinggibadan.equals("57.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.2;
                }
                if(tinggibadan.equals("58")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.4;
                }
                if(tinggibadan.equals("58.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.5;
                }
                if(tinggibadan.equals("59")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.6;
                }
                if(tinggibadan.equals("59.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.7;
                }
                if(tinggibadan.equals("60")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 5.9;
                }
                if(tinggibadan.equals("60.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.0;
                }
                if(tinggibadan.equals("61")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.1;
                }
                if(tinggibadan.equals("61.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.3;
                }
                if(tinggibadan.equals("62")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.4;
                }
                if(tinggibadan.equals("62.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.5;
                }
                if(tinggibadan.equals("63")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.6;
                }
                if(tinggibadan.equals("63.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.7;
                }
                if(tinggibadan.equals("64")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 6.9;
                }
                if(tinggibadan.equals("64.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.0;
                }
                if(tinggibadan.equals("65")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.1;
                }
                if(tinggibadan.equals("65.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.2;
                }
                if(tinggibadan.equals("66")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.3;
                }
                if(tinggibadan.equals("66.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.4;
                }
                if(tinggibadan.equals("67")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.5;
                }
                if(tinggibadan.equals("67.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.6;
                }
                if(tinggibadan.equals("68")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.7;
                }
                if(tinggibadan.equals("68.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 7.9;
                }
                if(tinggibadan.equals("69")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.0;
                }
                if(tinggibadan.equals("69.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.1;
                }
                if(tinggibadan.equals("70")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.2;
                }
                if(tinggibadan.equals("70.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.3 ;
                }
                if(tinggibadan.equals("71")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.4;
                }
                if(tinggibadan.equals("71.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.5;
                }
                if(tinggibadan.equals("72")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.6;
                }
                if(tinggibadan.equals("72.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.7;
                }
                if(tinggibadan.equals("73")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.8;
                }
                if(tinggibadan.equals("73.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 8.9;
                }
                if(tinggibadan.equals("74")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.0;
                }
                if(tinggibadan.equals("74.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.1;
                }
                if(tinggibadan.equals("75")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.1;
                }
                if(tinggibadan.equals("75.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.2;
                }
                if(tinggibadan.equals("76")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.3;
                }
                if(tinggibadan.equals("76.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.4;
                }
                if(tinggibadan.equals("77")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.5;
                }
                if(tinggibadan.equals("77.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.6;
                }
                if(tinggibadan.equals("78")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.7;
                }
                if(tinggibadan.equals("78.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.8;
                }
                if(tinggibadan.equals("79")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 9.9;
                }
                if(tinggibadan.equals("79.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.0;
                }
                if(tinggibadan.equals("80")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.1;
                }
                if(tinggibadan.equals("80.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.2 ;
                }
                if(tinggibadan.equals("81")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.3;
                }
                if(tinggibadan.equals("81.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.4;
                }
                if(tinggibadan.equals("82")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.5;
                }
                if(tinggibadan.equals("82.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.6;
                }
                if(tinggibadan.equals("83")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.7;
                }
                if(tinggibadan.equals("83.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 10.9;
                }
                if(tinggibadan.equals("84")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.0;
                }
                if(tinggibadan.equals("84.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.1;
                }
                if(tinggibadan.equals("85")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.2;
                }
                if(tinggibadan.equals("85.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.3;
                }
                if(tinggibadan.equals("86")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.5;
                }
                if(tinggibadan.equals("86.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.6;
                }
                if(tinggibadan.equals("87")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.7;
                }
                if(tinggibadan.equals("87.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 11.8;
                }
                if(tinggibadan.equals("88")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.0;
                }
                if(tinggibadan.equals("88.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.1;
                }
                if(tinggibadan.equals("89")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.2;
                }
                if(tinggibadan.equals("89.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.3;
                }
                if(tinggibadan.equals("90")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.5;
                }
                if(tinggibadan.equals("90.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.6 ;
                }
                if(tinggibadan.equals("91")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.7;
                }
                if(tinggibadan.equals("91.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 12.8;
                }
                if(tinggibadan.equals("92")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.0;
                }
                if(tinggibadan.equals("92.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.1;
                }
                if(tinggibadan.equals("93")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.2;
                }
                if(tinggibadan.equals("93.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.3;
                }
                if(tinggibadan.equals("94")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.5;
                }
                if(tinggibadan.equals("94.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.6;
                }
                if(tinggibadan.equals("95")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.7;
                }
                if(tinggibadan.equals("95.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 13.8;
                }
                if(tinggibadan.equals("96")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.0;
                }
                if(tinggibadan.equals("96.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.1;
                }
                if(tinggibadan.equals("97")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.2;
                }
                if(tinggibadan.equals("97.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.4;
                }
                if(tinggibadan.equals("98")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.5;
                }
                if(tinggibadan.equals("98.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.6;
                }
                if(tinggibadan.equals("99")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.8;
                }
                if(tinggibadan.equals("99.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 14.9;
                }
                if(tinggibadan.equals("100")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.0;
                }
                if(tinggibadan.equals("100.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.2 ;
                }
                if(tinggibadan.equals("101")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.3;
                }
                if(tinggibadan.equals("101.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.5;
                }
                if(tinggibadan.equals("102")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.6;
                }
                if(tinggibadan.equals("102.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.8;
                }
                if(tinggibadan.equals("103")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 15.9;
                }
                if(tinggibadan.equals("103.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.1;
                }
                if(tinggibadan.equals("104")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.2;
                }
                if(tinggibadan.equals("104.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.4;
                }
                if(tinggibadan.equals("105")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.5;
                }
                if(tinggibadan.equals("105.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.7;
                }
                if(tinggibadan.equals("106")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 16.9;
                }
                if(tinggibadan.equals("106.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.1;
                }
                if(tinggibadan.equals("107")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.2;
                }
                if(tinggibadan.equals("107.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.4;
                }
                if(tinggibadan.equals("108")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.6;
                }
                if(tinggibadan.equals("108.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 17.8;
                }
                if(tinggibadan.equals("109")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 18.0;
                }
                if(tinggibadan.equals("109.5")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 18.1;
                }
                if(tinggibadan.equals("110")){
                    skorberattinggi = Double.parseDouble(beratbadan) - 18.3;
                }

                if(skorberat < -3 ){
                    bb = "Gizi Buruk";

                }
                if( -3 <= skorberat && skorberat < -2){
                    bb = "Gizi Kurang";
                }

                if( -2 <= skorberat && skorberat < 2){
                    bb = "Gizi Baik";
                }

                if( 2 < skorberat){
                    bb = "Gizi Lebih";
                }

                if(skortinggi < -3 ){
                    tb = "Sangat Pendek";
                }
                if( -3 <= skortinggi && skortinggi < -2){
                    tb = "Pendek";
                }

                if( -2 <= skortinggi){
                    tb = "Normal";
                }

                if(skorberattinggi < -3 ){
                    bt = "sangat Kurus";

                }
                if( -3 <= skorberattinggi && skorberattinggi < -2){
                    bt = "Kurus";
                }

                if( -2 <= skorberattinggi && skorberattinggi < 2){
                    bt = "Normal";
                }

                if( 2 < skorberattinggi){
                    bt = "Gemuk";
                }

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                final DatabaseReference ali = database.getReference("User");
                final String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
                final String id2 = ali.push().getKey();
                ali.child(id).child("Status Gizi").child(id2).child("bb").setValue(bb);
                ali.child(id).child("Status Gizi").child(id2).child("tb").setValue(tb);
                ali.child(id).child("Status Gizi").child(id2).child("tb").setValue(bt);
                ali.child(id).child("Status Gizi").child(id2).child("Waktu pengukuran").setValue(currentDateTimeString);


                Intent intent = new Intent(CekStatusGiziActivity.this, HasilIndexActivity.class);
                intent.putExtra("key1", bb);
                intent.putExtra("key2", tb);
                intent.putExtra("key3", bt);

                intent.putExtra("id", id);

                startActivity(intent);
            }






            }
        });
    }
}
