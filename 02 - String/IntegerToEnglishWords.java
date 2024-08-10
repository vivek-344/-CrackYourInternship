// 273. Integer to English Words
// https://leetcode.com/problems/integer-to-english-words/description/
public class IntegerToEnglishWords {
    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        StringBuilder s = new StringBuilder(num + "");
        while (s.length() % 3 != 0)
            s.insert(0, '0');

        String regex = "(?<=\\G.{3})";
        String[] arr = s.toString().split(regex);

        String[] digits = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] ele = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] ref = {"", "Thousand", "Million", "Billion"};

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            String temp = "";
            char first = str.charAt(0);
            char second = str.charAt(1);
            char third = str.charAt(2);
            if (first != '0') temp += digits[first - '0'] + " Hundred";
            if (second == '1') {
                if (!temp.isEmpty()) temp += " ";
                temp += ele[third - '0'];
            } else {
                if (second != '0') {
                    if (!temp.isEmpty()) temp += " ";
                    temp += tens[second - '0'];
                }
                if (third != '0') {
                    if (!temp.isEmpty()) temp += " ";
                    temp += digits[third - '0'];
                }
            }
            if (!temp.isEmpty()) temp += " " + ref[arr.length - 1 - i];
            arr[i] = temp.trim();
        }

        StringBuilder res = new StringBuilder();
        for (String string : arr) {
            if (!string.isEmpty()) {
                if (!res.isEmpty()) res.append(" ");
                res.append(string);
            }
        }
        return res.toString().trim();
    }
}
