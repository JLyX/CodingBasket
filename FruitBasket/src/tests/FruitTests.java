package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Fruit;
import model.FruitNames;

public class FruitTests {

	@Test
	public void createBananaWithCostFive() {
		Fruit banana = new Fruit(FruitNames.Banana, 5.00);
		assertEquals(banana.getName(), FruitNames.Banana);
		assertEquals(banana.getCost(), 5.00);
	}
	
	@Test
	public void createBananaWithNegativeCost() {
		Fruit banana = new Fruit(FruitNames.Banana, -5.00);
		assertEquals(banana.getName(), FruitNames.Banana);
		assertEquals(banana.getCost(), 0.00);
	}
}
