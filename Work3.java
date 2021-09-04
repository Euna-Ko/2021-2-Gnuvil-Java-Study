//Practice If
public class Work3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//아래 조건(isCar~asset)에 따라 grade가 달라짐
		boolean isCar = false;
		boolean isHaveHouse = false;
		boolean isGoldSpoon = false;
		boolean isJob = false;
		
		int asset = 17000;
		
		int grade = myGrade(isCar, isHaveHouse, isGoldSpoon, isJob, asset);

		System.out.println("your grade is: " + grade);
	}
	
	
	static int myGrade(boolean isCar, boolean isHaveHouse,
			boolean isGoldSpoon, boolean isJob, int asset) {

		
		if (isGoldSpoon) {
			return 1;
		}
		else if (isHaveHouse) {
			return 2;
		}
		
		/*또 다른 방법
		 * else {
			if(isHaveHouse) {
				return 2;
			}
		}*/
		
		else if(isCar) {
			return 3;
		}
		else if (isJob) {
			return 4;
		}
		
		else {
			
			if(asset >= 300000000) {
				return 5;
			}
			// &&: AND 연산자, ||: OR 연산자
			else if(10000000 <= asset && asset < 300000000) {
				return 6;
			}
			else if(1000000 <= asset && asset < 10000000) {
				return 7;
			}
			else if((17000 <= asset) && (asset < 1000000)) {
				return 8;
			}
			else {
				return 9;
			}
			
		}
	}

}
