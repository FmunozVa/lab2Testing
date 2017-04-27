package ubb.cl;

public class Game {
	int score;
	private boolean strike;
	private boolean spare;
	private int[] juegos;
	private int ultimo;
	int pos;
	int cont;

	private int roll;

	public Game() {
		cont=0;
		score = 0;
		ultimo = 0;
		juegos = new int[10];
for (int i = 0; i < juegos.length; i++) {
	juegos[i]=0;
}
		spare = false;
		strike = false;
	}

	public int getScore() {
		score = 0;
		for (int i = 0; i < juegos.length; i++) {
			score += juegos[i];
		}
		return score;
	}

	public void roll(int pins) {
		if (pins == 10) {
				strike=true;
				pos=ultimo;
				ultimo++;
				juegos[pos]=10;
				cont=0;
					
		} else {
			cont++;
			if (spare == true) {
				spare = false;
				juegos[ultimo - 1] = pins + 10;
				ultimo++;
			}

			if ((juegos[ultimo] + pins) == 10) {
				spare = true;
				ultimo++;
				roll=0;
				cont++;

			} else {
				juegos[ultimo]+=pins;
				roll++;
				cont++;
				if (roll == 2) {
					roll = 0;
					ultimo++;
				}

			}
		}
		if(strike==true &&cont>0){
			juegos[pos]+=pins;
			if(cont>2){
			strike=false;
			cont=0;
			}
			}
		
	}

}