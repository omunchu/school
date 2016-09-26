package chap12;

public class Account {
	/** 口座名義 */
	private String name;
	/** 口座番号 */
	private String no;
	/** 預金残高 */
	private long balance;

	Account(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	String getName() {
		return name;
	}

	String getNo() {
		return no;
	}

	long getBalance() {
		return balance;
	}

	void setBalance(long balance) {
		this.balance = balance;
	}

	/** k円預ける */
	void deposit(long k){
		balance += k;
	}

	/** k円おろす */
	void withDraw(long k){
		balance -= k;
	}

}
