package com.example.projectbp3;

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

public class halamanMenuCoolingPad extends AppCompatActivity {

    ImageView ImageBack;
    TextView c1,c2,c3,c4,c5,c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halaman_menu_cooling_pad);

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

        c1 = (TextView) findViewById(R.id.c1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s1 = new Intent(getApplicationContext(), halamanDetailNYKX4StormBreaker.class);
                startActivity(s1);
            }
        });

        c2 = (TextView) findViewById(R.id.c2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s2 = new Intent(getApplicationContext(), halamanDetailJERTECHKL330.class);
                startActivity(s2);
            }
        });

        c3 = (TextView) findViewById(R.id.c3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s3 = new Intent(getApplicationContext(), halamanDetailORICONA15SV.class);
                startActivity(s3);
            }
        });

        c4 = (TextView) findViewById(R.id.c4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s4 = new Intent(getApplicationContext(), halamaDetailRexusBreezeB150.class);
                startActivity(s4);
            }
        });

        c5 = (TextView) findViewById(R.id.c5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s5 = new Intent(getApplicationContext(), halamanDetailFantechCoolerNC20.class);
                startActivity(s5);
            }
        });

        c6 = (TextView) findViewById(R.id.c6);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s6 = new Intent(getApplicationContext(), halamanDetailCoretechPentaFanCoolingPad.class);
                startActivity(s6);
            }
        });
    }
}