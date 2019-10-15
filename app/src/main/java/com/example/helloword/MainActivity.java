package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int jumlahA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah3poinA(View view) {

        jumlahA = jumlahA+3;
        TextView textviewA = findViewById(R.id.scoreA);
        textviewA.setText(String.valueOf(jumlahA));

    }
}
