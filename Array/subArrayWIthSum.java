/*Given an unsorted array A of size N that contains only non-negative integers, 
find a continuous sub-array which adds to a given number S.

In case of multiple subarrays, return the subarray which comes first on moving from left to right. */
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) 
    {
        int currentSum=0;
        int left = 0;
        int right = 0;
        boolean flag=false;
        ArrayList<Integer> subarray= new ArrayList<>();
        for(int i=0;i<n;i++){
            
            currentSum=currentSum+arr[i];
            if(currentSum>=sum){
                right=i;
                while(currentSum>sum && left<right){
                    currentSum=currentSum-arr[left];
                    left++;
                }
                if(currentSum==sum){
                    subarray.add(left+1);
                    subarray.add(right+1);
                    return subarray;
                }
            }
        }
            subarray.add(-1);
      
        return subarray;
    }
}