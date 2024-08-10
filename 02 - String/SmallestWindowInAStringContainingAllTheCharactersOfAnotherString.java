import java.util.*;

// Geeks for Geeks: Smallest Window In A String Containing All The Characters Of Another String
// https://www.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
class SmallestWindowInAStringContainingAllTheCharactersOfAnotherString {
    // Function to find the smallest window in the string s consisting
    // of all the characters of string p.
    public static String smallestWindow(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Populate the map with characters from p
        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int start = 0, end = 0, minStart = 0, minLength = Integer.MAX_VALUE, count = 0;

        // Find the first valid start position
        while (start < s.length()) {
            if (!map.containsKey(s.charAt(start))) {
                start++;
            } else {
                break;
            }
        }

        if (start == s.length()) return "-1";

        end = start;

        // Slide the window
        while (end < s.length()) {
            char endChar = s.charAt(end);
            if (map.containsKey(endChar)) {
                if (map.get(endChar) > 0) {
                    count++;
                }
                map.put(endChar, map.get(endChar) - 1);
            }

            // When a valid window is found, try to minimize it
            while (count == p.length()) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    minStart = start;
                }

                char startChar = s.charAt(start);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0) {
                        count--;
                    }
                }
                start++;

                // Ensure the new start is valid
                while (start < s.length() && !map.containsKey(s.charAt(start))) {
                    start++;
                }
            }
            end++;
        }

        return minLength == Integer.MAX_VALUE ? "-1" : s.substring(minStart, minStart + minLength);
    }
}

