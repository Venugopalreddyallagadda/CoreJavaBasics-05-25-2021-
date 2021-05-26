package com.ojas.player.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\Bhupal\\Desktop\\PlayersData.txt"); 
			FileReader fr = new FileReader(file); 
			BufferedReader br = new BufferedReader(fr); 
			StringBuffer sb = new StringBuffer(); 
			String playerLines;
			ArrayList<Player> playersList = new ArrayList<Player>();
			while ((playerLines = br.readLine()) != null) {
				String[] values = playerLines.split(";");
				if (!values[0].equals("PlayerName")) {
					
					Player player = new Player();
					player.setPlayerName(values[0]);
					player.setCountry(values[1]);
					player.setTotalRuns(Integer.parseInt(values[2]));
					player.setHighestScore(Integer.parseInt(values[3]));
					playersList.add(player);
					System.out.println("Player : " + player.toString());
				}
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	}


