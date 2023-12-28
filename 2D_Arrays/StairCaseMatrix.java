public class StairCaseMatrix {
    public static boolean SearchNum(int Matrix[][],int key){
        int row=0,col=Matrix.length-1;
        while(row<Matrix.length && col>=0){
            if(Matrix[row][col]==key){
                System.out.println("Number found at ("+row+","+col+")");
                return true;
            }
            else if(key<Matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int Matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        int key=20;
        SearchNum(Matrix, key);

    }
}
