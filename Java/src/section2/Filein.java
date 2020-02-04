package section2;

import java.util.Scanner;
import java.io.*;

public class Filein {

	public static void main(String[] args) {
		
		String fileName = "input.txt";
		String [] name = new String[1000];
		String [] number = new String[1000];
		int n = 0;
		
		
		try {
			Scanner	inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) { //detect End of File
				name[n] = inFile.next();
				number[n] =inFile.next();
				n++;
			}
			 
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(1);
		}
		
		
		for(int i = 0 ;i <n ;i++) {
			System.out.println(name[i] + ":"+ number[i]);
		}
	}
}
