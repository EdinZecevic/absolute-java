package team;

public class Team {
	private String teamName;
	private String name1,name2,name3,name4;
	private String competition1,competition2;
	

	public Team(String name1,String name2,String name3,String name4,String teamName) {
		setNames(name1,name2,name3,name4,teamName);
	}
	public Team(String name2,String name3,String name4,String teamName) {
		setNames("no name1",name2,name3,name4,teamName);
	}
	public Team(String name3,String name4,String teamName) {
		setNames("no name1","no name2",name3,name4,teamName);
	}
	public Team(String name4,String teamName) {
		setNames("no name1","no name2","no name3",name4,teamName);
	}
	public Team(String teamName) {
		setNames("no name1","no name2","no name3","no name4",teamName);
	}
	public Team() {
		setNames("no name1","no name2","no name3","no name4","no team name");
	}
	
	public void setTeamName(String teamName) {
		this.teamName=teamName;
	}
	
	public void setNames(String name1,String name2,String name3,String name4,String teamName){
		this.name1=name1;
		this.name2=name2;
		this.name3=name3;
		this.name4=name4;
		this.teamName=teamName;
	}
	
	public String getNames() {
		return(name1+", "+name2+", "+name3+", "+name4+", "+teamName);
	}

	public void setCompetition(String competition1,String competition2) {
		this.competition1=competition1;
		this.competition2=competition2;
	}

	public String getCompetition() {
		return(competition1+", "+competition2);
	}
}

