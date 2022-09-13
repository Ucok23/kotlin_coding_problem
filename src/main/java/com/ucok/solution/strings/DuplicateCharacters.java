package com.ucok.solution.strings;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    /**
     * First solution
     */
    public Map<Character, Integer> countDuplicateChars(@NotNull String str) {
        Map<Character, Integer> result = new HashMap<>();

        // or use for(char ch: str.toCharArray()) { ... }
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++ v);
        }

        return result;
    }


    public Map<Character, Long> countDuplicateCharsWithStream(@NotNull String str) {

        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
