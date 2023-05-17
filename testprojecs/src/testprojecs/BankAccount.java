package testprojecs;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.deposit(500);
       
        myAccount.updateCustomerInfo("john.smith@yahoo.com", "0987654321");

        System.out.println("Account number: " + myAccount.getAccountNumber());
        System.out.println("Balance: " + myAccount.getBalance());
        System.out.println("Customer name: " + myAccount.getCustomerName());
    }

	private String getCustomerName() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getBalance() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	private void updateCustomerInfo(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private void deposit(int i) {
		// TODO Auto-generated method stub
		
	}
}
