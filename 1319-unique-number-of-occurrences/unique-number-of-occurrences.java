// we will be using both hashmap and hashset 
//map to store all key value pairs(number,frequency) and set for storing all values(frequencies)
//if both size same then all elements have different frequencies if not same then freq are same of any two elements
// working = > we know hashset does not have duplicate values so if we put all freqs in set and compare it with map 
//agar kuch repeat nhi hoga to dono same honge size m agar freq same hogi to set ka sizze kam hoga bcz no repeated value it can store

//tc = O(n)


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> check = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int key : map.keySet()){
            int val = map.get(key);
            check.add(val);
        }
if(map.size() == check.size()) return true;
else return false;
        }
    }
