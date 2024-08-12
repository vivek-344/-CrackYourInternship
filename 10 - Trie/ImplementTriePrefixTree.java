// 208. Implement Trie (Prefix Tree)
// https://leetcode.com/problems/implement-trie-prefix-tree/
public class ImplementTriePrefixTree {
    class Trie {

        Trie[] trie;
        boolean end;

        public Trie() {
            trie = new Trie[26];
            end = false;
        }

        public void insert(String word) {
            Trie ref = this;
            for (char ch: word.toCharArray()) {
                if (ref.trie[ch-'a'] == null)
                    ref.trie[ch - 'a'] = new Trie();
                ref = ref.trie[ch-'a'];
            }
            ref.end = true;
        }

        public boolean search(String word) {
            Trie ref = this;
            for (char ch: word.toCharArray()) {
                if (ref.trie[ch - 'a'] == null)
                    return false;
                ref = ref.trie[ch-'a'];
            }
            return ref.end;
        }

        public boolean startsWith(String prefix) {
            Trie ref = this;
            for (char ch: prefix.toCharArray()) {
                if (ref.trie[ch - 'a'] == null)
                    return false;
                ref = ref.trie[ch-'a'];
            }
            return true;
        }
    }
}
