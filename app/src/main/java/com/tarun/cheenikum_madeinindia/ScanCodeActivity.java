package com.tarun.cheenikum_madeinindia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.google.zxing.Result;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScanCodeActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    ZXingScannerView scannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        scannerView = new ZXingScannerView(this);
        setContentView(scannerView);
    }
    @Override
    public void handleResult(Result rawResult) {
    String codeResult = rawResult.toString();

            Intent intent = new Intent(this, ScanResultActivity.class);
            intent.putExtra("result", codeResult);
            startActivity(intent);


    }

    @Override
    protected void onPause() {
        super.onPause();
        scannerView.stopCamera();
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        scannerView.setResultHandler(this);
        scannerView.startCamera();
    }
}