class Q_No_121_Best_Time_to_Buy_and_Sell_Stock{
	public int maxProfit(int[] prices) {
        	int minPri = prices[0];
        	int maxEar = 0;

        	for(int i = 0; i < prices.length;i++){
            	if(prices[i]- minPri > maxEar) maxEar = prices[i]-minPri;
            	if(prices[i] < minPri) minPri = prices[i];
        	}

        	return maxEar;
    	}
}
