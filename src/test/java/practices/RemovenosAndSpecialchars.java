package practices;

public class RemovenosAndSpecialchars {

	public static void main(String[] args) {
	
		String s="l@kshm!123";
		String s2="";
		
		System.out.println(s);
		
		System.out.println(s.replaceAll("[^a-zA-Z]",""));
		
		for(int i=0;i<s.length();i++)
		{
			for(char ch='a';ch<='z';ch++)
			{
				if(s.charAt(i)==ch)
					s2=s2+s.charAt(i);		
			}
		}
		System.out.println(s2);

	}

}
