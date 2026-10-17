package DSA;

import java.util.Scanner;

public class EvenOddSubarray {
	
	public static int result(int arr[], int n) {
		
		int res=1;
		for(int i = 0; i < n; i++) {
			int curr = 1;
			for(int j = i+1; j < n; j++) {
				if( (	(arr[j] % 2 ==0 && arr[j-1] % 2 !=0)) ||
					( 	(arr[j] % 2 !=0 && arr[j-1] % 2 ==0)) ) {
					curr++;
				}else {
					break;
				}
				res = Math.max(curr, res);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(result(arr,n));
		
	}

}
