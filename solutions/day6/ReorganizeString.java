package solutions.day6;

import java.util.Arrays;

// 767. Reorganize String
// https://leetcode.com/problems/reorganize-string/
public class ReorganizeString {
    public String reorganizeString(String s) {
        StringBuilder str = new StringBuilder(s);
        char[] arr = new char[s.length()];

        int[][] freq = new int[26][2];

        for (int i = 0; i < s.length(); i++){
            int[] temp = freq[s.charAt(i) - 'a'];
            temp[0] += 1;
            temp[1] = s.charAt(i);
        }

        Arrays.sort(freq, (a, b) -> Integer.compare(b[0], a[0]));

        int k = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = freq[i][0]; j > 0; j--) {
                arr[k] = (char)freq[i][1];
                k++;
            }
        }

        int index = 0;
        for(int i = 0; i < arr.length; i += 2) {
            str.setCharAt(i, arr[index]);
            index++;
        }

        for(int i = 1; i < arr.length; i+= 2) {
            str.setCharAt(i, arr[index]);
            index++;
        }

        if (str.length() > 1 && str.charAt(0) == str.charAt(1)) return "";
        return str.toString();
    }
}
