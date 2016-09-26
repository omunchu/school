package chap16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithInt {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);


		while (true){
			try{
				System.out.print("変数x:");
				int x = stdIn.nextInt();

				System.out.print("変数y:");
				int y = stdIn.nextInt();

				int answer = x / y;
				System.out.println("計算結果;" + answer + "=" + x + "/" + y );
			}catch(InputMismatchException e){
				System.out.println("入力エラー発生。" + e);
				String s = stdIn.next();
				System.out.println(s + "は無視しました。");
			}catch(ArithmeticException e){
				System.out.println("算術エラー発生。" + e);
				System.out.println("エラーが出ないような数値をお願いします。");
			}finally{
				System.out.println("------------------------");
				System.out.print("もう一度？ (1...Yes / 0...No):");
				int retry = stdIn.nextInt();
				if(retry == 0){
					stdIn.close();
					break;
				}
				System.out.println("------------------------");
			}

		}

	}

}
