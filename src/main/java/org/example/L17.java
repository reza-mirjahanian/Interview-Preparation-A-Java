package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class L17 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        int n = digits.length();
        if (n == 0) return result;
        HashMap<Character, String[]> digitsAndLetters = new HashMap<>();
        digitsAndLetters.put('2', new String[]{"a", "b", "c"});
        digitsAndLetters.put('3', new String[]{"d", "e", "f"});
        digitsAndLetters.put('4', new String[]{"g", "h", "i"});
        digitsAndLetters.put('5', new String[]{"j", "k", "l"});
        digitsAndLetters.put('6', new String[]{"m", "n", "o"});
        digitsAndLetters.put('7', new String[]{"p", "q", "r", "s"});
        digitsAndLetters.put('8', new String[]{"t", "u", "v"});
        digitsAndLetters.put('9', new String[]{"w", "x", "y", "z"});
        String[] currentmnemonic = new String[digits.length()];
        Arrays.fill(currentmnemonic, "0");
        letterCombinationsHelper(0, digits, currentmnemonic, digitsAndLetters, result);
        return result;
    }

    public static void letterCombinationsHelper(int idx, String phoneNumber, String[] currentmn,
                                                HashMap<Character, String[]> letters, List<String> output) {
        if (idx == phoneNumber.length()) {
            String cMnemonic = String.join("", currentmn);
            output.add(cMnemonic);
        } else {
            String[] letter = letters.get(phoneNumber.charAt(idx));
            for (String l : letter) {
                currentmn[idx] = l;
                letterCombinationsHelper(idx + 1, phoneNumber, currentmn, letters, output);
            }

        }
    }
}