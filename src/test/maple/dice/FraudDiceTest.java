package test.maple.dice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.maple.dice.FraudDice;

public class FraudDiceTest {
	
	private FraudDice fraudDice;
	
	@Before
	public void setup(){
		fraudDice = new FraudDice();
	}
	
	@Test
	public void testRollDice_주사위를_굴렸을때_1이상6이하값만나온다() {
		int result = fraudDice.rollDice();
		assertTrue(1 <= result && result <= 6);
	}
	
	@Test
	public void testRollDice_강함모드일때_항상_3이상이다 () {
		int result = fraudDice.rollDice();
		assertTrue(result >= 3);
	}
	
	@Test
	public void testRollDice_약함모드일때_항상_4이하다 () {
		int result = fraudDice.rollDice();
		assertTrue(result <= 4);
	}
	
}
