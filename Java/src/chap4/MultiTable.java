package chap4;

// 多重ループ

class MultiTable{

	public static void main(String[] args){

		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9 ; j++){
				if(i * j  == 40){
					continue;
				}
				System.out.print(" " + i * j);
			}

			System.out.println();
		}





	}

}