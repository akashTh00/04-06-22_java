// Java Program to Illustrate Checked Exceptions
// Where FileNotFoundException occured

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Reading file from path in local directory
		FileReader file = new FileReader("C:\\test\\a.txt");

		// Creating object as one of ways of taking input
		BufferedReader fileInput = new BufferedReader(file);

		// Printing first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++)
			System.out.println(fileInput.readLine());

		// Closing file connections
		// using close() method
		fileInput.close();
	}
}
// ---------------------------------------------------
// ----------------------------------------------
// Java Program to Illustrate Checked Exceptions
// Where FileNotFoundException does not occur

// Importing I/O classes
import java.io.*;

// Main class
class IllustrateCheckedException2 {

	// Main driver method
	public static void main(String[] args)
		throws IOException
	{

		// Creating a file and reading from local repository
		FileReader file = new FileReader("D:\\nodepad.files\\akash.txt");

		// Reading content inside a file
		BufferedReader fileInput = new BufferedReader(file);

		// Printing first 3 lines of file "akash.txt"
		for (int counter = 0; counter < 4; counter++)
			System.out.println(fileInput.readLine());

		// Closing all file connections
		// using close() method
		// Good practice to avoid any memory leakage
		fileInput.close();
	}
}
