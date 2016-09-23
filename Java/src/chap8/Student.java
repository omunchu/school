package chap8;

public class Student {
	private String name;
	private int age;
	private String msg;
	public Student(String name, int age, String msg) {
		super();
		this.name = name;
		this.age = age;
		this.msg = msg;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getMsg() {
		return msg;
	}



//	Student(String n , int a , String m){
//		name = n;
//		age = a;
//		msg = m;
//	}
//
//	String getName(){
//		return name;
//	}
//
//	int getAge(){
//		return age;
//	}
//
//	String getMsg(){
//		return msg;
//	}

}
