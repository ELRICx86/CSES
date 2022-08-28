package Intro;
import java.util.*;

public class AppleDivision {
	
	static Set<Long> set=new HashSet<>();
	
	public static void div(long[] arr,int idx,long sum1, long sum2) {
		if(idx==arr.length) {
			set.add(sum1);
			return;
		}
		
		
		div(arr,idx+1,sum1+arr[idx],sum2);
		div(arr,idx+1,sum1,sum2);
		//sum2+=arr[idx];
		//if(Math.abs(sum1-sum2)<=min)min=Math.abs(sum1-sum2);
		//div(arr,idx+1,sum1,sum2);
		//System.out.println(sum1+" "+sum2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n;
		n=sc1.nextInt();
		long[] arr=new long[n];
		long sum=0;
		for(int i=0;i<n;i++) {
			long x=sc1.nextLong();
			arr[i]=x;
			sum+=arr[i];
		}
		long sum1=0;
		long sum2=0;
		//Arrays.sort(arr);
		
		div(arr,0,sum1,sum2);
		long minx=99999999999999999l;
		for(long x:set) {
			
			if((Math.abs((sum-x)-x))<minx){
				minx=(Math.abs((sum-x)-x));
			}
			
				
		}
		System.out.println(minx);

	}

}
