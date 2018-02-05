package com.com.armen.th.db;

import com.com.armen.th.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Armen on 2/2/2018.
 */

public class Data {
    public static final List<String> COUNTRY_NAME = new ArrayList<>(Arrays.asList("Armenia", "Russia", "Georgia", "France", "Germany", "Spain"));
    public static final List<String> COUNTRY_CODE = new ArrayList<>(Arrays.asList("am", "ru", "ge", "fr", "de", "es"));

    public static final List<String> ENGLISH_WORDS = new ArrayList<>(Arrays.asList("Hi", "Good bye", "Yes", "No", "Excuse me", "Please", "I love ...", "I need ...", "I want ...", "Store", "Food", "Thank you"));
    public static final String[] ARMENIAN_WORDS_EN = {"Barev", "Ctesutyun", "Ayo", "Voch", "Nereceq", "Khndrum em", "Es sirum em ...", "Indz petq e...", "Es uzum em ...", "Khanut", "Snund", "Shnorhakalutyun"};
    public static final String[] RUSSIAN_WORDS_EN = {"Privet", "Poka", "Da", "Net", "Izvinite", "Pozhaluysta", "Ya lyublyu ...", "Mne nuzhno ...", "Ya khochu ...", "Magazin", "Pitaniye", "Spasibo"};
    public static final String[] FRENCH_WORDS_EN = {"Bonjour", "Au revoir", "Oui", "Non", "Excusez-moi", "S'il vous plaît", "J'aime ...", "j'ai besoin", "je veux", "le magasin", "aliments", "merci"};

    public static final String[] ARMENIAN_WORDS_ARM = {"Brev", "Tstesootyoon", "A yo", "vo h", "Neretseq", "Khndroom em", "Yes seeroom em ․․․", "indz harkivr ey...", "Yes uzum em", "Xanoot", "snoond", "shnorahalootyoon"};
    public static final String[] RUSSIAN_WORDS_RU = {"Привет", "Пока", "Да", "Нет", "Извините", "Пожалуйста", "Я люблю...", "Мне нужен ...", "Я хочу", "Магазин", "Питание", "Спасибо"};
    public static final String[] FRENCH_WORDS_FR = {"Bonjour", "Au revoir", "Oui", "Non", "Excusez-moi", "S'il vous plaît", "J'aime ...", "j'ai besoin", "je veux", "le magasin", "aliments", "merci"};
    public static final String[] SPAIN_WORDS_ES = {};
    public static final String[] GEORGIAN_WORDS_GE = {};


    public static final ArrayList<Integer> IMAGES = new ArrayList<>(Arrays.asList(
            R.drawable.armenia_1,
            R.drawable.armenia_2,
            R.drawable.armenia_3,
            R.drawable.armenia_4,
            R.drawable.armenia_5,
            R.drawable.armenia_6,
            R.drawable.armenia_7
    ));
}
