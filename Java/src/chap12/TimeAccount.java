package chap12;

public class TimeAccount {
	private String name;
	private String no;
	private long balance;
	private long timeBalance;


	public TimeAccount(String name, String no, long balance, long timeBalance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.timeBalance = timeBalance;
	}


	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}

	public long getTimeBalance() {
		return timeBalance;
	}


	void deposit(long k){
		balance += k;
	}

	void withdraw(long k){
		balance -= k;
	}

	void cancel(){
		balance += timeBalance;
		timeBalance = 0;
	}


}
