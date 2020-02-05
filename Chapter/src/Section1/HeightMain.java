package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HeightMain {

	
	static MyRectangle1[] rects = new MyRectangle1[100];
	static int n;
	
	public static void main(String[] args) {
		
		
		try {
			Scanner in = new Scanner(new File("data.txt"));
			
			while(in.hasNext()) {
				
				rects[n] = new MyRectangle1();
				rects[n].lu = new MyPoint1(); 
				rects[n].lu.x = in.nextInt();
				rects[n].lu.y = in.nextInt();
				rects[n].width = in.nextInt();
				rects[n].height = in.nextInt();
			}
			in.close();
			
			bubbleSort();
			
		} catch (FileNotFoundException e) {
			System.out.println("No File");
		}
		
	}

	private static void bubbleSort() {
		// TODO Auto-generated method stub
		
		for(int i=n-1; i>0 ; i--) {
			for(int j = 0;i<i;j++) {
				
			}
		}
	}
}
