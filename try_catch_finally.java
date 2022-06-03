// Java program to demonstrate working of try,
// catch and finally

class Division {
	public static void main(String[] args)
	{
		int a = 10, b = 5, c = 5, result;
		try {
			result = a / (b - c);
			System.out.println("result" + result);
		}

		catch (ArithmeticException e) {
			System.out.println("Exception caught:Division by zero");
		}

		finally {
			System.out.println("I am in final block");
		}
	}
}

// --------------------------------------
//Example of throws keyword

// Java program to demonstrate working of throws
class ThrowsExecp {

	// This method throws an exception
	// to be handled
	// by caller or caller
	// of caller and so on.
	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}

	// This is a caller function
	public static void main(String args[])
	{
		try {
			fun();
		}
		catch (IllegalAccessException e) {
			System.out.println("caught in main.");
		}
	}
}

