/*[3:07 PM] Rahul Eslavath
Given a string s, find the length of the longest 
substring without repeating characters.
  
Example 1:
 
Input: s = "abcabcbb"    // 

Output: 3

Explanation: The answer is "abc", with the length of 3.

Example 2:
 
Input: s = "bbbbb"

Output: 1

Explanation: The answer is "b", with the length of 1.

Example 3:
 
Input: s = "pwwkew"            // get(c)

Output: 3

Explanation: The answer is "wke", with the length of 3.

Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 nd spaces. */
 
 // Logic

 // 1 .. Iterate , Checking in the map...

 // sliding window -- last - start +1 
import java.util.*;
import java.util.HashMap;

 public class permutation{
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "pwwkew";
        int len = 0;
        int first =0;
       // int last = 0;
        for(int last =0;last<s.length();last++){
            char curr = s.charAt(last);

            if(map.containsKey(curr)){
                first = Math.max(first,map.get(curr)+1);
            }
            map.put(curr, last);
            len = Math.max(len, last- first + 1);
        }
        System.out.println(len);
            }
        }


        //

