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
		
		String userInput;
		Scanner stdin1 = new Scanner(System.in);
		

		// This function potentially throws an IOException
		
		System.out.println("enter a maximum number of students that should be in put");
		
		
		System.out.println(".....................");
		
		askForInput();
		
		String userInputSize;
		userInputSize = stdin1.nextLine();
		
		// string for user input
				//String userInput;
				Scanner stdin = new Scanner(System.in);
				userInput = stdin.nextLine();
		///roster.getClassSize(Integer.parseInt(userInputSize));
		
		
		
		
		int i = 0;
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
			askForInput();
		}

	public static void askForInput() {
		System.out.println("size = " + dll.size());

		System.out.println("Welcome to class Roster :");
		System.out.println("If you want to add a name to the list type 'add',");
		System.out.println("If you want to delete a name from the list type 'remove',");
	}
}
