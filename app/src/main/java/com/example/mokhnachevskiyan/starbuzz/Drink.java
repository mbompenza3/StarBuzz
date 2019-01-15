package com.example.mokhnachevskiyan.starbuzz;

/**
 * Created by mokhnachevskiyan on 14.01.2019.
 */

public class Drink {
    private String name;
    private String descr;
    private int imgResId;
    public static final Drink[] drinks = {
            new Drink("latte", "A couple of espresso shots with steamed milk",
                    R.drawable.latte),
            new Drink("capuccino", "Espresso, hot milk, and a steamed milk foam",
                    R.drawable.capuccino),
            new Drink("filter", "Highest quality beans roasted and brewed fresh",
                    R.drawable.filter)
    };

    public Drink(String name, String descr, int imgResId) {
        this.name = name;
        this.descr = descr;
        this.imgResId = imgResId;
    }

    public String getName() {
        return name;
    }

    public String getDescr() {
        return descr;
    }

    public int getImgResId() {
        return imgResId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
