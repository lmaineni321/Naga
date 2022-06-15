package practices;

import java.io.File;

public class FilleComparision {

	public static void main(String[] args) {
		
		File f1=new File("G:\\Selenium_Automation\\Naga\\myfile.txt");
		File f2=new File("G:\\Selenium_Automation\\Naga\\myfile.txt");
		int compare=f1.compareTo(f2);
		System.out.println(compare);

	}

}
