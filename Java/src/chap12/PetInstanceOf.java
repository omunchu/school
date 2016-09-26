package chap12;

public class PetInstanceOf {

	public static void main(String[] args) {
		Pet[] pets = {
				new Pet("Kurt" , "アイ"),
				new RobotPet("R2D2" , "ルーク"),
				new Pet("マイケル" , "英男")
		};

		for(int i = 0 ; i < pets.length ; i++){
			System.out.println("pets[" + i + "] ");
			if(pets[i] instanceof RobotPet){
				((RobotPet)pets[i]).work(0);
			}
			else{
				pets[i].introduce();
			}
		}
	}
}
