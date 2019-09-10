import java.util.Scanner;
/**
 * @author Mehesh Kedoo
 *
 */
public class Inventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner
		Scanner key = new Scanner(System.in);
		
		//initializing variable
		
		int size, choice, wrong;
		String pwrd,itemId;
		final String PASSWORD = "DitProg123";

		 
		System.out.println("Welcome to the inventory");
		
		System.out.print("Enter maximum number of Items to be store: ");
		size = key.nextInt();//to allow user input
		
		//Create an empty array
		Item [] itemDatabase = new Item[size];
		
		do {
			System.out.println("What do you want to do?");
			System.out.println("Select 1 to add new Item to the inventory");
			System.out.println("Select 2 to change information of an existing Item");
			System.out.println("Select 3 to display all the Items with specified category");
			System.out.println("Select 4 to display all Item to be re-ordered");
			System.out.println("Select 5 to know number of Items currenlty in store");
			System.out.println("Select 6 to quit");
			System.out.print("What did you decide: ");
			choice = key.nextInt();
			
			if (choice == 1) {
				System.out.println("Add new item to the inventory");
				for(int attempt = 0; attempt < 3; attempt++) {
					System.out.print("Enter your password. Attempt "+(attempt+1)+": ");
					pwrd = key.next();
					if(!pwrd.equals(PASSWORD)) {
						wrong++;
						System.out.println("Try again");
						
					}
					else {
						break;
					}
				}

			}
			
			if (choice == 2) {
				System.out.println("Change information of an existing Item");
				for(int attempt = 0; attempt < 3; attempt++) {
					System.out.print("Enter your password. Attempt "+(attempt+1)+": ");
					pwrd = key.next();
					if(!pwrd.equals(PASSWORD)) {
						wrong++;
						System.out.println("Try again");
						
						System.out.println("Which item do you want to update.");
						
						System.out.println("Enter item ID");
						itemId = key.next();
						
						if(itemDatabase.equals(itemId)) {
							System.out.println(itemDatabase);
						}
						else {
							System.out.println("No item with the specified ID");
							System.out.println("Do you want to continue");
							System.out.println("To continue enter 1 and to quit enter 2");
							choice = key.nextInt();
							if(choice == 1) {
							
							}
								
						}
					}
				}
					else {
						break;
					}
			}
		while(!pwrd.equals(PASSWORD));
		
		}
	}
}


