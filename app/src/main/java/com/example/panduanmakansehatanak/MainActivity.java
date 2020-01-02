package com.example.panduanmakansehatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nama = (EditText)findViewById(R.id.idnama);
        final EditText usia = (EditText)findViewById(R.id.idusia);
        final EditText alamat = (EditText)findViewById(R.id.idalamat);

        Button btn = (Button)findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nama.getText().toString().isEmpty() && usia.getText().toString().isEmpty() && alamat.getText().toString().isEmpty() ){

                    Toast.makeText(getApplicationContext(),"Harap diisi kolom di atas",Toast.LENGTH_LONG).show();
                }

                else{
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    final DatabaseReference ali = database.getReference("User");
                    final String id = ali.push().getKey();
                    final String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
                    ali.child(id).child("Waktu Login").setValue(currentDateTimeString);
                    ali.child(id).child("nama").setValue(nama.getText().toString());
                    ali.child(id).child("usia").setValue(usia.getText().toString());
                    ali.child(id).child("pekerjaan").setValue(alamat.getText().toString());
                    Toast.makeText(getApplicationContext(),"Login Berhasil ",Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, SplashActivity.class);
                    intent.putExtra("id", id);
                    startActivity(intent);

                }



            }
        });

    }
}
