/*Given an array arr[] and an integer K where K is smaller than size of array, 
the task is to find the Kth smallest element in the given array.
 It is given that all array elements are distinct.*/
 
 class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        arr = divide(arr,l,r);
        return arr[k-1];
    } 
    
    public static int[] divide(int[] arr, int start, int end){
        if(start>=end){
            return arr;
        }
        int mid=start+((end-start)/2);
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        return conquer(arr,start,mid,end);
    }
    public static int[] conquer(int[] arr,int start,int mid,int end){
        int idx1 = start;
        int idx2 = mid+1;
        int x=0;
        int[] newArray = new int[end-start+1];
        while(idx1<=mid&& idx2<=end){
            if(arr[idx1]<arr[idx2]){
                newArray[x]=arr[idx1++];
            }else{
                newArray[x]=arr[idx2++];
            }
            x++;
        }
        while(idx1<=mid){
             newArray[x++]=arr[idx1++];
        }while(idx2<=end){
             newArray[x++]=arr[idx2++];
        }
        for(int k=0,j=start;k<newArray.length;k++,j++){
            arr[j]=newArray[k];
        }
        return arr;
    }
    
}
