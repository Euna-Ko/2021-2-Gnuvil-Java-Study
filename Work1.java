//Practice Types
public class Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//integer 연산
		int number = 100;
		int number2 = 43532;
						
		int plus = number + number2;
		int minus = number2 - number;
		int multiply = number * number2;
		int divide = number2 / number;
		int modulo = number2 % number;
				
		System.out.println(number);
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(modulo);

				
		//string 연산
		String myString = "my brother";
		String addString = "HO!";
				
		System.out.println(myString);
		System.out.println(myString + addString); //일회용. 즉, 값이 저장되는 것은 아님
				
				
		char myChar = 'A';
		long myBigNumber = 32432443634243L;
		float myFloat = 3432.123f;
				
		System.out.println(myChar);
		System.out.println(myBigNumber);
		System.out.println(myFloat);

	}

}
