package solutions.day5;

// 151. Reverse Words in a String
// https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();

        for (String str: s.split(" "))
            if (!str.isEmpty())
                res.insert(0, str + " ");

        return res.toString().trim();
    }
}
