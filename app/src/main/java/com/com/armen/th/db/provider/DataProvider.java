package com.com.armen.th.db.provider;

import com.com.armen.th.R;
import com.com.armen.th.db.pojo.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by andranikh on 5/27/17.
 */

public class DataProvider {

    private static List<Country> countries;

    private static Random random;

    public static int[] avatars = {
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img_6,
    };

    static {
        random = new Random();
        countries = new ArrayList<>();
        //TODO
        //normal json parse
        for (int i = 0; i < avatars.length; i++) {
            switch (i) {
                case 0:
                    countries.add(new Country("Armenia", avatars[i]));
                    break;
                case 1:
                    countries.add(new Country("Georgia", avatars[i]));
                    break;
                case 2:
                    countries.add(new Country("Russia", avatars[i]));
                    break;
                case 3:
                    countries.add(new Country("Germany", avatars[i]));
                    break;
                case 4:
                    countries.add(new Country("France", avatars[i]));
                    break;
                case 5:
                    countries.add(new Country("Spain", avatars[i]));
                    break;

            }
        }

    }

    public static List<Country> getCountries() {
        return countries;
    }
}

