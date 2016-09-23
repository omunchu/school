package Lesson0831;

import java.util.Scanner;
public class Lesson004 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		int time;
		int h = 0;
		int m = 0;
		int s = 0;

		System.out.print("秒を入力＞");
		time = stdIn.nextInt();

		if(time >= 3600){
			h = time / 3600;
			time = time - 3600 * h;
			if(time >= 60){
				m = time / 60;
				time = time - 60 * m;
				s = time;

			}else{
				s = time;

			}

		}else if(time >= 60){
			m = time / 60;
			time = time - 60 * m;
			s = time;
		}else{
			s = time;
		}

		System.out.printf("%d時間%02d分%02d秒です。", h, m, s);

		stdIn.close();

	}

}
