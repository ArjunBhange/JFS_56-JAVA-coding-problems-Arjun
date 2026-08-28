package task;

import java.util.Scanner;

public class Merge {
	
	public static int[] merge(int n,int arr1[],int m,int arr2[]) {
		int len=n+m;
		int arr[]=new int[len];
		for(int i=0;i<n;i++) {
			arr[i] = arr1[i];
		}for(int i=0;i<m;i++) {
			arr[i+n] = arr2[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int arr2[]=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		int result[] = merge(n,arr1,m,arr2);
		for(int i:result) {
			System.out.print(i+" ");
		}
	}

}
