package com.tarun.cheenikum_madeinindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Objects;



public class MainActivity extends AppCompatActivity {
    Button scanBtn, searchBtn;
    EditText barCodeInput;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        scanBtn = findViewById(R.id.scan_btn);
        barCodeInput = findViewById(R.id.bar_code_input);
        searchBtn = findViewById(R.id.search_btn);
        ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.CAMERA},1);
        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),ScanCodeActivity.class));
            }
        });
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideKeyBoard();
                String codeInput = barCodeInput.getText().toString();
                if(codeInput.trim().equals("")){
                    Toast.makeText(MainActivity.this, "Enter a valid Bar Code", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (codeInput.length() == 3 || codeInput.length() == 8 || codeInput.length() == 13) {
                        Intent intent = new Intent(getApplicationContext(), ScanResultActivity.class);
                        intent.putExtra("result", codeInput);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Enter a valid Bar Code", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void hideKeyBoard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        Objects.requireNonNull(inputMethodManager).hideSoftInputFromWindow(Objects.requireNonNull(getCurrentFocus()).
                getRootView().getWindowToken(),0);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),HomeActivity.class));
    }
}
