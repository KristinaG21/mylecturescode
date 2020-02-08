package lv.kristina.test;

import java.util.ArrayList;

import lv.kristina.module.League;
import lv.kristina.module.Team;

public class TestTeamAndLeague {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    
		ArrayList<Team> arrTeam = new ArrayList<>();
		
		
		Team cska = new Team("CSKA");
		Team ska = new Team("SKA");
		arrTeam.add(ska);
		arrTeam.add(cska);
		
		League khl = new League("KHL");
		//khl.nameofTeam.add(cska);
		
		
	    khl.setNameofTeam(arrTeam);
		System.out.println(khl.toString());
		

	}

}
