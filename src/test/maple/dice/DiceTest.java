package test.maple.dice;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.maple.dice.Dice;

public class DiceTest {
	
private Dice dice;
	
	@Before
	public void setup() {
		dice = new Dice();
	}
	
	@Test
	public void testRollDice_주사위를_굴렸을때_1이상6이하값만나온다() {
		int result = dice.rollDice();
		assertTrue(1 <= result && result <= 6);
	}
	
}
