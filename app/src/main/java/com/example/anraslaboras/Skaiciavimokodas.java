package com.example.anraslaboras;

public class Skaiciavimokodas {
    public static int getCharsCount(String phrase){
        return phrase.length();
    }

    public int getWordsCount(String phrase){
        return phrase.split("\\s+").length; // separate string around spaces;
    }
}
