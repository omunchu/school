package chap12;

public class Soft {
	public int getAge(){
		return 0;
	}

	protected int getCount(){
		return 0;
	}

	int getSize(){
		return 0;
	}

	private int getLength(){
		return 0;
	}

}


class SuperSoft extends Soft{

	@Override
	public int getAge(){
		return 0;
	}

	@Override
	protected int getCount(){
		return 0;
	}

	@Override
	int getSize(){
		return 0;
	}


//	private int getLength(){
//		return 0;
//	}


}
