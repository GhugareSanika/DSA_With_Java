public class BuySellStock {
     public static int BuySell(int prices[]){
        int BuyPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        
        for(int i=0;i<prices.length;i++){
            if(BuyPrice<prices[i]){  //Profit case
                int profit=prices[i]-BuyPrice;
                maxprofit=Math.max(maxprofit,profit);
            }else{
               BuyPrice=prices[i];
            }
        }
        return maxprofit;
     }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,1};
        System.out.println(BuySell(prices));
    }
}
