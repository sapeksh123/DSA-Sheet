// 287. Find the Duplicate Number(Leetcode)
//https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.*;
class Ques1 {
    public int findDuplicate(int[]arr) {
        
        int n= arr.length;
Arrays.sort(arr);
        for (int i=0; i<n ; i++ ){
                if(arr[i]==arr[i+1]){
                    return arr[i];
                
            }
        }
        return -1 ;
    }
}