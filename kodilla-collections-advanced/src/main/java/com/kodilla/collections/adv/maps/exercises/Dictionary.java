package com.kodilla.collections.adv.maps.exercises;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }




    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, Collections.emptyList());
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : englishWords) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech)) {
                result.add(englishWord);
            }
        }

        return result;
    }

    public int size() {
        return dictionary.size();

    }
    public List<EnglishWord> findEnglishWords(String polishword){
        return dictionary.getOrDefault(polishword, Collections.emptyList());

    }
}
