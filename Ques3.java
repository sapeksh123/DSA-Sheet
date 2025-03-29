
//Search in Rotated Sorted Array 33. leetcode 
//https://leetcode.com/problems/search-in-rotated-sorted-array/



public class Ques3 {
    public int search(int[] arr, int target) {
        
               
                int n = arr.length;

                for (int i=0 ; i<n ; i++){
                    if (arr[i]==target){
                        return i;
                    }
                }
return -1;
    }
}