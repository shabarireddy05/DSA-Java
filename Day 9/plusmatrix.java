// https://leetcode.com/problems/plus-one/description/
// LeetCode: Plus One

/*

starts traversing from the end of the array.
If the last element is not 9, it adds 1 to it and returns the array.
If the last element is 9, it sets it to 0 and moves to the previous element.
It repeats steps 2 and 3 until a non-9 element is encountered.
if the number is 999, then we have to make it 1000 (999 + 1 = 1000), 
creates a new array with a length one more than the original and sets the first element to 1.

*/

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } 
            else {
                digits[i] = 0;
            }
        }

        // To handle '999' => 999 + 1 = 1000
        int[] result = new int[n + 1];
        
        result[0] = 1;
        for(int i=1;i<n+1;i++) result[i]=0;
        return result;
    }
}