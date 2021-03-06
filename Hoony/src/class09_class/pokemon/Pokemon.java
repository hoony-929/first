package class09_class.pokemon;

import class09_class.Constants;

public class Pokemon {
	private String name; // 포켓몬 이름
	private String skill; // 포켓몬 스킬
	private int damage; // 포켓몬 공격력
	private int hp; // 포켓몬 체력
	private int type; // 포켓몬 속성, 타입을 int로 준 이유는 String 했을 시 계속 찾아야하기 때문에.....
	private int cost; // 포켓몬 가격

	public Pokemon() {

	}

	public Pokemon(String name, String skill, int damage, int hp, int type, int cost) {
		super();
		this.name = name;
		this.skill = skill;
		this.damage = damage;
		this.hp = hp;
		this.type = type;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Pokemon [" + name + ", 스킬: " + skill + ", 공격력: " + damage + ", 체력: " + hp + ", 속성: " + Constants.typeToString(type) + ", 비용: "
				+ cost + "]";
	}

	public String getName() {
		return name;
	}

	public String getSkill() {
		return skill;
	}

	public int getDamage() {
		return damage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getType() {
		return type;
	}

	public int getCost() {
		return cost;
	}
	
	public void attack(Pokemon enemy) {
		
		// 물은 불 타입에 2배, 풀 타입에 1/2배 데미지
		// 불은 풀 타입에 2배, 물 타입에 1/2배 데미지
		// 풀은 물 타입에 2배, 불 타입에 1/2배 데미지
		// 전기는 물 타입에 2배, 풀 타입에 2배 데미지
		if(this.type == Constants.TYPE_WATER) {
			if(enemy.getType() == Constants.TYPE_FIRE) {
				enemy.hp -= this.damage * 2;
			} else if(enemy.getType() == Constants.TYPE_PLANT) {
				enemy.hp -= this.damage / 2;
			} else {
				enemy.hp -= this.damage;
			}
		}
		if(this.type == Constants.TYPE_FIRE) {
			if(enemy.getType() == Constants.TYPE_PLANT) {
				enemy.hp -= this.damage * 2;
			} else if(enemy.getType() == Constants.TYPE_WATER) {
				enemy.hp -= this.damage / 2;
			} else {
				enemy.hp -= this.damage;
			}
		}
		if(this.type == Constants.TYPE_PLANT) {
			if(enemy.getType() == Constants.TYPE_WATER) {
				enemy.hp -= this.damage * 2;
			} else if(enemy.getType() == Constants.TYPE_FIRE) {
				enemy.hp -= this.damage / 2;
			} else {
				enemy.hp -= this.damage;
			}
		}
		if(this.type == Constants.TYPE_THUNDER) {
			if(enemy.getType() == Constants.TYPE_PLANT) {
				enemy.hp -= this.damage * 2;
			} else if(enemy.getType() == Constants.TYPE_WATER) {
				enemy.hp -= this.damage * 2;
			} else {
				enemy.hp -= this.damage;
			}
		}
		System.out.println(this.name + "이(가) " + enemy.getName() + "을(를) 공격하였습니다." );
	}
	
}
