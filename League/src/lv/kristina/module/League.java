package lv.kristina.module;

import java.util.ArrayList;

public class League {

	private String nameLeague;
	private ArrayList<Team> nameofTeam;
	
	
	public League(String leagueName){
		this.nameLeague = leagueName;
		this.nameofTeam = new ArrayList<>();
	}
	
	public String getNameLeague() {
		return nameLeague;
	}
	public void setNameLeague(String nameLeague) {
		this.nameLeague = nameLeague;
	}
	public ArrayList<Team> getNameofTeam() {
		return nameofTeam;
	}
	public void setNameofTeam(ArrayList<Team> nameofTeam) {
		this.nameofTeam = nameofTeam;
		
	public void recordWinAndLoss(Team winner, Team loser){
		
		
		winner.setWins(1);
		loser.setLosses(1);
	}
		
	}
	@Override
	public String toString() {
		return "League [nameLeague=" + nameLeague + ", nameofTeam="
				+ nameofTeam + "]";
	}
	
	
	
}
