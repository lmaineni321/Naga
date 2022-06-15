package practices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class MapToArrayList {

	public static void main(String[] args) {
		
		HashMap hp=new HashMap();
		
		hp.put(123, "lakshmi");
		hp.put(456, "sathi");
		hp.put(789, "lucky");
		hp.put(321, "lakki");
		
		System.out.println(hp);
		
		System.out.println(hp.entrySet());
		
	     System.out.println(hp.get(123));
	     
	     System.out.println(hp.keySet());
	     
	     Collection val = hp.values();
	     
	     System.out.println(hp.values());
	     
	     ArrayList al=new ArrayList(val);
	      
//	     Collections.addAll(al, val);
	     
	     System.out.println(al);


	}

}
