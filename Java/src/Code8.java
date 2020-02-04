import java.util.Scanner;

public class Code8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int []data = new int[5];
		
		for(int i=0; i<n ; i++) {
			data[i] = kb.nextInt();
		}
		
		int sum = 0 , max = data[0];
		
		for(int i=0; i<n; i++) {
			sum+= data[i];
			if(data[i] > max) max = data[i];
		}
		
	}

}
