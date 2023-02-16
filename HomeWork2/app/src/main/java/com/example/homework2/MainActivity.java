package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float balance = 1000;
    static int count = 2500;
    int price = 14000;
    float parcnetBank = 5;
    int i = 0;



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