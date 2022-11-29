package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnBeli = findViewById(R.id.buy);
        btnBeli.setOnClickListener(this);
        Button btnHubungiPenjual = findViewById(R.id.hubungi_penjual);
        btnHubungiPenjual.setOnClickListener(this);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Sony Ericsson Xperia PLAY");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buy:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.hubungi_penjual:
                String phoneNumber = "086969696969";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
