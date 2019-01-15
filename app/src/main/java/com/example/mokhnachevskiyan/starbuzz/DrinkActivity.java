package com.example.mokhnachevskiyan.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkNo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);
        Drink drink = Drink.drinks[drinkNo];

        ImageView pho = (ImageView) findViewById(R.id.photo);
        pho.setImageResource(drink.getImgResId());
        pho.setContentDescription(drink.getName());

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        TextView descr = (TextView) findViewById(R.id.descr);
        descr.setText(drink.getDescr());
    }
}