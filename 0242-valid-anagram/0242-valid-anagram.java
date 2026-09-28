import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: Anagrams must be the exact same length
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Step 2: Count frequencies of characters in string 's'
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Step 3: Decrement frequencies using string 't'
        for (char c : t.toCharArray()) {
            // If character doesn't exist or we have too many of it
            if (!charCounts.containsKey(c) || charCounts.get(c) == 0) {
                return false;
            }
            charCounts.put(c, charCounts.get(c) - 1);
        }

        return true;
    }
}
