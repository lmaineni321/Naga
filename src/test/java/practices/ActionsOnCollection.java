package practices;

import java.util.ArrayList;
import java.util.Collections;

public class ActionsOnCollection {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("sa");
		al.add("re");
		al.add("ga");
		al.add("ma");
		al.add("pa");
		al.add("da");
		
       Collections.shuffle(al);
       System.out.println(al);
       Collections.swap(al, 2, 3);
       System.out.println(al);
       Collections.sort(al);
       
       System.out.println(al);
	}

}
