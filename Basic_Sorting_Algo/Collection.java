import java.util.Arrays;
import java.util.Collections;

public class Collection{     
    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
        System.out.println();
    }
     public static void main(String[] args) {
        Integer arr[]={4,5,2,1,8,3};
        //Arrays.sort(arr,Collections.reverseOrder);
        Arrays.sort(arr,0,6,Collections.reverseOrder()); //It is used when we want to sort in descending order
        printarr(arr);
    }
}

