package week2;
//Practice interface1 - D

public class Wolf extends Animal{
	
	public Wolf(String name) {super(name);}
	
	@Override
	public void cry() {
		System.out.println(name + "~~~~");
	}

}
