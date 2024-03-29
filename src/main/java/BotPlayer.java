import java.util.Random;

public class BotPlayer implements Playable {

    private String name;
    Symbol s;

    public BotPlayer(String name) {
        this.name = name;
    }


    public int[] getCoord() {

        Random i = new Random();
        int row = i.nextInt(3);
        Random c = new Random();
        int col = i.nextInt(3);
        return new int[]{row, col};
    }


    public Symbol getSymbol() {
        return s;
    }

    public void setSymbol(Symbol s) {
     this.s = s;
    }
}
