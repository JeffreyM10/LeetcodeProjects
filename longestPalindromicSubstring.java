class Solution {
    public String longestPalindrome(String s) {
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expand(s, i, i);      // Odd-length 
        int len2 = expand(s, i, i + 1);  // Even-length 
        int maxLen = Math.max(len1, len2);
        if (maxLen > end - start) {
             start = i - (maxLen - 1) / 2;
             end = i + maxLen / 2;
    }
}
    return s.substring(start, end + 1);

    }

    private int expand(String s, int left, int right) {
        // Expand while characters match and within bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;  // Move left outward
            right++; // Move right outward
        }
    // Return length of the palindrome (right - left - 1)
        return right - left - 1;
    }
}
