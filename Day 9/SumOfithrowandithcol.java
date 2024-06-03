// https://www.geeksforgeeks.org/problems/sums-of-i-th-row-and-i-th-column3054/1
// GFG: Sums of i-th row and i-th column

/*
  first calculate number of valid rows and colum u can traverse
  calculate the sum of ith row and ith column and check they are equal or not,if they are not equal just return 0
  if for all pairs, the sum of rows and colm are equal then return 1
*/
public class SumOfithrowandithcol {
    int sumOfRowCol(int N, int M, int A[][]) {
        // Calculate the number of valid rows and columns
        int valid = Math.min(N, M);

        for (int i = 0; i < valid; ++i) {
            // Calculate the sum of elements in the ith row
            int rowSum = 0;
            for (int j = 0; j < M; ++j) {
                rowSum += A[i][j];
            }

            // Calculate the sum of elements in the ith column
            int colSum = 0;
            for (int j = 0; j < N; ++j) {
                colSum += A[j][i];
            }

            // Check the sum of ith row and sum of ith column is equal or not
            if (rowSum != colSum) {
                return 0;  // Return 0 if the condition is not satisfied
            }
        }

        // If all pairs of sums are equal, return 1
        return 1;
    }
}
