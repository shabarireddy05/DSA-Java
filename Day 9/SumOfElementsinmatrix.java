// https://www.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1
// GFG Sum of elements in a matrix

/*
    initialize sum =0
	iterate through each element and accumulate the sum
	
*/
public class SumOfElementsinmatrix {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        int sum=0;
         for(int i=0;i<N;i++){
             for(int j=0;j<M;j++){
                 sum+=Grid[i][j];
             }
         }
         return sum;
     }
}
