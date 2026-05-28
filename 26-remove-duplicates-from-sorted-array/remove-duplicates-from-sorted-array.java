class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 0; // stores position for unique elements
        int n = nums.length;

        // traverse array
        for (int i = 0; i < n; i++) {

            int j = i;

            // move j until duplicate elements end
            while (j < n && nums[i] == nums[j]) {
                j++;
            }

            // store unique element
            nums[k++] = nums[i];

            // move i to last duplicate index
            i = j - 1;
        }

        // return count of unique elements
        return k;
    }
}