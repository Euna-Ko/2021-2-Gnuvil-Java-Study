//Practice If
public class Work3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Ʒ� ����(isCar~asset)�� ���� grade�� �޶���
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
		
		/*�� �ٸ� ���
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
			// &&: AND ������, ||: OR ������
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
