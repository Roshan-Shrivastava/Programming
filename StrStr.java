/**
 * LeetCode Problem: 28. Implement strStr()

Q-6Find the Index of the First Occurrence in a String

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.


*/



import java.util.HashMap;
import java.util.Map;

public class StrStr {
    public static void main(String[] args) {
       System.out.println(strStr("mississippi", "pi"));
    }
    public static int strStr(String haystack, String needle) {
		
		int result=0,left=0,right=needle.length();
		if(haystack.contains(needle)) {
			
		while(right<=haystack.length()) {
			if(haystack.substring(left, right).equalsIgnoreCase(needle)) {
				return left;
			}
			left++;
			right++;
		   }
		}
		
		
		return -1;

	}
}
