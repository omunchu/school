package chap8;

class Account2{
	//フィールド
	private String name;
	private String no;
	private long balance;

	//コンストラクタ
	Account2(String n , String num , long z){
		name = n;
		no = num;
		balance = z;
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

	void deposit(long k){
		balance += k;
	}

	void withdraw(long k){
		balance -= k;
	}
}

public class AccountTester2 {

	public static void main(String[] args) {
		Account2 adachi = new Account2("足立幸平" , "123456" , 1000);	//	インスタンス化している
		Account2 nakata = new Account2("仲田真二" , "654321" ,  200);

//		nakata.Account2("仲田真二" , "654321" , 200);

		adachi.withdraw(200);
		nakata.deposit(100);


		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getName());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　預金残高：" + adachi.getBalance());

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.getName());
		System.out.println("　口座番号：" + nakata.getNo());
		System.out.println("　預金残高：" + nakata.getBalance());



	}

}
