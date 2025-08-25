class PrintSubArrays{
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        int[] arr = {-31,2,9,-401,-99};
        // printSubArray(arr);
        System.out.println(maxSubArraySum(arr));
    }

    public static int maxSubArraySum(int[] array){
        int maxSum = Integer.MIN_VALUE;
        for(int st = 0 ; st < array.length ; st ++ ){
            int currSum = 0;
            for(int end = st ; end< array.length ; end++){
                currSum += array[end];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }

    public static void printSubArray(int[] array){
        for(int i = 0; i < array.length; i++ ){
            for(int j = i ; j < array.length ; j++ ){
                for(int index = i; index <= j ; index++){
                    System.out.print(array[index]);
                }
                System.out.print(", ");
            }
            System.out.println();
        }
    }

}
