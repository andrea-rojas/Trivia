import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.adaptionsoft.games.uglytrivia.Game;


public class GameTests {

	@Test
	public void player_wins_when_six_questions_are_answered_correctly() {
		boolean didWin = true;
		Game aGame = new Game();
		aGame.add("Rola");
		
		for(int i=0; i<6; i++){
			didWin = aGame.wasCorrectlyAnswered();
		}
		assertThat(didWin,equalTo(false));
	}

	@Test
	public void game_is_playable_when_there_are_two_players() {
		boolean isPlayable = false;
		Game aGame = new Game();
		
		aGame.add("Rola");
		aGame.add("Shira");
		isPlayable = aGame.isPlayable();
		
		assertThat(isPlayable, equalTo(true));		
	}

}
