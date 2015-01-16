package test.maple.game;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.maple.dice.Dice;
import com.maple.game.Judge;
import com.maple.player.Player;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

public class JudgeTest {
	
	private Player player1 = new Player("주윤덕", new Dice());
	private Player player2 = new Player("엄마", new Dice());
	private Player winner = null;
	
	private List<Player> listPlayer = new ArrayList<Player>();
	
	Judge judge;
	
	
	@Before
	public void setup() {
		
		
		listPlayer.add(player1);
		listPlayer.add(player2);
		
		judge = new Judge();
		judge.setListPlayer(listPlayer);
		judge.setRollNumber(5);
		
	}
	
	@Test
	public void testManageGame_심판은_스코어_합계가_더_큰_플레어이를_승리자로_한다() {
		
		winner = judge.manageGame();
		
		int scoreWinnerFromJudge = winner.getSumScore();
		int scorePlayer1 = player1.getSumScore();
		int scorePlayer2 = player2.getSumScore();
		int scoreWinnerExpected = Math.max(scorePlayer1, scorePlayer2);
		
//		System.out.println("scorePlayer1         : " + scorePlayer1);
//		System.out.println("scorePlayer2         : " + scorePlayer2);
//		System.out.println("");
//		System.out.println("scoreWinnerFromJudge : " + scoreWinnerFromJudge);
//		System.out.println("scoreWinnerExpected  : " + scoreWinnerExpected);
		
		
		assertTrue(scoreWinnerFromJudge == scoreWinnerExpected);
		
	}
	

}
