/* 
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 
*/
class findPeak {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
       while(start<end){            //split array into 2 parts
            int mid =start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
     return start;  
    }
}