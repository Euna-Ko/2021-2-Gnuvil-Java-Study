//Practice Method
public class Work2 {
	//중요내용: void 이름(변수){내용} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int plusResult = plus(1, 2);
		int plusResult2 = plus(100, 4323);
		
		
		System.out.println(plusResult);
		System.out.println(plusResult2);
		
		
		printTwice("OO-AH");
		
	}
	
	//void: return 값이 없는 것
	static void printTwice(String text) {
		System.out.println(text);
		System.out.println(text);
	}
	
	
	static int plus(int x, int y) {
		return x+y;
	}

}
