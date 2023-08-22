package week1.day2;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=35;
		// true if number is less than 0
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

        // true if number is greater than 0
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

        // If it neither negative nor positive,
        else
            System.out.println(number + " The number is neither positive nor negative");
    }


	}


