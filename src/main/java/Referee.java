import java.util.Random;

public class Referee {

    private Playable pX;
    private Playable p0;
    private Playboard board;


    public Referee(Playboard board, Playable a, Playable b) {

        this.board = board;
        Random r = new Random();

        if (r.nextBoolean()) {
            this.pX = a;
            a.setSymbol(Symbol.SYMBOL_X);
            this.p0 = b;
            b.setSymbol(Symbol.SYMBOL_0);
        } else {
            this.pX = b;
            b.setSymbol(Symbol.SYMBOL_X);
            this.p0 = a;
            a.setSymbol(Symbol.SYMBOL_0);
        }
    }

    public void start(){


        Playable currentPlayer = pX;
        while (board.getWinner() == Symbol.SYMBOL_EMPTY){
        System.out.println(board);
        System.out.println(currentPlayer + " este la rand ");
        int [] coord = currentPlayer.getCoord();

        boolean validCoord = false;
        while (validCoord == false){
        if (board.isEmpty(coord)){
            board.fill(coord, currentPlayer.getSymbol());
            validCoord = true;
            if (currentPlayer == pX)
                currentPlayer = p0;
            else currentPlayer = pX;
        }
        else {System.out.println("Mutare neacceptata - Introduceti alta coordonata ");
             coord = currentPlayer.getCoord();};
    }

}
        System.out.println(board);
        System.out.println("YUUUUHUUUUUUUUUUUUUUUUU The winner is " + board.getWinner());
}
}