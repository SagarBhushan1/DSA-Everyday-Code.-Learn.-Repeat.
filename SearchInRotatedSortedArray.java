class SearchInRotatedSortedArray{
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }

    public static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int mid;
        while(s<=e){
            mid = s + (e - s) / 2;
            if(nums[mid] == target) return mid;
            else if (nums[s] <= nums[mid]){ // left side
                if(target >= nums[s] && nums[mid] > target){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }else{
                if(target >= nums[mid] && target <= nums[e]){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
