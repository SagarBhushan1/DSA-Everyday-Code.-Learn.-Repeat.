class KadaneAlgo{
    public static void main(String[] args) {
        int[] arr = {-31,2,9,-401,99};
        System.out.println(maxSubArraySum(arr));
    }
    // Kadane's Algorithm | Maximum Subarray Sum
    public static int maxSubArraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for( int i = 0 ; i < arr.length ; i++ ){
            currSum += arr[i];
            maxSum = Math.max(currSum,maxSum);
            if( currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
