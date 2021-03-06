package test.maple.game;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.maple.dice.Dice;
import com.maple.game.Judge;
import com.maple.game.Recorder;
import com.maple.player.Player;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

public class JudgeTest {
	
	private Player player1 = new Player("주윤덕", new Dice());
	private Player player2 = new Player("엄마", new Dice());
	
	private List<Player> listPlayer = new ArrayList<Player>();
	
	Recorder recorder;
	Judge judge;
	
	
	@Before
	public void setup() {
		
		
		listPlayer.add(player1);
		listPlayer.add(player2);
		
		// Recorder 구현 안되어있었을 때
//		judge = new Judge();
//		judge.setListPlayer(listPlayer);
//		judge.setRollNumber(5);
		
		// Recorder 구현 되었을때
//		recorder = new Recorder(listPlayer);
		judge = new Judge();
		judge.setGameRound(5);
		judge.registerPlayer(player1);
		judge.registerPlayer(player2);
		
	}
	
//	@Test
//	public void testManageGame_심판은_스코어_합계가_더_큰_플레어이를_승리자로_한다() {
//		
//		winner = judge.manageGame();
//		
//		int scoreWinnerFromJudge = winner.getSumScore();
//		int scorePlayer1 = player1.getSumScore();
//		int scorePlayer2 = player2.getSumScore();
//		int scoreWinnerExpected = Math.max(scorePlayer1, scorePlayer2);
//		
////		System.out.println("scorePlayer1         : " + scorePlayer1);
////		System.out.println("scorePlayer2         : " + scorePlayer2);
////		System.out.println("");
////		System.out.println("scoreWinnerFromJudge : " + scoreWinnerFromJudge);
////		System.out.println("scoreWinnerExpected  : " + scoreWinnerExpected);
//		
//		
//		assertTrue(scoreWinnerFromJudge == scoreWinnerExpected);
//		
//	}
	
	@Test
	public void testManageGame_기록원은_모든플레이어의_플레이를_기록하고_승자도_기록한다(){
		judge.manageGame();
	}
	

}
