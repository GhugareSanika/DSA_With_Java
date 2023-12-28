import java.util.Scanner;
public class Find_largest_No{
    public static boolean Search(int Matrix[][],int key){
         for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
               if(Matrix[i][j]==key){
                  System.out.println("Key found at ("+i+","+j+")");
                  return true;
               }
            }
        }
        System.out.println("key Not Found");
        return false;
    }
    
    public static void main(String[] args) {
        int Matrix[][]=new int[3][3];
        int n=3,m=3;
        Scanner sc=new Scanner(System.in); 

        //input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               Matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        Search(Matrix, 7);
        sc.close();
    }
}