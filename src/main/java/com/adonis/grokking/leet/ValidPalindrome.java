package com.adonis.grokking.leet;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome palindrome = new ValidPalindrome();
        System.out.println(palindrome.isPalindrome("."));
    }

    public boolean isPalindrome(String s) {
        if(" ".equals(s) || s.length() == 1) {
            return true;
        }
        String caseInSensitive = s.toLowerCase();
        char[] characters = caseInSensitive.toCharArray();
        int i=0; int j = s.length()-1;
        while(i < s.length() && j >= 0) {
            if(characters[i] == ' ' || isSpecialCharacter(characters[i])) {
                i++;
                continue;
            }
            if(characters[j] == ' ' || isSpecialCharacter(characters[j])) {
                j--;
                continue;
            }
            if(characters[i] != characters[j]) {
                return false;
            }
            i++; j--;

        }
        return true;
    }

    public boolean isSpecialCharacter(Character c) {
        return c.toString().matches(".*[^a-zA-Z0-9].*");
    }
}
