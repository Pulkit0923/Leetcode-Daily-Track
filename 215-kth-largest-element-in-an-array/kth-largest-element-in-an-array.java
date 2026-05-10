// import java.util.PriorityQueue;

// class Solution {

//     public int findKthLargest(int[] nums, int k) {

//         // Min Heap
//         PriorityQueue<Integer> minHeap = new PriorityQueue<>();

//         // Traverse array
//         for (int num : nums) {

//             // Add element
//             minHeap.add(num);

//             // Keep only k elements
//             if (minHeap.size() > k) {
//                 minHeap.poll();
//             }
//         }

//         // kth largest element
//         return minHeap.peek();
//     }
// }



class Solution {

    public int findKthLargest(int[] nums, int k) {

        // Array ko sort karo
        Arrays.sort(nums);

        // kth largest return karo
        return nums[nums.length - k];
    }
}
