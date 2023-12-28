import java.util.Arrays;

public class InbuiltSort {     
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
        System.out.println();
    }
     public static void main(String[] args) {
        int arr[]={4,5,2,1,8,3};
        //Arrays.sort(arr);
        Arrays.sort(arr,0,6); //It is used when we want to sort in asending order
        printarr(arr);
    }
}
