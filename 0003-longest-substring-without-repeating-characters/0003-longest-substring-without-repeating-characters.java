public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store the last index of characters (assuming standard ASCII)
        int[] lastSeen = new int[128];
        // Initialize all positions with -1 to indicate they haven't been seen yet
        java.util.Arrays.fill(lastSeen, -1);
        
        int maxLength = 0;
        int left = 0; // Left boundary of the sliding window
        
        // Iterate through the string with the right boundary pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character was seen inside the current window, move the left pointer
            if (lastSeen[currentChar] >= left) {
                left = lastSeen[currentChar] + 1;
            }
            
            // Update the last seen position of the current character
            lastSeen[currentChar] = right;
            
            // Calculate the window size and update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
