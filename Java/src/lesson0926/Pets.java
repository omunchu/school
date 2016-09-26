package lesson0926;

class Pet{
	public void say(){
		System.out.println("say , say , say");
	}
}

class Dog extends Pet{
	public void say(){
		System.out.println("ワン");
	}
}

class Cat extends Pet{
	public void say(){
		System.out.println("ニャー");
	}
}

class Bird extends Pet{
	public void say(){
		System.out.println("ケーンケン");
	}
}


public class Pets {
	public static void main(String[] args) {

		Pet[] pets = {
				new Dog(),
				new Cat(),
				new Bird()
		};

		for(Pet p : pets){
			p.say();
		}
	}

}
