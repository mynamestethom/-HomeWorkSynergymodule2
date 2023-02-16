package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int price_ticket= 70;
    int adults = 9;
    int retired = 7;
    int kids = 11;
    int retired_discount = 30;
    int kids_discount = 50;

    public TextView result;
    public int costticket(){
        double adultsprice = adults*70;
        double kidsprice = (price_ticket-(0.7*kids_discount))*kids;
        double retiredprice = (price_ticket-(0.7*retired_discount))*retired;
        return (int) (adultsprice+kidsprice+retiredprice);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        result.setText("Общая стоимость билетов"+costticket());
    }
}