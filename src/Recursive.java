
public class Recursive {

	public static void main(String[] args) {
		System.out.println(func(5));
	}

	private static int func(int n) {
		{ 
			if (n == 0 || n == 1)
				return 1;
			else
				return 2*func(n-2) + 3*func(n-1);
		}

	}

}
