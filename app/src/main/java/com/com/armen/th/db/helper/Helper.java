package com.com.armen.th.db.helper;

import android.content.Context;

import com.com.armen.th.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Armen on 2/5/2018.
 */

public class Helper {
    public static ArrayList<String> getWords(String path, Context context) {
        String realPath = (path + '/' + path + ".txt").toLowerCase();
        ArrayList<String> list = new ArrayList<>();
        String word;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(context.getAssets().open(realPath)))) {
            while ((word = reader.readLine()) != null) {
                list.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<Integer> getImages(String path) {
        switch (path) {
            case "Armenia":
                return new ArrayList<>(Arrays.asList(R.drawable.armenia_1, R.drawable.armenia_2, R.drawable.armenia_3, R.drawable.armenia_4, R.drawable.armenia_5, R.drawable.armenia_6, R.drawable.armenia_7));
            case "Russia":
                return new ArrayList<>(Arrays.asList(R.drawable.russia_1, R.drawable.russia_2, R.drawable.russia_3, R.drawable.russia_4, R.drawable.russia_5, R.drawable.russia_6, R.drawable.russia_7));
            case "France":
                return new ArrayList<>(Arrays.asList(R.drawable.france_1, R.drawable.france_2, R.drawable.france_3, R.drawable.france_4, R.drawable.france_5, R.drawable.france_6, R.drawable.france_7));
            case "Georgia":
                return new ArrayList<>(Arrays.asList(R.drawable.georgia_1, R.drawable.georgia_2, R.drawable.georgia_3, R.drawable.georgia_4, R.drawable.georgia_5));
            case "Germany":
                return new ArrayList<>(Arrays.asList(R.drawable.germany_1, R.drawable.germany_2, R.drawable.germany_3, R.drawable.germany_4, R.drawable.germany_5, R.drawable.germany_6, R.drawable.germany_7));
            case "Spain":
                return new ArrayList<>(Arrays.asList(R.drawable.spain_1, R.drawable.spain_2, R.drawable.spain_3, R.drawable.spain_4, R.drawable.spain_5, R.drawable.spain_6, R.drawable.spain_7));

            default:
                return null;
        }
    }

}
