package practices;

import java.util.Arrays;

public class StringProgram {

	public static void main(String[] args) {
		String s="lakshmi";
//		char ch[]=s.toCharArray();
//		
//		for(char ch1='a';ch1<='z';ch1++)
//		{
//			int c=0;
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]==ch1)
//				c++;
//		}
//		if(c>0)
//		System.out.println(ch1+" -"+c);
//		}
		
		int a[]= {14,4,54,97,12,11};
		int temp;
		
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]<max)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println(max);
//		Arrays.sort(a);
//		String arr=Arrays.toString(a);
//		System.out.println(arr.lastIndexOf());
//		System.out.println(Arrays.toString(a));
//	
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.println(a[i]);
//			
//		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(s.concat(".M"));
		
	}

}
