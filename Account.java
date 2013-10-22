public class Account {

	private String name;
	private int pin;
	private double balance;

	public boolean login(String userName, int userPin) {
		if (userName.equals(name) && userPin == pin) {
			return true;
		}
		return false;
	}

	public double checkBalance() {
		return balance;
	}

	public void withdraw(double withdrawAmount) {
		this.balance = balance - withdrawAmount;
	}

	public void changePin(int newPin) {
		this.pin = newPin;
	}

	public boolean logOut() {
		return false;
	}

	public Account(String name, int pin, double balance) {
		setName(name);
		setPin(pin);
		setBalance(balance);
	}

	public String name() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int pin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double balance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}