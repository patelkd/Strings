public class Warmup {
	public static void main(String[] args) {
	  
	  int n = sum(5);
	  System.out.println("The sum from 1 to 5 is " + n);
	  if (n == (1+2+3+4+5)) {
	  	System.out.println("I got it right!");
	  }
      

	}

	public static int sum(int n) {
		int sum = 0;
		for (int i =1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static int exponent(int n) {
		int exponent = 0;
		
	}
	
}