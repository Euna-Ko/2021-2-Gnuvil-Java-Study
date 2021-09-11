package week2;
//Practice interface1 - C

public class Cat extends Animal implements Pet{
	
	public Cat(String name) {super(name);}
	
	@Override
	public void cry() {
		System.out.println(name + "~~~!!!");
	}
	
	@Override
	public void FoodCall() {
		System.out.println("...");
	}

}
