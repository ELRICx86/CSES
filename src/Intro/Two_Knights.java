package Intro;

import java.util.Scanner;

public class Two_Knights {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		long x,y,z,i;
		for(i=1;i<=n;i++)
		{
			
			z=i;
			x=(z*z*(z*z-1))/2;
			y=4*(z-1)*(z-2);
			System.out.println(x-y);
			
			
		}

	}

}
