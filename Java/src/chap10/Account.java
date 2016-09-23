package chap10;

public class Account {
	//クラス変数
	private static int counter = 0;
	//フィールド
	private String name;
	private String no;
	private long balance;


	private int id;

	//コンストラクタ
	Account(String n , String num , long z){
		name = n;
		no = num;
		balance = z;
		id = ++counter;
	}

	//インスタンスメソッド
	String getName(){
		return name;
	}

	String getNo(){
		return no;
	}

	long getBalance(){
		return balance;
	}

	public int getId() {
		return id;
	}

	void deposit(long k){
		balance += k;
	}

	void withdraw(long k){
		balance -= k;
	}

}


