/* .................................RotateHalfPyramid...........................
 Problem - Write a java program to print RotateHalfPyramid 
           (Take the input from user)
 Sample input=6
 Sample output=
                *
               **
              ***
             ****
            *****
           ****** 
          
 */

import java.util.Scanner;

public class RotateHalfPyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number-");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
