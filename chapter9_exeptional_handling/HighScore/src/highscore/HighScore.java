package highscore;

public class HighScore {
	
	private int score=0;
	private boolean scoreInt=false;
	
	HighScore(){
		score=0;
		scoreInt=false;
	}
	
	HighScore(int score){
		setScore(score);
		scoreInt=false;
	}
	
	public void setScore(int score) {
		if(score>0) {
		this.score=score;
		scoreInt=true;
		}
		else 
			System.out.println("Wrong score!");
	}
	
	public int getScore() {
		if (!scoreInt)
			return -1;
			else
		return score;
	}
}
