package Bank;

public class AxisBank extends BankInfo {

	public void deposit(int sum) {
		System.out.println("The total deposit amount available is " +sum);
	}
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit(10);
		bank.fixed(100);
		bank.saving(1000);
	}

}
