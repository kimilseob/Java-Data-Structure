package Section1;

public class Code1 {

		public static void main(String[] args) {
			
			Person1 first;
			first = new Person1();
			
			first.name = "john";
			first.number = "0101213123123";
			
			Person1 [] members = new Person1[10];
			
			members[0] = first;
			members[1] = new Person1();
			members[1].name = "David";
			members[1].number = "010142131";
			
			
		}
}
