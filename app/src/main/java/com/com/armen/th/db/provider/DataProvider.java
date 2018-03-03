package com.com.armen.th.db.provider;

import com.com.armen.th.R;
import com.com.armen.th.db.Data;
import com.com.armen.th.db.pojo.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andranikh on 5/27/17.
 */

public class DataProvider {

    private static List<Country> countries;

    private static int[] avatars = {
            R.drawable.img_1,
            R.drawable.img_3,
            R.drawable.img_2,
            R.drawable.img_5,
            R.drawable.img_4,
            R.drawable.img_6,
    };

    static {
        countries = new ArrayList<>();
        //TODO
        //normal json parse
        for (int i = 0; i < avatars.length; i++) {
            countries.add(new Country(Data.COUNTRY_NAME.get(i),avatars[i]));
        }


    }

    public static List<Country> getCountries() {
        return countries;
    }
}

