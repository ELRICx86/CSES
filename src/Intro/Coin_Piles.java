package Intro;

import java.util.Scanner;

public class Coin_Piles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int t=sc1.nextInt();
		while(t-->0) {
			long a=sc1.nextLong();
			long b=sc1.nextLong();
			if((a+b)%3!=0)System.out.println("NO");
			else {
				long mx=Math.max(a, b);
				long min=Math.min(a, b);
				if(min*2==mx)System.out.println("YES");
				else if(min-(mx-min)>0 && (min-(mx-min))%3==0 )System.out.println("YES");
				else System.out.println("No");
			}
			
		}

	}

}
