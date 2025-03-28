
// Chocolate Distribution Problem
// Problem Link: https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

import java.util.*;

public class Ques2 {

    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code her
        int n = arr.size();
        Collections.sort(arr);
        int i = 0;
        int j = (m - 1);
        int diff = Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;

        while (j < n) {

            diff = Math.min(diff, arr.get(j) - arr.get(i));
            i++;
            j++;
        }

        return diff;

    }
}
