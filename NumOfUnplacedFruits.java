class NumOfUnplacedFruits {
    public static void main(String[] args) {
        int[] fruits = {4,2,5};
        int[] baskets = {3,5,4};
        System.out.println(numOfUnplacedFruits(fruits,baskets));
    }

    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int result = 0;
        boolean isFiledBasket = false;
        for(int fruit : fruits){
            isFiledBasket = false;
            for(int j = 0 ; j < baskets.length ; j++ ){
                if( fruit <= baskets[j] ){
                    baskets[j] = -1 ;
                    isFiledBasket = true;
                    break;
                }
            }
            if(!isFiledBasket){
                result++;
            }
        }
        return result;
    }
}
