package team;

public class Competition {

	private String nameOfCompetition,nameOfWiningTeam,nameOfTheRunnerUp;
	private int yearOfCompetition;
	
	public Competition(String nameOfCompetition,String nameOfWiningTeam,String nameOfTheRunnerUp,int yearOfCompetition) {
		setCompetition( nameOfCompetition, nameOfWiningTeam, nameOfTheRunnerUp, yearOfCompetition);
	}
	public Competition(String nameOfWiningTeam,String nameOfTheRunnerUp,int yearOfCompetition) {
		setCompetition("no name of competition", nameOfWiningTeam, nameOfTheRunnerUp, yearOfCompetition);
	}
	public Competition(String nameOfTheRunnerUp,int yearOfCompetition) {
		setCompetition( "no name of competition", "no name of wining team", nameOfTheRunnerUp, yearOfCompetition);
	}
	public Competition(int yearOfCompetition) {
		setCompetition("no name of competition", "no name of wining team", "no name of runner up", yearOfCompetition);
	}
	public Competition() {
		setCompetition("no name of competition", "no name of wining team", "no name of runner up", 0);
	}
	
	public void setCompetition(String nameOfCompetition,String nameOfWiningTeam,String nameOfTheRunnerUp,int yearOfCompetition) {
		this.nameOfCompetition=nameOfCompetition;
		this.nameOfWiningTeam=nameOfWiningTeam;
		this.nameOfTheRunnerUp=nameOfTheRunnerUp;
		this.yearOfCompetition=yearOfCompetition;
	}


	public String getNames() {
		return(nameOfCompetition+", "+nameOfWiningTeam+", "+nameOfTheRunnerUp+", "+yearOfCompetition);
	}
}
