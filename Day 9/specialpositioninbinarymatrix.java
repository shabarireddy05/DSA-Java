// https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/
// LeetCode: Special Positions in a Binary Matrix

/*
Approach->
Counting occurrences:
       You initialize two array, row and col, to store the counts for each
	   element in its respective row and column.

Identifying special elements:
        You iterate through the matrix again, checking if an element is present
	    and if its corresponding row and column counts are both equal to 1.

Counting special elements:
        If both conditions are met, the element is considered "special" 
		and you increment  ans variable.

Final result: 
       The function returns the final ans of special elements in the matrix.


*/

public class specialpositioninbinarymatrix {
    public int numSpecial(int[][] mat) {
        // Get the number of rows and columns in the matrix
       int n = mat.length;
       int m = mat[0].length;

       // Arrays to store the count of 1s in each row and each column
       int[] row = new int[n];
       int[] col = new int[m];

       // Initialize the count arrays to zero
       for (int i = 0; i < n; i++)
           row[i] = 0;
       for (int j = 0; j < m; j++)
           col[j] = 0;

       // Count the number of 1s in each row and each column
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
               if (mat[i][j] == 1) {
                   row[i]++;
                   col[j]++;
               }
           }
       }

       // Count the number of special positions where there is only one 1 in both its row and column
       int ans = 0;
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
               if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                   ans++;
               }
           }
       }

       // Return the total count of special positions
       return ans;
   }
}
