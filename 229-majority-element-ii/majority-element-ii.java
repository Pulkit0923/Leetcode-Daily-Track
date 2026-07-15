// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         HashSet<Integer> map = new HashSet<>();
//         int n = nums.length;
//         int n1 = n/3;
//         for(int i = 0 ;i<n;i++){
//             int count = 1 ;
//             for(int j = i+1;j<n;j++){
//                 if(nums[i]== nums[j]) count++;
//                 if(count>n1){
//                     map.add(nums[i]);
//                 }
//             }
//         }
//         return new ArrayList<>(map);
//     }
// }

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int n = nums.length;
        int n1 = n/3;
        for(int i = 0 ;i<n; i++){
            int count = 1;
            for(int j =i+1 ;j<n ; j++){
                if(nums[i]== nums[j]){
                    count++;
                }
            }
            if(count > n1){
                hash.add(nums[i]);
            }
        }
        return new ArrayList<>(hash);
    }
}

// this is brute force with big o of n square
// there can be atmost 2 elements in an array that appear more than n/3 times because if more than 2 then size of array will increrase thats why not possible