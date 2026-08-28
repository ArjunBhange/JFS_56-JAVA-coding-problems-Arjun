package task;

import java.util.Scanner;

public class Primepos {
	public static void position(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=2;j*j<arr[i];j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(i+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		position(arr);
	}

}
