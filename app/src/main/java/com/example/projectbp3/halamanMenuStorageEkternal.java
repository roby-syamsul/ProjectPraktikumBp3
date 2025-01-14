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

public class halamanMenuStorageEkternal extends AppCompatActivity {

    ImageView ImageBack;
    TextView s1,s2,s3,s4,s5,s6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halaman_menu_storage_ekternal);

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

        s1 = (TextView) findViewById(R.id.s1);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s1 = new Intent(getApplicationContext(), halamanDetailSeagateNewExpansion.class);
                startActivity(s1);
            }
        });

        s2 = (TextView) findViewById(R.id.sss2);
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s2 = new Intent(getApplicationContext(), halamanDetailWDNewMyPassport.class);
                startActivity(s2);
            }
        });

        s3 = (TextView) findViewById(R.id.s3);
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s3 = new Intent(getApplicationContext(), halamanDetailToshibaCanvio.class);
                startActivity(s3);
            }
        });

        s4 = (TextView) findViewById(R.id.s4);
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s4 = new Intent(getApplicationContext(), halamanDetailTranscend25M3.class);
                startActivity(s4);
            }
        });

        s5 = (TextView) findViewById(R.id.s5);
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s5 = new Intent(getApplicationContext(), halamanDetailADATAHD770G.class);
                startActivity(s5);
            }
        });

        s6 = (TextView) findViewById(R.id.s6);
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s6 = new Intent(getApplicationContext(), halamanDetailLaCieRugged.class);
                startActivity(s6);
            }
        });
    }
}