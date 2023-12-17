
//Brute Force Method which is having the poor time complexity

public class Max_SubArray_Sum{
    public static void MaxSubArraysSum(int numbers[]){
        int currSum=0;
        int MAXSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(MAXSum<currSum){
                   MAXSum=currSum;
                }
            }
        }
         System.out.println("Maximum Sum:"+MAXSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,-3,4,5,-6};
         MaxSubArraysSum(numbers);
    }
}
