/*
  input: {{1,2,3,4},
         {5,6,7,8},
         {9,10,11,12},
         {13,14,15,16}}
         
  Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
 */

public class SpiralMatrix {
    public static void SpiralMatrixfun(int Matrix[][]){
        int StartRow=0;
        int StartColumn=0;
        int EndRow=Matrix.length-1;
        int EndColumn=Matrix[0].length-1;

        while (StartRow<=EndRow && StartColumn<=EndColumn) {

            //Top
            for(int j=StartColumn;j<=EndColumn;j++){
                System.out.print(Matrix[StartRow][j]+" ");
            }

            //right
            for(int i=StartRow+1;i<=EndRow;i++){
                System.out.print(Matrix[i][EndColumn]+" ");
            }

            //Bottom
            for(int j=EndColumn-1;j>=StartColumn;j--){
                if(StartRow==EndRow){
                    break;
                }
                System.out.print(Matrix[EndRow][j]+" ");
            }

            //left
            for(int i=EndRow-1;i>=StartRow+1;i--){
                if(StartColumn==EndColumn){
                    break;
                }
                System.out.print(Matrix[i][StartColumn]+" ");
            }
            StartColumn++;
            StartRow++;
            EndColumn--;
            EndRow--;
        }
        System.out.println();
    }




    public static void main(String[] args) {
        int Matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        SpiralMatrixfun(Matrix);
    }
}
