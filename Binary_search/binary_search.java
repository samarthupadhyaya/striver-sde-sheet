package Binary_search;

public class binary_search {
    public static int search(int[] nums, int target) {
        
//         binary search approach
        
        
        int start=-0,end=nums.length-1;
        int i=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
   int nums[]={2,4,5,6,7,8,9,10};
        System.out.println(search(nums,7));
    }
}
