package model;

public class Fruit {

	private FruitNames name;
	private double cost;
	
	public Fruit(FruitNames name, double cost){
		this.name = name;
		
		if (cost < 0.0) {
			this.cost = 0.0;
		}
		else {
			this.cost = cost;
		}
	}

	public FruitNames getName() {
		return name;
	}

	public void setName(FruitNames name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", cost=" + cost + "]";
	}
	
}
