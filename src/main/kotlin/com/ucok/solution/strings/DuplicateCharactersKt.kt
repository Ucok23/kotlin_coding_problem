package com.ucok.solution.strings

class DuplicateCharactersKt {
    fun countDuplicateChars(str: String): Map<Char, Int> {
        val result = mutableMapOf<Char, Int>()

        // or use for(char ch: str.toCharArray()) { ... }
        for (element in str) {
            result.compute(
                element
            ) { _: Char?, _v: Int? ->
                var v = _v
                if (v == null) 1 else ++v
            }
        }
        
        return result
    }
}

fun main() {
    val dc = DuplicateCharactersKt()
    println(dc.countDuplicateChars("baba"))
}
