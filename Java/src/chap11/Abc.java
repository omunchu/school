package chap11;

public class Abc {
	public static int count = 0;

	void print(){
		System.out.println(Def.name);
	}

}

class Def{
	public static String name = "お名前";

	void print(){
		System.out.println(Abc.count);

	}
}
