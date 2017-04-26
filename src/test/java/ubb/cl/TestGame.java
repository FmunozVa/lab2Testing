package ubb.cl;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGame {
	@Test
public void FirstRolFiveSecondRolFourShouldBeNineTest(){
		Game game=new Game();
		game.roll(5);
		game.roll(4);
		int result= game.getScore();
		assertEquals(9,result);
	}

}
