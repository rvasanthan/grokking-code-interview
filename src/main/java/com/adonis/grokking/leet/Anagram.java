package com.adonis.grokking.leet;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        String s = "anagram";  
        String t = "nagaram";
        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram(s, t);
        System.out.println("Is \"" + s + "\" an anagram of \"" + t + "\"? " + result);
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        // Check if the lengths of the strings are different
        if(s.length() != t.length()) {
            return false;
        } 

        if(charCountMap.isEmpty()) {
            // Count the occurrences of each character in the first string
            for (char c : s.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            for(char c : t.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) - 1);
            }

            for(Integer element : charCountMap.values()) {
                if(element != 0) {
                    return false; // If any count is not zero, they are not anagrams
                }
            }
        }

        return true; // All counts are zero, so they are anagrams
    }
}
