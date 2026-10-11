package DSA;

import java.util.*;

public class TrappingRainwater {
	public static int result(int arr[],int n) {
		
		int leftmax[] =new int[n] ;
		int rightmax[] = new int[n];
		
		int lmax = arr[0];
		int rmax = arr[n-1];
		int profit = 0;
		
		for(int i=0;i<n;i++) {
			if(lmax < arr[i]) {
				lmax = arr[i];
			}
			leftmax[i]=lmax;
		}
		
		for(int i=n-1;i>=0;i--) {
			if(rmax < arr[i]) {
				rmax = arr[i];
			}
			rightmax[i] = rmax;
		}
		
		for(int i=0;i<n;i++) {
			int val = Math.min(leftmax[i], rightmax[i]);
			profit += val -arr[i];
		}
		
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print(result(arr,n));
		
	}

}
