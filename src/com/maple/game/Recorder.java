package com.maple.game;

import java.util.List;

import com.maple.dice.FraudDice;
import com.maple.player.Player;

public class Recorder {
	
	private List<Player> listPlayer;

	public Recorder(List<Player> listPlayer){
		this.listPlayer = listPlayer;
	}
	
	public void printOneRound() {
		StringBuffer strBuffer = new StringBuffer();
		
		strBuffer.append("[");
		for (Player player: listPlayer) {
			strBuffer.append(" " + player.getName() + ":" + player.getSumScore() + getCurrentMode(player) + " ");
		}
		strBuffer.append("]");
		
		System.out.println(strBuffer.toString());
	}
	
	private String getCurrentMode(Player player) {
		String currentMode;
		if ( player.getDice().getClass().getSimpleName().equals("FraudDice") ) {
			FraudDice fraudDice = (FraudDice) player.getDice();
			currentMode = "[" + fraudDice.getMode().toString() +"]";
		} else {
			currentMode = "";
		}
		return currentMode.toString();
	}
	
	public void printWinner(Player winner) {
		
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("\n승자를 기록합니다.\n");
		
		if (winner == null) {
			strBuffer.append("비겼습니다.\n");
		} else {
			strBuffer.append(winner.getName() + "님이 승리했습니다!\n");
		}		
		System.out.println(strBuffer.toString());
	}
	
}
