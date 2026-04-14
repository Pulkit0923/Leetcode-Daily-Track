//brute force
// class Solution {
//     public boolean isAnagram(String s, String t) {
//       if(s.length()!= t.length()){
//         return false;
//       }
//       else {                                              
//       char[] a= s.toCharArray();
//       char[] b= t.toCharArray();
//       Arrays.sort(a);
//       Arrays.sort(b);
//       for(int i =0;i<a.length;i++){
//         if(a[i]!=b[i]){
//           return false;
//         }
        
//       }
//       return true;
//       }
//     }
// }


// as hashmap works on o[1] so  this is optimal approach


class Solution {
    public boolean isAnagram(String s, String t) {
        //base case
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();

        //filling hashmap 1 and then 2 

        for(int i = 0; i<s.length();i++){
            if(smap.containsKey(s.charAt(i))){  //checks for each index in string if it is present in map or not
                int freq = smap.get(s.charAt(i));  // taking the value of that key(how many times it came)
                smap.put(s.charAt(i),freq+1);      // if it already there then frequency++
            }
            else{
                smap.put(s.charAt(i),1);  // else put 1 in place of value
            }
        }

         for(int i = 0; i<t.length();i++){
            if(tmap.containsKey(t.charAt(i))){
                int freq = tmap.get(t.charAt(i));
                tmap.put(t.charAt(i),freq+1);
            }
            else{
                tmap.put(t.charAt(i),1);
            }
        }

        for(char ch: smap.keySet()){
            if(!tmap.containsKey(ch) || !smap.get(ch).equals(tmap.get(ch))){
    return false;
}
            
        }
     return true;   
    }
}