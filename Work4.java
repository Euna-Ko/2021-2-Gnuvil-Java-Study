// Practice Arrays, For/ While loop
import java.util.Random;

public class Work4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int money = 10000;
		
		while (money >= 1000) {
			//buy lotto
			money -= 1000;
			//0~9까지의 정수 중 무작위
			int number = random.nextInt(100);
			int lottoMoney = buyLotto(number);
			System.out.println("My number is " + number + " / Lotto : "+ lottoMoney);
			money += lottoMoney;
			System.out.println("My money is " + money);
		}
		System.out.println("Lose...");
	}
	
	
	static int buyLotto(int number) {
		
		int[] lotto = new int[100];
		
		//for문을 통해 모든 값을 0으로 채운 뒤 특정 값들만 다시 설정
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0;
		}
		
		lotto[2] = 100;
		lotto[77] = 3000;
		lotto[99] = 500;
		
		return lotto[number];
	}

}
