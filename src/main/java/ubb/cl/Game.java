package ubb.cl;

public class Game {
	int score;
	private boolean strike;
	private boolean spare;
	private int[] juegos;
	private int ultimo;

	private int roll;

	public Game() {
		score = 0;
		ultimo = 0;
		juegos = new int[10];

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
		} else {
			if (spare == true) {
				spare = false;
				juegos[ultimo - 1] = pins + 10;
				ultimo++;
			}

			if ((juegos[ultimo] + pins) == 10) {
				spare = true;
				ultimo++;
				roll=0;

			} else {
				int aux = juegos[ultimo];
				aux += pins;
				juegos[ultimo] = aux;
				roll++;
				if (roll == 2) {
					roll = 0;
					ultimo++;
				}

			}

		}
	}

}