import java.util.Scanner;
class Solution2 {
    public int maxProfit(int[] prices) {
        int profit;
        int max = 0;
        int buy = 0, sell;
        for (sell=1; sell< prices.length; sell++){
            if (prices[sell] > prices[buy]){
                profit = prices[sell] - prices[buy];
                max = Math.max(profit,max);
            }
            else{
                buy = sell;
            }

        }
        return max;
    }
}

public class Maximum_Profit_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prices = new int[7];
        for (int i=0; i< prices.length; i++){
            prices[i] = scanner.nextInt();
        }
        int ret = new Solution2().maxProfit(prices);
        System.out.println(ret);
    }
}
