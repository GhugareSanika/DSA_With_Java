public class Diagonal_Sum {
    public static int printDiagonalSum(int Matrix[][]){
        int sum=0;
        for(int i=0;i<Matrix.length;i++){
            //For primary Diagonal
            sum+=Matrix[i][i];

            //For Secondary Diagonal
            if(i!=Matrix.length-1-i) // This Condition is used when no. of columns and rows are odd
              sum+=Matrix[i] [Matrix.length-i-1]; //i+j=Matrix.length-1 => hence j=Matrix.length-i-1
        }
        return sum;
    }
    public static void main(String[] args) {
        int Matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11}};
        System.out.println(printDiagonalSum(Matrix));
    }
}
