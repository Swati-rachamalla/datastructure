/*Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array. */ class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        int start=0;
        long largest=0;
        long smallest=0;
        pair p=new pair(a[0],a[0]);
        for(int i=1;i<n;i++){
            if(a[i]>p.second){
                p.second=a[i];
            }else if(a[i]<p.first){
                p.first=a[i];
            }
        }
        
        return p;
    }
}