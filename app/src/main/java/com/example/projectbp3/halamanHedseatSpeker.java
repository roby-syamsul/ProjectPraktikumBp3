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

public class halamanHedseatSpeker extends AppCompatActivity {

    ImageView ImageBack;
    TextView h1,h2,h3,h4,h5,h6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halaman_hedseat_speker);

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

        h1 = (TextView) findViewById(R.id.h1);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h1 = new Intent(getApplicationContext(), halamanDetailGamenGH100.class);
                startActivity(h1);
            }
        });

        h2 = (TextView) findViewById(R.id.h2);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h2 = new Intent(getApplicationContext(), halamanDetailLogitechG333.class);
                startActivity(h2);
            }
        });

        h3 = (TextView) findViewById(R.id.h3);
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h3 = new Intent(getApplicationContext(), halamanDetailAcerPredatorGalea350.class);
                startActivity(h3);
            }
        });

        h4 = (TextView) findViewById(R.id.h4);
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h4 = new Intent(getApplicationContext(), halamanDetailAcerNitroGamingHeadset.class);
                startActivity(h4);
            }
        });

        h5 = (TextView) findViewById(R.id.h5);
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h5 = new Intent(getApplicationContext(), halamanDetailRexusVonixF30.class);
                startActivity(h5);
            }
        });

        h6 = (TextView) findViewById(R.id.h6);
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h6 = new Intent(getApplicationContext(), halamanDetailLogitechG733.class);
                startActivity(h6);
            }
        });
    }
}