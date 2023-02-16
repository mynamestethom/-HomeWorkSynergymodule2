package com.example.homework22;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    float balance = 1000;
    static int count = 2500;
    int price = 14000;
    float parcnetBank = 5;
    int i = 0;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = findViewById(R.id.result);
        result.setText("Накопления на телескоп будут копиться "+calculate_Mounth()+" месяцов");
    }

    public int calculate_Mounth(){
        while (balance < price){
            i++;
            balance += balance*(parcnetBank/100);
            balance +=count;
        }
        return i;
    }
}