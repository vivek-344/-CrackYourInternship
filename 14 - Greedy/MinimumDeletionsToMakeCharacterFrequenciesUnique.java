import java.util.*;

// 1647. Minimum Deletions to Make Character Frequencies Unique
// https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/
class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : s.toCharArray())
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);

        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        frequencies.sort(Collections.reverseOrder());

        int deletions = 0;
        Set<Integer> seenFrequencies = new HashSet<>();

        for (int freq : frequencies) {
            while (freq > 0 && !seenFrequencies.add(freq)) {
                freq--;
                deletions++;
            }
        }

        return deletions;
    }
}