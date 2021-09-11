package week2;
//Practice class

public class Work5 {
	
	static class Player{
		String name;
		int hp;
		int atk;
		
		public Player(String name, int hp, int atk) {
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		public void attack(Enemy enemy) {
			System.out.println("Player Attacks!");
			enemy.hp -= this.atk;
			System.out.println("Enemy hp : " + enemy.hp);
		}
		
		public boolean isLive() {
			if (hp <= 0) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	static class Enemy{
		String name;
		int hp;
		int atk;
		
		public Enemy(String name, int hp, int atk) {
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		public void attack(Player player) {
			System.out.println("Enemy Attacks!");
			player.hp -= this.atk;
			System.out.println("Player hp : " + player.hp);
		}
		
		public boolean isLive() {
			if (hp <= 0) {
				return false;
			}
			else {
				return true;
			}
		}

	}

	public static void main(String[] args) {
		
		Player player = new Player("Hero", 100, 12); //������: class�� �̸��� ����
		Enemy enemy = new Enemy("Orc", 80, 5);
		
		while(player.isLive() && enemy.isLive()) {
			player.attack(enemy);
			if (!enemy.isLive()) break; //���� �׾��� �� ���� ��ġ�� ���� ��ġ
										//�� ������ ���� �� ���� �׾�� ���ݱ��� �Ѿ
			enemy.attack(player);
			if (!player.isLive()) break; //(!player.isLive()) == (player.isLive() == false)
		}
		
		if (player.isLive()) {
			System.out.println("Player Win!");
		}
		else {
			System.out.println("Enemy Win!");
		}

	}

}
