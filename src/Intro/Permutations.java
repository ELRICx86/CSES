package Intro;

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer ans = new StringBuffer();
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		
		if(n<=3 && n>1) System.out.println("NO SOLUTION");
		else {
			
			for(int i=1;i<n;i+=2) {
				ans.append(1+i+ " ");
				//System.out.print(1+i+ " ");
			}
			for(int i=0;i<n;i+=2) {
				ans.append(1+i+ " ");
				//System.out.print(1+i+ " ");
			}
			
			System.out.println(ans);

		}
		

	}

}
