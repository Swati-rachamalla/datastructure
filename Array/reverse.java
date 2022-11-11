/*Given an array A of size N, print the reverse of it.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    int testcase = scanner.nextInt();
	    for (int k=0;k<testcase;k++){
    	    int size= scanner.nextInt();
    	    
    	    int[] array= new int[size];
    	    for (int i=0;i<size;i++){
    	        array[i]= scanner.nextInt();
    	    }
    	    for(int j=size-1;j>=0;j--){
    	        System.out.print(array[j]+" ");
    	    }
    	    System.out.println();
	    }
	}
}