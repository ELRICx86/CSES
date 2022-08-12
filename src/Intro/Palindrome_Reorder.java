package Intro;

import java.util.Scanner;

public class Palindrome_Reorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		// StringBuilder s1 = new StringBuilder();
		// StringBuilder s2 = new StringBuilder();

		String t1 = "";
		String t2 = "";
		String t3 = "";
		String string = sc1.next();
		int freq[] = new int[26];
		for (int i = 0; i < string.length(); i++) {
			int x = string.charAt(i) - 'A';
			freq[x]++;

		}

		char[] ch = new char[string.length()];

		if (string.length() % 2 == 0) {

			boolean odd = false;
			for (int i = 0; i < freq.length; i++) {
				if (freq[i] > 0) {
					if (freq[i] % 2 != 0) {
						odd = true;
						break;
					}
				}

			}
			if (odd == true)
				System.out.println("NO SOLUTION");
			else {
				// print the valid solution

				int m = 0;
				for (int i = 0; i < freq.length; i++) {
					if (freq[i] > 0) {
						int id = i;
						int nn = freq[i];
						int j = 0;

						String chh = Character.toString((id + 'A'));
						t1 = t1 + chh.repeat(nn / 2);
						t2 = chh.repeat(nn / 2) + t2;

//						while (j < nn / 2) {
//							 
//							
//							s1.append( (char) (id + 'A'));
//
//							ch[m] = (char) (id + 'A');
//							ch[ch.length - 1 - m] = (char) (id + 'A');
//							j++;
//							m++;
//
//						}
					}
				}
				// s2=s1.reverse();

			}

		}

		else {
			int odd_c = 0;
			int odd_id = 0;
			for (int i = 0; i < freq.length; i++) {
				if (freq[i] > 0) {
					if (freq[i] % 2 != 0) {
						odd_c++;
						odd_id = i;
					}
				}
			}
			if (odd_c > 1)
				System.out.println("NO SOLUTION");
			else {

				int m = 0;
				for (int i = 0; i < freq.length; i++) {
					if (freq[i] > 0) {
						int id = i;
						int nn = freq[i];
						int j = 0;
						String chh = Character.toString((id + 'A'));
						t1 = t1 + chh.repeat(nn / 2);
						t2 = chh.repeat(nn / 2) + t2;

//						while (j < nn / 2) {
//							s1.append( (char) (id + 'A'));
//
//							ch[m] = (char) (id + 'A');
//							ch[ch.length - 1 - m] = (char) (id + 'A');
//							j++;
//							m++;
//
//						}

					}
				}

				// s2=s2.append((char) (odd_id + 'A'));
				// s2=s2.append(s1.reverse());

				t3 = Character.toString((char) (odd_id + 'A'));

				// ch[ch.length / 2] = (char) (odd_id + 'A');

			}

		}

//		for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i]);
//		}

		System.out.println(t1 + t3 + t2);

	}

}
