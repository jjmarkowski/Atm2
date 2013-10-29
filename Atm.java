import java.util.Scanner;

public class Atm {

	//bob , 1234, 100
	//alice, 3333, 250
	//jt, 0001, 999999999

	// private String name;
	// private int pin;
	// private double balance;

	//Scanner reader = new Scanner(System.in);
	//String userInput = reader.nextString();

	public static void main(String[] args) {
		Account bob = new Account("Bob", 1234, 100.0);
		Account alice = new Account("Alice", 3333, 250.0);
		Account jt = new Account("jt", 0001, 999999999);
		int userInput;
		boolean x;
		String userName = "";

		Scanner reader = new Scanner(System.in);
		
		while(!userName.equals("Quite")) {

			System.out.print("--Login--\nName: ");
			userName = reader.next();
			System.out.print("Pin: ");
			int userPin = reader.nextInt();
			x = true;

			if (bob.login(userName, userPin)) {
				while (x) {
					System.out.print("Check Balance(1), Withdraw(2), Change Pin(3), Log Out(4): ");
					userInput = reader.nextInt();
					//userInput = reader.nextLine();

					if (userInput == 1) {
						System.out.println("Current Balance: $" + bob.checkBalance());
						System.out.println();

					} else if (userInput == 2) {
						System.out.print("Amount to withdraw: $");
						double withdrawAmount = reader.nextDouble();
						bob.withdraw(withdrawAmount);
						System.out.println("Withdrew: $" + withdrawAmount);
						System.out.println("New Balance: $" + bob.checkBalance());
						System.out.println();

					} else if (userInput == 3) {
						System.out.print("Enter new Pin: ");
						int newPin = reader.nextInt();
						bob.changePin(newPin);
						System.out.println("The Pin has been changed");
						System.out.println();

					} else if (userInput == 4) {
						x = bob.logOut();
					}
				}
			}

			if (alice.login(userName, userPin)) {
				while (x) {
					System.out.print("Check Balance(1), Withdraw(2), Change Pin(3), Log Out(4): ");
					userInput = reader.nextInt();

					if (userInput == 1) {
						System.out.println("Current Balance: $" + alice.checkBalance());
						System.out.println();

					} else if (userInput == 2) {
						System.out.print("Amount to withdraw: $");
						double withdrawAmount = reader.nextDouble();
						alice.withdraw(withdrawAmount);
						System.out.println("Withdrew: $" + withdrawAmount);
						System.out.println("New Balance: $" + alice.checkBalance());
						System.out.println();

					} else if (userInput == 3) {
						System.out.print("Enter new Pin: ");
						int newPin = reader.nextInt();
						alice.changePin(newPin);
						System.out.println("The Pin has been changed");
						System.out.println();
					} else if (userInput == 4) {
						x = bob.logOut();
					}
				}
			}

			if (jt.login(userName, userPin)) {
				while (x) {
					System.out.print("Check Balance(1), Withdraw(2), Change Pin(3), Log Out(4): ");
					userInput = reader.nextInt();

					if (userInput == 1) {
						System.out.println("Current Balance: $" + jt.checkBalance());
						System.out.println();

					} else if (userInput == 2) {
						System.out.print("Amount to withdraw: $");
						double withdrawAmount = reader.nextDouble();
						jt.withdraw(withdrawAmount);
						System.out.println("Withdrew: $" + withdrawAmount);
						System.out.println("New Balance: $" + jt.checkBalance());
						System.out.println();

					} else if (userInput == 3) {
						System.out.print("Enter new Pin: ");
						int newPin = reader.nextInt();
						jt.changePin(newPin);
						System.out.println("The Pin has been changed");
						System.out.println();
					} else if (userInput == 4) {
						x = bob.logOut();
					}
				}
			}
		}
	}
}