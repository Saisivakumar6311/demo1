package slpracticeproject4;

import java.util.Scanner;
public class longestincreasingsub {

	    static int max_ref;
	    
	    static int _lis(int arr[], int n)
	    {
	        
	        if (n == 1)
	            return 1;
	 
	        int tes, max_ending_here = 1;
	 
	        for (int i = 1; i < n; i++) {
	            tes = _lis(arr, i);
	            if (arr[i - 1] < arr[n - 1]
	                && tes + 1 > max_ending_here)
	                max_ending_here = tes + 1;
	        }
	 
	        if (max_ref < max_ending_here)
	            max_ref = max_ending_here;
	 
	        return max_ending_here;
	    }
	 
	    static int lis(int arr[], int n)
	    {
	        
	        max_ref = 1;
	 
	        _lis(arr, n);
	 
	        return max_ref;
	    }
	    public static void main(String args[])
	    {
	    	Scanner input=new Scanner(System.in);
	    	System.out.println("Enter the total size of the array");
	    	int size=input.nextInt();
	        int arr[] = new int[size];
	        System.out.println("Enter the given elements in the array");
	        for(int i=0;i<size;i++)
	        	arr[i]=input.nextInt();
	        int n = size;
	        System.out.println("And finally Length of longest increasing subsequence is " + lis(arr, n) + "\n");
	    }
	}