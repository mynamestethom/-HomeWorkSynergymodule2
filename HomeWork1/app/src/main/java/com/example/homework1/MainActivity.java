package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float coat = 70;
    byte coat_discount = 77;
    float hat = 25;
    byte hat_discount = 37;
    float business_suit = 53;
    byte business_suit_discount = 44;
    float  shirt = 19;
    float shoes = 41;
    byte shoes_discount = 77;
    float balance = 312;

    private float calculate(){
        return ( coat_discount*(coat/100)+hat_discount*(hat/100)+business_suit_discount*(business_suit/100)+shirt+shoes_discount*(shoes/100) );
    }

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);

        if(calculate() <= balance){
            result.setText("Оплата прошла успешна)");
        }else{
            result.setText("Недостаточно средств");
        }
    }
}