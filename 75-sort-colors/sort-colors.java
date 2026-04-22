class Solution {
    public static void swap(int[]arr,int low,int mid){
        int temp = arr[low]; 
        arr[low]=arr[mid];
        arr[mid]=temp;
    }
    public void sortColors(int[] arr) {
        int n = arr.length;
        int mid = 0;
        int low = 0;
        int high = n-1;
        while(mid<=high){
        if(arr[mid]==0){
            swap(arr,low,mid);
            low++;
            mid++;
        }
        else if(arr[mid]==1){
            mid++;
        }
        else {
            swap(arr,mid,high);
            high--;
        }

    }
}
}