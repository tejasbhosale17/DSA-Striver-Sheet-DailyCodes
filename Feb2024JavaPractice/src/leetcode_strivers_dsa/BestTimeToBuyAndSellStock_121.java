package leetcode_strivers_dsa;

public class BestTimeToBuyAndSellStock_121 {
	
//=============== MY LOGIC, MY CODE ================	
//    public static int maxProfit(int[] prices) {
//        int max=prices[0];
//        int min = prices[0]; 
//        for (int i = 0; i < prices.length; i++) {  
//           if(prices[i] <min)  
//               min = prices[i];  
//        }
//        for(int i=0;i<(prices.length-1);i++) {
//        	for(int j=i+1;j<prices.length;j++) {
//        		if(max>(prices[i]-prices[j])) {
//        			max=(prices[i]-prices[j]);
//        		}
//        	}
//        }
//        max=max*(-1);
//        
//        if(prices[prices.length-1]==min) {
//        	if(max>min) {
//        		return max;
//        	}
//        	return 0;
//        }
//
//        return max; 
//    }

//=================== CHAT GPT ===========================
	public static int maxProfit(int[] prices) {
		if(prices==null ||prices.length==0) {
			return 0;
		}
		 int minPrice=prices[0];
		 int maxPrice=0;
		 
		 for(int i=1;i<prices.length;i++) {
			 if(prices[i]<minPrice) {
				 minPrice=prices[i];
			 }else {
				 int profit=prices[i]-minPrice;
				 if(profit>maxPrice) {
					 maxPrice=profit;
				 }
			 }
		 }
		 return maxPrice;
		 
		 
	}
	
	
	
    public static void main(String[] args) {
		int prices[] = {2,4,1};
		int vmax=maxProfit(prices);
		System.out.println(vmax);
	}
}
