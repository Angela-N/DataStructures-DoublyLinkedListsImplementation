import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RosterManager {

	static DoublyLinkedList<String> dll = new DoublyLinkedList<String>();
	static RosterProgram roster = new RosterProgram();

	public static void main(String[] args) {
		// a new instance of the roster program

		// method that asks for size of the list
		askForSize();

		String fileName = "Assignment1Data.txt";
		// string for file input
		String line = null;
		String userInput;

		System.out.println(".....................");

		askForInput();

		Scanner stdin = new Scanner(System.in);
		userInput = stdin.nextLine();

		// userInput = stdin.next();

		int i = 1;
		if (userInput.equals("add")) {
			// update the student list
			

			try {
				// FileReader reads text files in the default encoding.
				FileReader fileReader = new FileReader(fileName);

				// Always wrap FileReader in BufferedReader.
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				while ((line = bufferedReader.readLine()) != null) {
					System.out.println("Addition of name : " + i + " " + line);
					roster.updateStudent(line, "add");
					i++;
				}
				bufferedReader.close();
			} catch (FileNotFoundException ex) {
				System.out.println("Unable to open file '" + fileName + "'");
			} catch (IOException ex) {
				System.out.println("Error reading file '" + fileName + "'");
			}
			// Always close files.

		}

		else if (userInput.equals("remove")) {
			// update the student list
			System.out.println("Type name of student you want to remove");
			roster.removeStudent(userInput);
		}
		// System.out.println("size = " + dll.size());

		askForInput();
	}

	public static void askForSize() {
		String userInputSize;
		Scanner stdin1 = new Scanner(System.in);

		// This function potentially throws an IOException
		System.out.println("Welcome to class Roster :");
		System.out.println("Enter a maximum number of students that should be in put");
		userInputSize = stdin1.nextLine();
		 roster.getClassSize(Integer.parseInt(userInputSize));

	}

	public static void askForInput() {
		System.out.println("size = " + dll.size());

		System.out.println("Welcome to class Roster :");
		System.out.println("If you want to add a name to the list type 'add',");
		System.out.println("If you want to delete a name from the list type 'remove',");
	}
}
