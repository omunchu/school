package chap8;

public class Janken {
	static final int AIKO = 0;
	static final int KACHI_1 = 1;
	static final int KACHI_2 = 2;

	static final int GOO = 0;
	static final int CHOKI = 1;
	static final int PAA = 2;

	static private String[] te = {"ぐー","ちょき","ぱー"};
	static int[][] judge = {
			{AIKO,KACHI_1,KACHI_2},
			{KACHI_2,AIKO,KACHI_1},
			{KACHI_1,KACHI_2,AIKO},
	};

	public static void main(String[] args) {
//		System.out.println(judge[GOO][GOO]);
//		System.out.println(judge[GOO][CHOKI]);
//		System.out.println(judge[GOO][PAA]);
		boolean flag = true;
		while (flag) {
			int ret1 = MaruyamaFighter.getTe();
			int ret2 = MaruyamaFighter.getTe();
			System.out.println("丸山1さんが" + te[ret1]);
			System.out.println("丸山2さんが" + te[ret2]);
			switch (judge[ret1][ret2]) {
				case AIKO:
					System.out.println("あいこ");
					break;
				case KACHI_1:
					flag = false;
					System.out.println("丸山1の勝ち");
					break;
				case KACHI_2:
					flag = false;
					System.out.println("丸山2の勝ち");
					break;
			}
		}
	}
}