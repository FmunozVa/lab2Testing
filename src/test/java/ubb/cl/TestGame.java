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
	@Test
	public void FirstRolSixSecondRolFourThirdRolFourFouthRolOneShouldBeNineteenTest(){
			Game game=new Game();
			game.roll(6);
			game.roll(4);
			game.roll(4);
			game.roll(1);
			int result= game.getScore();
			assertEquals(19,result);
		}
	@Test
	public void FirstRolSTrikeSecondRolFourThirdRolFourShouldBeTwentySixTest(){
			Game game=new Game();
			game.roll(10);
			game.roll(4);
			game.roll(4);
			int result= game.getScore();
			assertEquals(26,result);
		}
	

}
