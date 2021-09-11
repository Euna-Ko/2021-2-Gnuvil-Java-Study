package week2;
//Practice class extends - C

public class EnemyCharacter extends Character{
	
	public EnemyCharacter(String name, int hp, int atk) {
		super(name, hp, atk);
	}
	
	@Override //상속받은 메서드라는 표시
	public void attack(Character enemy) {
		
		//광전사 모드라는 설정
		if(hp <= 20) {
			System.out.println("Orc is ANGRY...!!!");
			this.atk += 15;
		}
		
		super.attack(enemy);
		
		/*형변환 :원래 Character을 상속받았었지만 PlayerCharacter을 상속받도록 함.
		heal은 PlayerCharater에만 있기 때문*/
		PlayerCharacter player = (PlayerCharacter) enemy;
		
		if (player.hp <= 30) {
			player.heal();
		}
	}

}
