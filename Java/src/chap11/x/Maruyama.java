package chap11.x;

public class Maruyama {
	public void maru1(){

	}

	protected void maru2(){

	}

	void maru3(){

	}

	private void maru4(){

	}

	void func(Maruyama m){
		m.maru1();	//他packegeからでもアクセス可
		m.maru2();	//同一package内でのみアクセス可(例外アリ、詳細は12章)
		m.maru3();	//同一package内でのみアクセス可
		m.maru4();	//同一class内のみアクセス可
	}
}
