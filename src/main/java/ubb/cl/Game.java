package ubb.cl;

public class Game {
	int score;
	public Game(){
		score=0;
	}
	public int getScore(){
		return score;
	}
	public void roll(int pins){
		score+=pins;
	}

}
