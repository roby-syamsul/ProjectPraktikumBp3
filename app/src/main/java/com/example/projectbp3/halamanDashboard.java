package com.example.projectbp3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class halamanDashboard extends AppCompatActivity {

    ImageView ImageBack;
    TextView kategori1,kategori2,kategori3,kategori4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halaman_dashboard);

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.blue));


        ImageBack = (ImageView) findViewById(R.id.imageBack);
        ImageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IB = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(IB);
            }
        });

        kategori1 = (TextView) findViewById(R.id.kategori1);
        kategori1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k1 = new Intent(getApplicationContext(), halamanMenuMouse.class);
                startActivity(k1);
            }
        });

        kategori2 = (TextView) findViewById(R.id.kategori2);
        kategori2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k2 = new Intent(getApplicationContext(), halamanHedseatSpeker.class);
                startActivity(k2);
            }
        });

        kategori3 = (TextView) findViewById(R.id.kategori3);
        kategori3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k3 = new Intent(getApplicationContext(), halamanMenuStorageEkternal.class);
                startActivity(k3);
            }
        });

        kategori4 = (TextView) findViewById(R.id.kategori4);
        kategori4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k4 = new Intent(getApplicationContext(), halamanMenuCoolingPad.class);
                startActivity(k4);
            }
        });
    }
}