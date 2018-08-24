package highscore;

public class Test {
	public static void main(String[] args) {
		HighScore HighScore = new HighScore();
		System.out.println(HighScore.getScore());
		HighScore.setScore(-5);
		System.out.println(HighScore.getClass());
		System.out.println(HighScore.getScore());
		
		
	}

}
