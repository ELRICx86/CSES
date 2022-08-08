package Intro;

import java.util.ArrayList;
import java.util.Scanner;

public class Two_Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=i+1;
		}
		int x=0;
		
		long count=0;
		int p=0;
		int q=n;
		ArrayList<Integer> arr1=new ArrayList<>();
		
		int m=((n*(n+1))/2)/2;
		if(((n*(n+1))/2)%2!=0)System.out.println("NO");
		else {

			
			for(int i=0;i<n/2;i++) {
				arr1.add(arr[n-i-1]);
				arr1.add(arr[i]);
				count+=arr[n-i-1];
				count+=arr[i];
				if(count>m) {
					p=i;
					q=n-i;
					arr1.remove(arr1.size()-1);
					break;
				}
			}
			
			if(n%2!=0)q--;
			System.out.println(q-p);
			for(int i=p;i<q;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println(n-(q-p));
			for(int i=0;i<n-(q-p);i++) {
			System.out.print(arr1.get(i)+" ");
		}
			
			
			
			
			
			
			
//			for(int i=0;i<=n/2;i++) {
//				arr1.add(arr[n-i-1]);
//				arr1.add(arr[i]);
//				count+=arr[n-i-1];
//				count+=arr[i];
//				if(count>((n*(n+1))/2)/2){
//					
//					if(n%2==0) {
//					arr1.remove(arr1.size()-1);
//					arr1.remove(arr1.size()-1);
//					x=i;
//					break;
//					}
//					else {
//						arr1.remove(arr1.size()-1);
//						x=i;
//						break;
//					}
//				}
//			}
//			System.out.println("YES");
//			System.out.println(arr1.size());
//			for(int i=0;i<arr1.size();i++) {
//				System.out.print(arr1.get(i)+" ");
//			}
//			System.out.println();
//			System.out.println(n-2*x-1);
//			for(int i=x;i<n-x-1;i++) {
//				System.out.print(arr[i]+" ");
			}
		}

	}


