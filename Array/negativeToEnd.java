/*Given an unsorted array arr[] of size N having both negative and positive integers. 
The task is place all negative element at the end of array
 without changing the order of positive element and negative element. */

 class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> negative= new ArrayList<>();
        ArrayList<Integer> positive= new ArrayList<>();
        int t=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                positive.add(arr[i]);
            }else{
                negative.add(arr[i]);
            }
        }
        int[] temp=new int[negative.size()+positive.size()];
        int count=0;
        for(int j=0;j<positive.size();j++){
            temp[count++] = positive.get(j);
        }
        for(int k=0;k<negative.size();k++){
            temp[count++] = negative.get(k);
        }
        for(int m=0;m<temp.length;m++){
            arr[m] = temp[m];
        }
        }
}