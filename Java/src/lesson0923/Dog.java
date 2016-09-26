package lesson0923;

public class Dog extends Animal {
	private String name;


	Dog(int age , String name){
		super(age);
		this.name = name;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	void say(){
		System.out.println(getAge() + "歳の" + name + "が鳴きました。");
	}

}
