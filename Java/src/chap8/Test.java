package chap8;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("干支と星座を調べます。");

		System.out.print("何年：");
		int year = stdIn.nextInt();
		System.out.print("何月：");
		int month = stdIn.nextInt();
		System.out.print("何日：");
		int day = stdIn.nextInt();

		Lesson test = new Lesson(year , month ,day);

		System.out.println(year + "年は" + test.getZodiac() + "年です。");
		System.out.println(month + "月" + day + "日は" + test.getConstellation() + "座です。");

		stdIn.close();
	}

}
