package section2;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		for(int n =2; n<10000; n++) {
			if(isPrime(n))
				System.out.println(n);
		}
	}

	public static boolean isPrime(int k) {	
		for(int i = 2 ; i< k /2 ; i++) {
			if(k%i == 0) return false;
		}
		return true;
	}
}
