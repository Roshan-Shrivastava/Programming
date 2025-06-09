/**
 * 
 * Length of Last Word

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.


Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.


*/


public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        // Output: 5
    }
    public static int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
		int result=str[str.length-1].length();
		return result;

    }
}

