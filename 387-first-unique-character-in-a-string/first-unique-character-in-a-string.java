class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // if first index and last index are same
            // then character came only one time
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                // return index of first unique character
                return i;
            }
        }
        // if no unique character found
        return -1;
    }
}