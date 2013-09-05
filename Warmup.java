public class Warmup {
	public static void main(String[] args) {
	  
	  // int n = sum(5);
	  // System.out.println("The sum from 1 to 5 is " + n);
	  // if (n == (1+2+3+4+5)) {
	  // 	System.out.println("I got it right!");
	  // }
      
      // exponent(2,3);
		factorial (4);

	}

	public static int sum(int n) {
		int sum = 0;
		for (int i =1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static int exponent(int x, int n) {
		int y =1;
		for (int i = n; i > 0; i-- ) {
			y=y*x;
		}
		System.out.println(y);
		return y;
	}

	public static int factorial(int n) {
		int factorial=1;
		for (int i =1; i <=n; i++) {
			factorial = factorial *i;
		}
		System.out.println(factorial);
		return factorial;
	}
	
}