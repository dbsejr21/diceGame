package com.maple.game;

import java.util.List;

import com.maple.player.Player;

public class Recorder {
	
	private List<Player> listPlayer;

	public Recorder(List<Player> listPlayer){
		this.listPlayer = listPlayer; 
	}

	
	public void printStatusOnce() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("[ ");
		stringBuffer.append(listPlayer.get(0).getName() + ":" + listPlayer.get(0).getSumScore() );
		stringBuffer.append(" ");
		stringBuffer.append(listPlayer.get(1).getName() + ":" + listPlayer.get(1).getSumScore() );
		stringBuffer.append(" ]");
		stringBuffer.append("\n");
		
		System.out.println(stringBuffer.toString());
	}
	
	public void printWinner(Player winner) {
		
		StringBuffer stringBuffer = new StringBuffer();
		String winnderName = winner.getName();
		stringBuffer.append("승자를 기록합니다.\n");
		
		if (winnderName == "비김") {
			stringBuffer.append("비겼습니다.\n");
		} else {
			stringBuffer.append(winner.getName() + "가 승리했습니다!\n");
		}
		
		System.out.println(stringBuffer.toString());
	}
	
}
