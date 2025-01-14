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

public class halamanMenuMouse extends AppCompatActivity {

    ImageView ImageBack;

    TextView k1,k2,k3,k4,k5,k6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halaman_menu_mouse);

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.blue));

        ImageBack = (ImageView) findViewById(R.id.imageBack);
        ImageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IB = new Intent(getApplicationContext(), halamanDashboard.class);
                startActivity(IB);
            }
        });

        k1 = (TextView) findViewById(R.id.k1);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k1 = new Intent(getApplicationContext(), halamanDetailLogitechk120.class);
                startActivity(k1);
            }
        });

        k2 = (TextView) findViewById(R.id.k2);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k2 = new Intent(getApplicationContext(), halamanDetailMK220.class);
                startActivity(k2);
            }
        });

        k3 = (TextView) findViewById(R.id.k3);
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k3 = new Intent(getApplicationContext(), halamanDetailRexusMX9.class);
                startActivity(k3);
            }
        });

        k4 = (TextView) findViewById(R.id.k4);
        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k4 = new Intent(getApplicationContext(), halamanDetailRexusg10.class);
                startActivity(k4);
            }
        });

        k5 = (TextView) findViewById(R.id.k5);
        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k5 = new Intent(getApplicationContext(), halamanDetailRexusQ20.class);
                startActivity(k5);
            }
        });

        k6 = (TextView) findViewById(R.id.k6);
        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k6 = new Intent(getApplicationContext(), halamanDetailrRexusx16.class);
                startActivity(k6);
            }
        });

    }
}