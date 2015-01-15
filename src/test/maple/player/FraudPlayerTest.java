package test.maple.player;

import org.junit.Before;
import org.junit.Test;

import com.maple.dice.Dice;
import com.maple.dice.FraudDice;
import com.maple.player.FraudPlayer;
import com.maple.player.Player;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

public class FraudPlayerTest {

	private FraudPlayer fraudPlayer;
	private Player player;

	private int fraudDiceNum;

	@Before
	public void setup() {
		player = new Player("주윤덕", new Dice());
		fraudPlayer = new FraudPlayer("최강훈", new FraudDice(), player);
	}

	private void printResult() {
		System.out.println("fraudDiceNum: " + fraudDiceNum);
		System.out.println("");
		System.out.println("");
	}

	@Test
	public void testRollDice_일반모드일때는_1이상_6이하다() {
		
		System.out.println("일반모드 테스트케이스 : 동점 상황");
		player.setSumScore(10);
		fraudPlayer.setSumScore(10);;
		System.out.println("fraudPlayer: "+fraudPlayer.getSumScore() + "   " + "Player:" +player.getSumScore());
				
		fraudPlayer.rollDice();
		
		fraudDiceNum = fraudPlayer.getDice().getDiceNum();
		printResult();
		
		assertTrue( 1 <= fraudDiceNum && fraudDiceNum <= 6 );
	}

	@Test
	public void testRollDice_지고있을때는_강함모드가되어_3이상_값이다() {

		System.out.println("강함모드 테스트케이스 : 지고있는 상황");
		player.setSumScore(10);
		fraudPlayer.setSumScore(2);
		
		System.out.println("fraudPlayer: " + fraudPlayer.getSumScore() + "   "
				+ "Player:" + player.getSumScore());

		fraudPlayer.rollDice();

		fraudDiceNum = fraudPlayer.getDice().getDiceNum();
		printResult();

		assertTrue(fraudDiceNum >= 3);
	}

	@Test
	public void testRollDice_6점이상으로_이기고있을때는_약함모드가되어_4이하_값이다() {

		System.out.println("약함모드 테스트케이스 : 6점차 이상으로 이기고 있는 상황");
		player.setSumScore(10);
		fraudPlayer.setSumScore(20);

		System.out.println("fraudPlayer: " + fraudPlayer.getSumScore() + "   "
				+ "Player:" + player.getSumScore());

		fraudPlayer.rollDice();

		fraudDiceNum = fraudPlayer.getDice().getDiceNum();
		printResult();

		assertTrue(fraudDiceNum <= 4);
	}

}
