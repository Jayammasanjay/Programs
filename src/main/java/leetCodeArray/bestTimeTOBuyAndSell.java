package leetCodeArray;

public class bestTimeTOBuyAndSell {
    public static void main(String[] args) {
        int[] price={7,1,5,3,6,4};
        int res=maxProfit(price);
        System.out.println(res);
    }

        public static int maxProfit(int[] prices) {
            if (prices == null || prices.length <= 1) {
                return 0;
            }

            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;


            for (int i = 0; i < prices.length; i++) {
                // Update minPrice if we find a new lower price
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                }
                // Calculate profit if we were to sell at the current price
                int profit = prices[i] - minPrice;
                // Update maxProfit if we find a higher profit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }

            return maxProfit;
        }


    }


