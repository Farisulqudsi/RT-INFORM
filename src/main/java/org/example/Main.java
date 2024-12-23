package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 1, 5, 4};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        String result = frequencyMap.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .collect(Collectors.joining(", ", "{", "}"));

        System.out.println(result);
        
        GroovyClass example = new GroovyClass();
        example.calculateFrequency(arr);
    }
}