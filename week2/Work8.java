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
		
		//����ȯ: pet���� cat�� �ҷ��� ��� cry�� �� �� ������ ����ȯ�� �ϸ� ����
		((Cat)pet1).cry();

		
	}

}
