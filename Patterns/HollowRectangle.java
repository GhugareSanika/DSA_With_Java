/* .................................HollowRectangle...........................
 Problem - Write a java program to print HollowRectangle 
           (Take the input from user)
 Sample input= N=5 M=6
 Sample output=
                * * * * * * 
                *         * 
                *         * 
                *         * 
                * * * * * * 
 */

import java.util.Scanner;
public class HollowRectangle {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row number-");
        int N=sc.nextInt();
        System.out.print("Enter column number-");
        int M=sc.nextInt();

          for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(i==0 || i==N-1 || j==0 || j==M-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
