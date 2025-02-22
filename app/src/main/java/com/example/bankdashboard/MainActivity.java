package com.example.bankdashboard;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CardView cardBank, cardAdd, cardShare, cardLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardBank = findViewById(R.id.cardBank);
        cardAdd = findViewById(R.id.cardAdd);
        cardShare = findViewById(R.id.cardShare);
        cardLocation = findViewById(R.id.cardLocation);
        cardBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_bank.class);
                startActivity(intent);
            }});
        cardAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_add.class);
                startActivity(intent);
            }});
        cardShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_share.class);
                startActivity(intent);
            }});
        cardLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_location.class);
                startActivity(intent);
            }
        });
    }}





