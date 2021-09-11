package week2;
//Practice interface1 - Main

public class Work8 {

	public static void main(String[] args) {
		
		Animal dog = new Dog("baduk");
		Animal cat = new Cat("meow");
		Animal wolf = new Wolf("waooo");
		
		dog.cry();
		cat.cry();
		wolf.cry();
		
		System.out.println("--------------");
		
		Pet pet1 = new Cat("meow");
		Pet pet2 = new Dog("baduk");
		
		pet1.FoodCall();
		pet2.FoodCall();
		
		
		System.out.println("--------------");
		
		//형변환: pet으로 cat을 불렀을 경우 cry는 할 수 없지만 형변환을 하면 가능
		((Cat)pet1).cry();

		
	}

}
