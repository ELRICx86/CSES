package Intro;

import java.util.Scanner;

public class Grey_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		for(int i=0;i<Math.pow(2, n);i++) {
		
			int temp=i>>1;
		String string="0000000000000000"+Integer.toBinaryString(i^temp);
		System.out.println(string.substring(string.length()-n));
		
		
		
		}

	}

}
