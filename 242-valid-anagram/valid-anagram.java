class Solution {
    public boolean isAnagram(String s, String t) {
       // brute force approach  [ tc= O(n log n ) ,  sc = O(n)]

        if(s.length() != t.length()) return false;
        char[] a = s.toCharArray(); // remember this this is a built in function in java  O(n)
        char[] b = t.toCharArray();

        Arrays.sort(a);   // O(log n)
        Arrays.sort(b);

        for(int i = 0 ; i< s.length(); i++){  //O(n)
            if(  a[i] != b[i]) return false;
        }
        return true;



    // optimal approach (using hashmap)

    // if(s.length() != t.length()) return false;
    // HashMap <Character,Integer> map = new HashMap <>();

    // for(int i = 0 ; i< s.length(); i++){
    //     char ch = s.charAt(i);
    //     char cn = t.charAt(i);
    //     int freq = map.get(ch);
    //     // int freq1 = map.get(cn);
    // map.put(ch,freq+1);
    // map.put(cn,freq-1);

    // }
    // for(int ele : map){
    //     if(map.get(ele) != 0) return false;
    // }
    // return true;

    }
}