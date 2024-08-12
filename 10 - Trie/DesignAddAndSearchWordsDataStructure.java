// 211. Design Add and Search Words Data Structure
// https://leetcode.com/problems/design-add-and-search-words-data-structure/
public class DesignAddAndSearchWordsDataStructure {

    static class WordDictionary {

        WordDictionary[] arr;
        boolean end;

        public WordDictionary() {
            arr = new WordDictionary[26];
            end = false;
        }

        public void addWord(String word) {
            WordDictionary curr = this;
            for (char ch: word.toCharArray()) {
                if (curr.arr[ch - 'a'] == null)
                    curr.arr[ch - 'a'] = new WordDictionary();
                curr = curr.arr[ch - 'a'];
            }
            curr.end = true;
        }

        public boolean search(String word) {
            return search(word, this, 0);
        }

        boolean search(String word, WordDictionary curr, int index) {
            for ( ; index < word.length(); index++) {
                char ch = word.charAt(index);
                if (ch == '.') {
                    for (int i = 0; i < 26; i++) {
                        if (curr.arr[i] == null) continue;
                        if (search(word, curr.arr[i], index + 1)) return true;
                    }
                    return false;
                }
                else if (curr.arr[ch - 'a'] != null) curr = curr.arr[ch - 'a'];
                else return false;
            }
            return curr.end;
        }
    }
}
