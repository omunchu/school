package chap4;

import java.util.Scanner;

class L4_24{

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("素数か判断します");
		System.out.print("入力：");
		int val = stdIn.nextInt();
		int temp;
		for(temp = 2 ; ; temp++){
			if( val == 2){
				System.out.println("それは素数です。");
				break;
			}else if(val == 1 || val % temp == 0){
				System.out.println("それは素数ではないです。");
				break;
			}else if(temp == val - 1){
				System.out.println("それは素数です。");
				break;
			}

		}stdIn.close();
	}
}