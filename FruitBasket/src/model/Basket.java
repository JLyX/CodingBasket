package model;
import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<Fruit> fruits;
	
	public Basket() {
		fruits = new ArrayList<Fruit>();
	}
	
	public List<Fruit> getFruits() {
		return fruits;
	}

	public void addFruit(Fruit fruit) {
		fruits.add(fruit);
	}
	
	public void addFruits(List<Fruit> fruits) {
		this.fruits.addAll(fruits);
	}
	
	public void clearBasket() {
		fruits.clear();
	}
	
	public double calculateCost() {
		double totalCost = 0;
		
		for (Fruit f : fruits) {
			totalCost += f.getCost();
		}
		
		return totalCost;
	}
}
