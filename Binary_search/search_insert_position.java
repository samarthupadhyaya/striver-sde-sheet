package Binary_search;

public class search_insert_position {
    public static int insertposition(int nums[],int target){
    int low=0;
    int high=nums.length-1;
        while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target)
            return mid;
        else if(nums[mid]>target)
            high=mid-1;
        else
            low=mid+1;

    }
        return low;
}

    public static void main(String[] args) {
    int nums[]={2,1,4,6,7,8,9};
        System.out.println(insertposition(nums,4));
    }
}
