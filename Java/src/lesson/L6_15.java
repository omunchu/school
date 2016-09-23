package lesson;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class L6_15 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		List<String> week = Arrays.asList("sunday" , "monday" , "tuesday" , "wednesday" , "thursday" , "friday" , "saturday");
		List<String> youbi = Arrays.asList("日曜日" , "月曜日" , "火曜日" , "水曜日" , "木曜日" , "金曜日" , "土曜日");



		System.out.println("英語の曜日名を小文字で入力してください。");
		int weekDay = rand.nextInt(7);



		while(true){
			System.out.println(youbi.get(weekDay) + "：");
			String answer = stdIn.next();
			int before = weekDay;

			if(answer.equals(week.get(weekDay))){
				System.out.print("正解です。もう一度？ 1...Yes / 0...No");
				int x = stdIn.nextInt();
				if(x == 1){
					weekDay = rand.nextInt(7);
					while(before == weekDay){
						weekDay = rand.nextInt(7);
					}
				}else{
				break;
				}
			}else{
				System.out.println("違います。");
			}
		}

		System.out.println("このプログラムを終了しました。");

		stdIn.close();
	}

}
