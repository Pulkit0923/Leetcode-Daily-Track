// // this is brute solutuin(array)
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int [] ans = new int[2];
//         for(int i =0;i<nums.length;i++){
//             boolean flag =false;
//             for(int j = i+1;j<nums.length;j++){
//                 if( nums[i] + nums[j]== target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag== true){
//                 break;
//             }
//         }
//         return ans;
//     }
// }



// optimal solution(HashMap)


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> smap = new HashMap<>();
        int[] ans = {-1,-1};
        for(int i = 0 ;i<nums.length;i++){
        int remaining = target - nums[i];
        if(smap.containsKey(remaining)){
            ans[0]= i;
            ans[1]= smap.get(remaining);
        }
        smap.put(nums[i],i);
    }
    return ans;
}
}