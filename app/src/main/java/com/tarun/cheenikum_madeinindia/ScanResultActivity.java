package com.tarun.cheenikum_madeinindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ScanResultActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView countryImg;
    TextView countryText, countryName;
    String barCode;
    int barCodeInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_result);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        countryImg = findViewById(R.id.country_img);
        countryText = findViewById(R.id.country_text);
        countryName = findViewById(R.id.country_name);
        String codeResult = getIntent().getStringExtra("result");
        if(codeResult != null)
        barCode = codeResult.substring(0,3);
        barCodeInt = Integer.parseInt(barCode);
        HelperClass helperClass = new HelperClass(countryImg,countryName,barCodeInt);
        helperClass.updateUi();
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

}
