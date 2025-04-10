package com.coding;

import java.util.HashMap;

public class BitManipulationLongestAwesomeSubstring {
    public static int longestAwesome(String s) {
        int                       maxLength = 0;
        int                       bitmask   = 0;    // Represents odd/even occurrences of digits 0-9
        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        prefixMap.put(0, -1);    // Initialize for the case where the entire substring is awesome

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';    // Convert character to integer

            bitmask ^= (1 << digit);          // Toggle the bit for this digit

            // Case 1: Check if this bitmask has been seen before
            if (prefixMap.containsKey(bitmask)) {
                maxLength = Math.max(maxLength, i - prefixMap.get(bitmask));
            } else {
                prefixMap.put(bitmask, i);
            }

            // Case 2: Check for bitmasks with at most one bit different
            for (int j = 0; j < 10; j++) {
                int toggledBitmask = bitmask ^ (1 << j);

                if (prefixMap.containsKey(toggledBitmask)) {
                    maxLength = Math.max(maxLength, i - prefixMap.get(toggledBitmask));
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestAwesome("3242415"));     // Output: 5
        System.out.println(longestAwesome("12345678"));    // Output: 1
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
