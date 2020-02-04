import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int result = power(a,b);
		
		System.out.println(result);
				
		
		kb.close();
	}
	
	public static int power(int a , int b) {
		int prod = 1;
		
		for(int i=0 ; i<b ; i++)
			prod *= a;
		
		return prod;
	}

}
