package com.ucok.solution.strings;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateCharactersTest {

    private final DuplicateCharacters dc = new DuplicateCharacters();

    @Test
    void countDuplicateChars() {
        Map<Character, Integer> result = new HashMap<>();
        result.put('a', 2);
        result.put('b', 2);

        assertEquals(result, dc.countDuplicateChars("baba"));
    }

    @Test
    void countDuplicateCharsWithStream() {
        Map<Character, Long> result = new HashMap<>();
        result.put('a', 2L);
        result.put('c', 2L);

        assertEquals(result, dc.countDuplicateCharsWithStream("caca"));
    }
}