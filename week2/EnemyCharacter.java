package week2;
//Practice class extends - C

public class EnemyCharacter extends Character{
	
	public EnemyCharacter(String name, int hp, int atk) {
		super(name, hp, atk);
	}
	
	@Override //��ӹ��� �޼����� ǥ��
	public void attack(Character enemy) {
		
		//������ ����� ����
		if(hp <= 20) {
			System.out.println("Orc is ANGRY...!!!");
			this.atk += 15;
		}
		
		super.attack(enemy);
		
		/*����ȯ :���� Character�� ��ӹ޾Ҿ����� PlayerCharacter�� ��ӹ޵��� ��.
		heal�� PlayerCharater���� �ֱ� ����*/
		PlayerCharacter player = (PlayerCharacter) enemy;
		
		if (player.hp <= 30) {
			player.heal();
		}
	}

}
