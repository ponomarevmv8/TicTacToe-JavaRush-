

public class Main {
    public static void main(String[] args) {
        GamePols pole = new GamePols();
        pole.printPole();

        Player player1 = new Player("X", pole);
        Player player2 = new Player("O", pole);
        Player playerVin = null;

        for(int i = 0; i < pole.getSize()* pole.getSize()/2; i++) {
            player1.movePlayer();
            player2.movePlayer();
            if(i >= 1) {
                playerVin = EndGame.endGame(pole, player1, player2);
                if(playerVin != null) {
                    System.out.println("Победитель игры игрок: " + playerVin.getName());
                    break;
                }
            }
        }

        if(playerVin == null) System.out.println("Ничья");

    }
}