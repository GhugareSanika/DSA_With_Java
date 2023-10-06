/* .................................InvertedHalfPyramidNumber...........................
 Problem - Write a java program to print InvertedHalfPyramidNumber 
           (Take the input from user)
 Sample input=6
 Sample output=
               1 2 3 4 5 6 
               1 2 3 4 5 
               1 2 3 4 
               1 2 3 
               1 2 
               1 
 */

import java.util.Scanner;

public class InvertedHalfPyramidNumber {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number-");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
