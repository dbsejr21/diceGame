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
	
	private void print() {
		//출력
//		System.out.println("sumScorePlayer: " + player.getSumScore());
//		System.out.println("sumScoreFraudPlayer: " + fraudPlayer.getSumScore());
//		System.out.println("fraudDiceNum: " + fraudPlayer.getDice().getDiceNum());
		System.out.println("fraudDiceNum: " + fraudDiceNum);
		System.out.println("");
		System.out.println("");
	}
		
	@Test
	public void testRollDice_일반모드일때는_1이상_6이하다() {
		
		// 일반모드 연출 - 동점상황
		player.setSumScore(10);
		fraudPlayer.setSumScore(10);;
		
//		System.out.println(fraudPlayer.getName());
		
		//주사위 굴림
//		fraudPlayer.beforeRollDice();
		fraudPlayer.rollDice();
		
		fraudDiceNum = fraudPlayer.getDice().getDiceNum();
		
		print();
		
		assertTrue( 1 <= fraudDiceNum && fraudDiceNum <= 6 );
		
	}
	

	@Test
	public void testRollDice_지고있을때는_강함모드가되어_3이상_값이다() {
		// 강함모드 연출 - 지고있는상황
		player.setSumScore(10);
		fraudPlayer.setSumScore(2);;
		
		//주사위 굴림
		fraudPlayer.beforeRollDice();
		fraudPlayer.rollDice();
		
		fraudDiceNum = fraudPlayer.getDice().getDiceNum();
		print();
		
		assertTrue( fraudDiceNum >= 3 );
	}
	
	@Test
	public void testRollDice_6점이상으로_이기고있을때는_약함모드가되어_4이하_값이다() {
		// 약함모드 연출 - 6점이상으로 있는상황
		player.setSumScore(10);
		fraudPlayer.setSumScore(20);;
		
		//주사위 굴림
//		fraudPlayer.beforeRollDice();
		fraudPlayer.rollDice();
		fraudDiceNum = fraudPlayer.getDice().getDiceNum();
		
		print();
		
		assertTrue(fraudDiceNum <= 4);
	}
	
}
