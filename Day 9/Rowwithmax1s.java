// https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1
// GFG: Row with max 1s


/*
   Initialize two variables, max to track the maximum count of 1s, 
   and index to store the corresponding row index.
   in starting we assume that there are now row exits that conatins 1 so index=-1,max=0,
   Use a loop to iterate through each row of the matrix.
   For each row, initialize a count variable to keep track of the number of 1s in that row.
   Compare the count of 1s in the current row with the maximum count so far.
   If the current row has more 1s, update the maximum count (max) and the corresponding row index (index).

*/
public class Rowwithmax1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        int max = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                index = i;
            }
        }

        return index;
    }
}
