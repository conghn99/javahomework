public class _27 {
    int[] arr ={1,1,2,2,3,3,4,4,5,5};
    int a = removeElement(arr, 3);
    public int removeElement(int[] nums, int val) {
        int m = 0;    
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
     }
}