/*
Java 6’s Arrays.sort() – Quicksort
Best Case Time Complexity- O(NlogN)
Average Case Time Complexity- O(NlogN)
Worse Case Time Complexity- O(N2)
Auxiliary Space- O(logN)
Stable- Depends
Adaptive- No

Java 7’s Arrays.sort() – Timsort (Hybrid of Mergesort and Insertion Sort)
Best Case Time Complexity- O(N)
Average Case Time Complexity- O(NlogN)
Worse Case Time Complexity- O(NlogN)
Auxiliary Space- O(N)
Stable- Yes
Adaptive- Yes

Java’s Collections.sort() – Mergesort
Best Case Time Complexity- O(NlogN)
Average Case Time Complexity- O(NlogN)
Worse Case Time Complexity- O(NlogN)
Auxiliary Space- O(N)
Stable- Yes
Adaptive- Yes */
class Solution 
{ 

    int[] selectionSortArr(int[] arr, int n) //smallest element comes first
        { 
        for(int i=0;i<n-1;i++){
                int min=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[min]){
                        min=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
            return arr;
        }


    int[] bubbleSortArr(int[] arr, int n) //largest elememt first
    { 
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =  arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    int[] insertionSortArr(int[] arr, int n) //add unsorted element in sorted list
    { 
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0&& key<arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}