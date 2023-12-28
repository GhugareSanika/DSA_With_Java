public class Transpose_Of_Matrix {
     public static void printMatrix(int matrix[][]) {
            System.out.println("The matrix is: ");

            for(int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix[0].length; j++) {
                   System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 2, column = 3;
        int matrix[][] = { {2, 5, 10}, {11, 26, 7} };

        // Display original matrix
        printMatrix(matrix);
        // Transpose the matrix
        int transpose[][]  = new int[column][row];
        for(int i = 0; i<row; i++) {
            for (int j = 0; j<column; j++) {
               transpose[j][i] = matrix[i][j];
            }
          }
          // print the transposed matrix
          printMatrix(transpose);
        }
       
}
