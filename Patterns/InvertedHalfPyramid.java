/* .................................InvertedHalfPyramid...........................
 Problem - Write a java program to print InvertedHalfPyramid 
           (Take the input from user)
 Sample input=4
 Sample output=
                * * * * 
                * * * 
                * * 
                * 
 */

import java.util.Scanner;
public class InvertedHalfPyramid {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number-");
    int n=sc.nextInt();
     for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
     }
     sc.close();
  }  
}
