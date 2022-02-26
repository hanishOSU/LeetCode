package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestHappyString1405 {
    public String longestDiverseString(int a, int b, int c) {
        //Build hashmap with digits other than last character
        //findWhichOneIsGreater if it is not last element of string then
        //Use that value twice if possible else as findWhichOneIsGreater
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        if (a != 0) {
            map.put('a', a);
        }
        if (b != 0) {
            map.put('b', b);
        }
        if (c != 0) {
            map.put('c', c);
        }
        while (!map.isEmpty()) {
            Character key = findWhichOneIsGreater(map);
            sb.append(key);
            if (key == 'a') a--;
            if (key == 'b') b--;
            if (key == 'c') c--;
            map = BuildHashMap(a,b,c, sb);
        }
        return sb.toString();

    }

    private Map<Character, Integer> BuildHashMap(int a, int b, int c, StringBuilder sb) {
        Map<Character, Integer> map = new HashMap<>();
            if ( lastTwoDigitsAreNotSame(sb, 'a') && a != 0 ) {
                map.putIfAbsent('a', a);
            }
            if ( lastTwoDigitsAreNotSame(sb, 'b') && b != 0 ) {
                map.putIfAbsent('b', b);
            }
            if ( lastTwoDigitsAreNotSame(sb, 'c') && c != 0) {
                map.putIfAbsent('c', c);
            }
        return map;
    }

    private boolean lastTwoDigitsAreNotSame(StringBuilder sb, Character z) {
        if (sb.length() >= 2) {
            return !(sb.charAt(sb.length()-1) == z && sb.charAt(sb.length() - 2) == z);
        }
        return true;
    }

    private Character findWhichOneIsGreater(Map<Character, Integer> map) {
        Character key = 0;
        int max = 0;


        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if (entry.getValue().compareTo(max) > 0)
            {
                key = entry.getKey();
                max = entry.getValue();
            }
        }
        return key;
    }
}
