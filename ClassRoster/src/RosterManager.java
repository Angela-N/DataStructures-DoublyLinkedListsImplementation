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
		
		// string for file input
		String fileName = "Assignment1Data.txt";
		String line = null;
		askForInput();
		// string for user input
		String userInput;
		Scanner stdin = new Scanner(System.in);
		
		// method that prompts user for input
		// askForInput();
		// Try to read a line
		// This function potentially throws an IOException
		userInput = stdin.nextLine();
		//System.out.println(".....................");
		int i = 0;
		//while (true) {
			
			try {
				// FileReader reads text files in the default encoding.
				FileReader fileReader = new FileReader(fileName);

				// Always wrap FileReader in BufferedReader.
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				while ((line = bufferedReader.readLine()) != null) {
					System.out.println("Addition of name : " + i + " " + line);

					if (userInput.equals("add")) {
						// update the student list
						roster.updateStudent(line, "add");
					} else if (userInput.equals("remove")) {
						// update the student list
						System.out.println("type name of student you want to remove");
						roster.removeStudent(userInput);
					}
					i++;
				}
				// System.out.println("size = " + dll.size());

				// Always close files.
				bufferedReader.close();
			} catch (FileNotFoundException ex) {
				System.out.println("Unable to open file '" + fileName + "'");
			} catch (IOException ex) {
				System.out.println("Error reading file '" + fileName + "'");
			}
		}
	//}

	public static void askForInput() {
		System.out.println("size = " + dll.size());

		System.out.println("Welcome to class Roster :");
		System.out.println("If you want to add a name to the list type 'a',");
		System.out.println("If you want to delete a name from the list type 'd',");
	}
}
