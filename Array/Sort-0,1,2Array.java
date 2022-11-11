/*Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order. */
class Solution
{
    public static void sort012(int a[], int n)
    {
        divide(a,0,n-1);
    }

public static void divide(int a[],int start,int end){
    if(start>=end)
        return;
    int mid=start+((end-start)/2);
    divide(a,start,mid);
    divide(a,mid+1,end);
    conquer(a,start,mid,end);
}
public static void conquer(int a[],int start,int mid,int end){
    int idx1=start;
    int idx2=mid+1;
    int t=0;
    int[] newArray = new int[end-start+1];
    while(idx1<=mid && idx2<=end){
        if(a[idx1]<a[idx2]){
            newArray[t++]=a[idx1++];
        }else{
            newArray[t++]=a[idx2++];
        }
    }
    while(idx1<=mid){
        newArray[t++]=a[idx1++];
    }
    while(idx2<=end){
        newArray[t++]=a[idx2++];
    }
    for(int i=0,j=start;i<newArray.length;i++,j++){
        a[j] = newArray[i];
    }
}
}