public class Account{
    protected double balance;
    protected String name;
    protected double amount;
    protected double withdrawFail = 0.0;

    // Constructor to initialize balance
    public Account( String name, double amount ){
        balance = amount;
        this.name = name;
	}

    // Overloaded constructor for empty balance
    public Account(String name){
        balance = 0.0;
        this.name = name;
	}

    public void deposit( double amount ){
        balance = balance + amount;
        this.amount = amount;
	}

    public double withdraw( double amount ){
        // See if amount can be withdrawn
		if (balance >= amount){
			balance -= amount;
            return amount;
		}
		else{
			// Withdrawal not allowed
            return withdrawFail;
		}
	}

    public double getbalance(){
		return balance;
    }
    
    public static void main(String[] args) {
        // account dengan saldo kosong
        Account account1 = new Account("Permadi");        

        System.out.println("Detail Account --");
        System.out.println("Nama Akun\t: "+account1.name);
        System.out.println("Saldo Akun\t: Rp. "+account1.getbalance());

        // deposit 500.000
        System.out.println("\nDeposit --");
        account1.deposit(500000);
        System.out.println("Deposit Saldo\t: Rp. "+account1.amount);
        System.out.println("Saldo Akun\t: Rp. "+account1.getbalance());

        // withdraw 50.000
        System.out.println("\nWithdraw --");
        System.out.println("Saldo Akun\t: Rp. "+account1.getbalance());
        account1.withdraw(50000);        
        System.out.println("Withdraw Saldo\t: Rp. "+account1.amount);
        System.out.println("Saldo Akhir\t: Rp. "+account1.getbalance());

        // withdraw 500.000
        System.out.println("\nWithdraw ke-2 --");
        System.out.println("Saldo Akun\t: Rp. "+account1.getbalance());
        account1.withdraw(500000);        
        System.out.println("Withdraw Saldo\t: Rp. "+account1.amount);
        System.out.println("Withdraw Berhasil\t: Rp. "+account1.withdrawFail + " Gagal Withdraw!");
        System.out.println("Saldo Akhir\t: Rp. "+account1.getbalance());
    }
}