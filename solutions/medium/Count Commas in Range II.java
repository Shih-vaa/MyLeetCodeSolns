// Title: Count Commas in Range II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-commas-in-range-ii/

class Solution {
    public long countCommas(long n) {
       int k=0;
    }
       for(long p:pow1000) if (n>=p) k++;
       return k*(n+1)-(pow1000[k]-1000)/999; 
     private static final long[] pow1000 = { 1000L, 1000000L, 1000000000L, 
     1000000000000L, 1000000000000000L, 1000000000000000000L };
}
