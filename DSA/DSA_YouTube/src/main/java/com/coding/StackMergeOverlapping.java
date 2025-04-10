package com.coding;

import java.util.Arrays;
import java.util.Stack;

public class StackMergeOverlapping {
    public static void main(String[] args) {
        int[][] intervals = {{15, 18}, {2, 6}, {8, 10}, {1, 3}};

        System.out.println(Arrays.deepToString(intervals));

        int[][] mergedIntervals = merge(intervals);
        System.out.println("Merged Interval " + Arrays.deepToString( mergedIntervals));

    }

    public static int[][] merge(int[][] intervals){
        Stack<int[]> st = new Stack<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        System.out.println("Sorted " + Arrays.deepToString(intervals));

        for(int i = 0; i < intervals.length; i++){
            if(st.isEmpty() || st.peek()[1] < intervals[i][0]){
               st.push(intervals[i]);
            } else {
                int[] top = st.peek();

                int endMergingPoint = Math.max(intervals[i][1], top[1]);
                top[1] = endMergingPoint;
                //st.push(top); no need to push it again we can directly modify it
            }
        }
        return st.toArray(new int[st.size()][]);
    }
}