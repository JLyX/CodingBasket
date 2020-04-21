package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Basket;
import model.Fruit;
import model.FruitNames;

public class BasketTests {
	
	private Basket fruitBasket;
	
	@BeforeEach
	public void setUp() { 
		fruitBasket = new Basket();
	}
	
	@Test
	public void calculatingCostOfEmptyBasket() {
		double cost = fruitBasket.calculateCost();
		assertEquals(cost, 0.0);
	}
	
	@Test
	public void calculatingCostOfOneFruitInBasket() {
		Fruit banana = new Fruit(FruitNames.Banana, 5.31);
		fruitBasket.addFruit(banana);
		double cost = fruitBasket.calculateCost();
		assertEquals(cost, 5.31);
	}
	
	@Test
	public void calculatingCostAfterAddingAListOfFruits() {
		Fruit banana = new Fruit(FruitNames.Banana, 5.31);
		Fruit apple = new Fruit(FruitNames.Apple, 2.69);
		Fruit lemon = new Fruit(FruitNames.Lemon, 3.00);
		
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(banana);
		fruits.add(apple);
		fruits.add(lemon);
		
		fruitBasket.addFruits(fruits);
		
		double cost = fruitBasket.calculateCost();
		assertEquals(cost, 11.00);
	}
	
	@Test
	public void calculatingCostAfterClearingBasket() {
		Fruit banana = new Fruit(FruitNames.Banana, 5.31);
		fruitBasket.addFruit(banana);
		fruitBasket.clearBasket();
		
		double cost = fruitBasket.calculateCost();
		assertEquals(cost, 0.0);
	}
}
