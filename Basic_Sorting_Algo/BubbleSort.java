public class BubbleSort{
   public static void BubbleSortAlgo(int arr[]){
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];   //time complexity => O(n2)
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
      }
   } 
   public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
    System.out.println();
   }
   public static void main(String[] args) {
      int arr[]={3,2,4,5,8,1};
      BubbleSortAlgo(arr);
      printarr(arr);
   }
}