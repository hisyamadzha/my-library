package com.example.mylibrary;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LibraryActivity extends AppCompatActivity {

    public final static int LIB_TAG = 9999;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Toast.makeText(getApplicationContext(),"Hello From Library", Toast.LENGTH_LONG).show();

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 finish();
             }
         }, 5000);
    }
}
