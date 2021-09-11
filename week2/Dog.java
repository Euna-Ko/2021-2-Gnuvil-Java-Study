package week2;
//Practice interface1 - B

public class Dog extends Animal implements Pet{
	
	public Dog(String name) {super(name);}
	
	@Override
	public void cry() {
		System.out.println(name + "!" + name + "!");
		
	}
	
	@Override
	public void FoodCall() {
		System.out.println(name + "~~!!");
	}

}
