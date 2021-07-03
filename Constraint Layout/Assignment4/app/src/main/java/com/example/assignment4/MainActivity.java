package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mbtnclick;
    private Button mbtnclick2;
    private Button mbtnclick3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intidcheck();
        mbtnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent = new Intent();
                mintent.setAction(Intent.ACTION_VIEW);
                mintent.setData(Uri.parse("https://www.masaischool.com/"));
                Toast.makeText(MainActivity.this, "Found", Toast.LENGTH_SHORT).show();

                if (mintent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mintent);
                } else {
                    Toast.makeText(MainActivity.this, "Not Found ", Toast.LENGTH_SHORT).show();
                }

            }
        });

        mbtnclick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent = new Intent();
                mintent.setAction(Intent.ACTION_VIEW);
                mintent.setData(Uri.parse("https://www.google.com/"));
                Toast.makeText(MainActivity.this, "Found", Toast.LENGTH_SHORT).show();

                if (mintent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mintent);
                } else {
                    Toast.makeText(MainActivity.this, "Not Found ", Toast.LENGTH_SHORT).show();
                }

            }
        });

        mbtnclick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent = new Intent();
                mintent.setAction(Intent.ACTION_VIEW);
                mintent.setData(Uri.parse("https://www.gmail.com/"));
                Toast.makeText(MainActivity.this, "Found", Toast.LENGTH_SHORT).show();

                if (mintent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mintent);
                } else {
                    Toast.makeText(MainActivity.this, "Not Found ", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void intidcheck() {
        mbtnclick = findViewById(R.id.btnclick);
        mbtnclick2 = findViewById(R.id.btnclick2);
        mbtnclick3 = findViewById(R.id.btnclick3);
    }
}