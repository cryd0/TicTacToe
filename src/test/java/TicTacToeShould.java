import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class TicTacToeShould {

    @Test
    public void stopAfterPlayingWithTwoBots(){

        Referee r = new Referee(new Playboard(),
                new BotPlayer("Gandalf"),
                new BotPlayer("Dumbledore"));
        r.start();
        assertTrue (true);
    }
    @Test
}
