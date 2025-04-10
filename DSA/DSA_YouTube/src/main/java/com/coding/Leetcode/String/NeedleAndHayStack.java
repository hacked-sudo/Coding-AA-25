package com.coding.Leetcode.String;

public class NeedleAndHayStack {
    public static void main(String[] args) {
        String needle = "leeto";
        String haystack = "leetcode";

        System.out.println("contains = " + haystack.contains(needle));
        System.out.println("contains = " + haystack.indexOf(needle));
    }
}
