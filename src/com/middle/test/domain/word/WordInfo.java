package com.middle.test.domain.word;

import java.util.*;
import java.util.stream.Collectors;

public class WordInfo {
    private Set<String> longestWords;
    private Map<String, Integer> frequency;

    public WordInfo() {
        longestWords = new TreeSet<>();
        frequency = new HashMap<>();
    }

    public void setFrequency(List<String> words) {
        frequency = words.stream()
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.summingInt(word -> 1)
                ));
    }

    public void findLongestWords(Set<String> words) {
        int maxLength = 0;
        for(String word : words) {
            if(maxLength > word.length()) {
                continue;
            } else if (maxLength == word.length()) {
                longestWords.add(word);
                continue;
            }

            maxLength = word.length();
            longestWords.clear();
            longestWords.add(word);
        }

        System.out.println("1. 문자열에서 가장 긴 단어 :");
        longestWords.forEach(System.out::println);
    }

    public void getFrequency(List<String> words, int topN) {
        setFrequency(words);
        System.out.println("2. 문자열에서 가장 많이 나온 단어 Top 3 :");
        sortedDescending(topN);
        //descendingMergeSort(topN);
    }

    public void descendingMergeSort(int topN) {
        //words
    }

    public void sortedDescending(int topN) {
        List<Integer> topValues = frequency.values().stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(topN)
                .toList();

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(
                frequency.entrySet().stream()
                        .filter(entry -> topValues.contains(entry.getValue()))
                        .toList()
        );
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        entries.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + "회"));
    }
}