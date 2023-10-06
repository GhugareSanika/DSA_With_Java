/*
 .................................Zero_OneTriangle...........................
 Problem - Write a java program to print Zero_OneTriangle 
           (Take the input from user)
 Sample input=5
 Sample output=
                1 
                0 1 
                1 0 1 
                0 1 0 1 
                1 0 1 0 1 
*/

import java.util.Scanner;
public class Zero_OneTriangle {
      public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number-");
        int n=sc.nextInt();
         //Outer loop
         for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum %2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
         }
         sc.close();
      }    
}
