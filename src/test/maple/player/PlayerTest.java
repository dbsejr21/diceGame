package test.maple.player;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.maple.dice.Dice;
import com.maple.player.Player;

public class PlayerTest {

	private Player player;
	
	@Before
	public void setup() {
		player = new Player("주윤덕", new Dice());
	}
	
	@Test
	public void testGetSumScore_주사위값이_1이상_6이하다() {
	
		player.rollDice();
		
		int sumScore = player.getSumScore();
		System.out.println("sumScore: " + sumScore);
		
		assertTrue( 1 <= sumScore && sumScore <= 6 );
	}
	
}
