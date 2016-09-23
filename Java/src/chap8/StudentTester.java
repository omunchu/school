package chap8;

public class StudentTester {

	public static void main(String[] args) {
		Student maruyama = new Student("丸山貴志" , 30 , "よろしく");

		System.out.println(maruyama.getName());
		System.out.println(maruyama.getAge() + "歳です。");
		System.out.println(maruyama.getMsg());

	}

}
