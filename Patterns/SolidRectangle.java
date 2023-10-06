/* .................................SolidRectangle...........................
 Problem - Write a java program to print SolidRectangle 
           (Take the input from user)
 Sample input= M-4 and N-5
           
 Sample output=  
                * * * * 
                * * * * 
                * * * * 
                * * * * 
                * * * * 
 */
import java.util.Scanner;

public class SolidRectangle {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter row number-");
         int N=sc.nextInt();
         System.out.print("Enter column number-");
         int M=sc.nextInt();

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
