package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 8, firstNum = 0, secondNum = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; i++) 
	    
	    {
	      System.out.print(firstNum + ", ");

	      // compute the sum
	      int sum= firstNum + secondNum;
	      firstNum = secondNum;
	      secondNum = sum;
	}

}
}
