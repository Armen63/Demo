package com.com.armen.th.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Armen on 2/2/2018.
 */

public class Data {


    public static final Map<Integer, String[]> MATCHER = new LinkedHashMap<>();

    public static final List<String> COUNTRY_NAME = new ArrayList<>(Arrays.asList("Armenia", "Russia", "Georgia", "France", "Germany", "Spain"));
    public static final List<String> COUNTRY_CODE = new ArrayList<>(Arrays.asList("am", "ru", "ge", "fr", "de", "es"));

    public static final List<String> ENGLISH_WORDS = new ArrayList<>(Arrays.asList("Hi", "Good bye", "Yes", "No", "Excuse me", "Please", "I love ...", "I need ...", "I want ...", "Store", "Food", "Thank you"));
    public static final String[] FRENCH_WORDS_EN = {"Bonjour", "Au revoir", "Oui", "Non", "Excusez-moi", "S'il vous plaît", "J'aime ...", "j'ai besoin", "je veux", "le magasin", "aliments", "merci"};

    public static final String[] ARMENIAN_WORDS_ARM = {"Brev", "Tstesootyoon", "A yo", "vo h", "Neretseq", "Khndroom em", "Yes seeroom em ․․․", "indz harkivr ey...", "Yes uzum em", "Xanoot", "snoond", "shnorahalootyoon"};
    public static final String[] RUSSIAN_WORDS_RU = {"Привет", "Пока", "Да", "Нет", "Извините", "Пожалуйста", "Я люблю...", "Мне нужен ...", "Я хочу", "Магазин", "Питание", "Спасибо"};
    public static final String[] FRENCH_WORDS_FR = {"Bonjour", "Au revoir", "Oui", "Non", "Excusez-moi", "S'il vous plaît", "J'aime ...", "j'ai besoin", "je veux", "le magasin", "aliments", "merci"};
    public static final String[] SPAIN_WORDS_ES = {"Hola", "Adiós", "Sí", "No", "Disculpe", "Por favor", "Amo ...", "Necesito...", "Yo quiero ...", "Almacenar", "Comida", "Gracias"};
    public static final String[] GEORGIAN_WORDS_GE = {"Gamarjoba", "Nakhvamdis", "Diakh", "Ara", "Ukatsravad", "Getakva", "Me Mikvars", "Me mchirdeba", "Me minda", "Maghazia", "Sakvebi", "Madloba"};
    public static final String[] GERMANY_WORDS_GE = {"Hallo", "Auf Wiedersehen", "Ja", "Nein", "Entschuldigen Sie mich", "Bitte", "Ich liebe", "Ich brauche", "Ich will", "Geschäft", "Essen", "Danke"};

    static {
        MATCHER.put(0, ARMENIAN_WORDS_ARM);
        MATCHER.put(1, RUSSIAN_WORDS_RU);
        MATCHER.put(2, GEORGIAN_WORDS_GE);
        MATCHER.put(3, FRENCH_WORDS_FR);
        MATCHER.put(4, GERMANY_WORDS_GE);
        MATCHER.put(5, SPAIN_WORDS_ES);
    }
}
