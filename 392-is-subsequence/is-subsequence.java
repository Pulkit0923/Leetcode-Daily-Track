class Solution {
    public boolean isSubsequence(String s, String t) {

        // Pointer for s
        int i = 0;

        // Pointer for t
        int j = 0;

        // Traverse both strings
        while (i < s.length() && j < t.length()) {

            // If characters match, move pointer of s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            // Always move pointer of t
            j++;
        }

        // If all characters of s are matched
        return i == s.length();
    }
}