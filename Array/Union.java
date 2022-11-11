/*Given two arrays a[] and b[] of size n and m respectively. 
The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. 
If there are repetitions, then only one occurrence of element should be printed in the union. */
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> temp = new HashSet<Integer>();  
        for(int i=0;i<n;i++){
            temp.add(a[i]);
        }
        for(int j=0;j<m;j++){
            temp.add(b[j]);
        }
        return temp.size();
        
    }
}