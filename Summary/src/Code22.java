import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code22 {

	static String[] words = new String[1000];
	static int [] count = new int[1000];
	static int n;
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("read")) {
				String fileName = kb.next();
				makeIndex(fileName);
			}
			else if(command.equals("find")) {
				
			}
			else if(command.equals("saveas")) {
				
			}
			else if(command.equals("exit")) {
				
				break;
			}
		}
		
		kb.close();
	}
	
	static void makeIndex(String fileName){
		
		try {
			Scanner inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) {
				String str = inFile.next();
				
				addWord(str);
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No File");
			return;
		}
		
	}
	static void addWord(String str) {
		int index = findWord( str );   // returns -1 if not found
		
		if(index != -1) {
			count[index]++;
		}
		else{
			
		}
	}
	static int findWord(String str) {
		
		for(int i=0 ; i<n; i++) {
			if(words[i].equals(str)){
				return i;
			}
				
		}
		return -1;
	}
}
