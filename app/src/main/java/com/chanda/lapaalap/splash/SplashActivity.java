package com.chanda.lapaalap.splash;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.chanda.lapaalap.MainActivity;
import com.chanda.lapaalap.R;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        goToNext();
    }

    private void goToNext() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent contentIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(contentIntent);
                finish();

            }
        },4000);
    }
}
