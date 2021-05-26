package com.ojas.player.filereader;

public class Player {
	private String playerName;
	private String country;
	private int  totalRuns;
	private int highestScore;
	
	public Player() {
		super();
	}

	public Player(String playerName, String country, int totalRuns, int highestScore) {
		super();
		this.playerName = playerName;
		this.country = country;
		this.totalRuns = totalRuns;
		this.highestScore = highestScore;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getHighestScore() {
		return highestScore;
	}

	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", country=" + country + ", totalRuns=" + totalRuns
				+ ", highestScore=" + highestScore + "]";
	}
	
	
}
