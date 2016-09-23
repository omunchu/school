package chap6;

import java.util.Random;
import java.util.Scanner;
public class L6_14 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {"January", "February" , "March" , "April" , "May" , "June" ,
				"July" , "August" , "September" , "October" , "November" , "December"};

		System.out.println("英語の月名を入力してください。\nなお、先頭は大文字で、２文字目以降は小文字とします。");
		int month = rand.nextInt(12);


			while(true){
			System.out.print((month + 1) +"月：");
			String m = stdIn.next();
			int before = month;

			if( m.equals( monthString[month])){
				System.out.print("正解です。もう一度？ 1...Yes / 0...No");
				int x = stdIn.nextInt();
				if(x == 1){
					month = rand.nextInt(12);
					while(before == month){
							month = rand.nextInt(12);
					}
				}else{
					break;
				}
			}else{
				System.out.println("違います。");
			}
			}

			for(String m : monthString){
				System.out.println(m);

			}
		stdIn.close();

	}
}