class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) return n;

        int maxlen = 0;
        int i = 0;
        int j =0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (j < n) { 

            char ch = s.charAt(j); 

            if (map.containsKey(ch) && map.get(ch) >= i) {

                int len = j - i; // duplicate milne se pehle ka length
                maxlen = Math.max(maxlen, len);

                // direct jump (while loop hata diya)
                i = map.get(ch) + 1;
            }

            map.put(ch, j); // correct index store

            j++;
        }

        int len = j - i; // last window
        maxlen = Math.max(maxlen, len);

        return maxlen;
    }
}