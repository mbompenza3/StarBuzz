package com.example.mokhnachevskiyan.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mokhnachevskiyan on 14.01.2019.
 */

public class DrinkCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_cat);
        ArrayAdapter<Drink> listAdapter=new ArrayAdapter<Drink>(this,
                android.R.layout.simple_list_item_1,Drink.drinks);
        ListView listDr=(ListView)findViewById(R.id.list_drinks);
        listDr.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
                intent.putExtra(DrinkActivity.EXTRA_DRINKNO,(int) l);
                startActivity(intent);
            }
        };
        listDr.setOnItemClickListener(itemClickListener);
    }
}
