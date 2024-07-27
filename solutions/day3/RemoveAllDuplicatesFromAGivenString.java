package solutions.day3;

import java.util.*;

// Couldn't Find "Print all the duplicate characters in a string" from the sheet on GFG Practice so solved this one instead :)
// Geeks for Geeks: Remove All Duplicates From A Given String Problem
// https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1
public class RemoveAllDuplicatesFromAGivenString {
    String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char ch: s.toCharArray()) {
            if (set.add(ch)) {
                str.append(ch);
            }
        }
        return str.toString();
    }
}
