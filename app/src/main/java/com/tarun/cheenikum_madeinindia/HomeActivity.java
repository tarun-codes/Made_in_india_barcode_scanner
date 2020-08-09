package com.tarun.cheenikum_madeinindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Toolbar toolbar;
    CardView barCodeCard, brandsCard, productsCard, appsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        barCodeCard = findViewById(R.id.bar_code_card);
        brandsCard = findViewById(R.id.brands_card);
        productsCard = findViewById(R.id.products_card);
        appsCard = findViewById(R.id.apps_card);
        barCodeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
        brandsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Brands is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        productsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Products card is clicked ", Toast.LENGTH_SHORT).show();
            }
        });
        appsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Apps card is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onBackPressed() {
       finishAffinity();
       finish();
    }
}
