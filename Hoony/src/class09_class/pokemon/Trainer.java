package class09_class.pokemon;

import java.util.ArrayList;

public class Trainer {
	private String name;														 // 트레이너 이름
	private int money;														 // 트레이너 소지금
	private int bet = 0; 													 // 베팅 금액
	private ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>(); // 소유한 포켓몬 리스

	public Trainer() {

	}

	public Trainer(String name, int money) {
		this.name = name;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", money=" + money + ", bet=" + bet + ", pokemonList=" + pokemonList + "]";
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}

	public ArrayList<Pokemon> getPokemonList() {
		return pokemonList;
	}

	public void setPokemonList(ArrayList<Pokemon> pokemonList) {
		this.pokemonList = pokemonList;
	}
	
	public void buyPokemon(Pokemon pokemon) {
		pokemonList.add(pokemon);
		this.money -= this.bet;
	}
	
	public void showPokemonList() {
		if(pokemonList.size() > 0) {
		System.out.println(this.name + "님의 포켓몬 현황");
		for(Pokemon pm : pokemonList) {
			System.out.println(pm);
		}
		}
	}
	
	public int checkPokemon() {
		int deathCount = 0;
		for(Pokemon po : pokemonList) {
			if(po.getHp() <= 0) {
				deathCount++;
			}
		}
		return deathCount;
	}
	
	
	
	

}
