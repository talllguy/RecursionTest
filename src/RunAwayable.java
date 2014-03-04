import java.util.Scanner;


public class RunAwayable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // set up scanner to take various inputs throughout
		int a = getA(sc); // get the a by method
		int b = getB(sc); // get the b by method
		try {
			test(a,b);
			sc.close();
		}
		catch(StackOverflowError e) {
			System.err.println("Oops! You've created an overflow!");
		}
	}

	private static int getA(Scanner sc) {
		// gets n from user
		System.out.println("Enter an integer: ");
		int a = sc.nextInt();
		return a;
		
	}
	
	private static int getB(Scanner sc) {
		// gets x from user
		System.out.println("Enter another integer: ");
		int b = sc.nextInt();
		return b;
	}

	private static void test(int p1, int p2) {
		if (p1 != p2) {
			p1 = p1 + 2;
			p2 = p2 - 1;
			
			test(p1,p2);
			
			System.out.println(p1);
			System.out.println(p2);
		}
	}
}
