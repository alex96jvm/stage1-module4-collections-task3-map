package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] array = sentence.replaceAll("\\pP", "").toLowerCase().split(" ");

        for (String el : array){
            if (!el.isBlank()) {
                map.put(el, map.getOrDefault(el, 0) + 1);
            }
        }
        return map;
    }
}
