

public class Main {
    public static void main(String[] args) {

        int choise = GameMainMenu.MainMenu();
        switch (choise) {
            case 1: {
                GamePols pole = new GamePols();
                Player player1 = new Player("X", pole);
                Player player2 = new Player("O", pole);
                Player playerVin = null;
                pole.printPole();
                for (int i = 0; i < pole.getSize() * pole.getSize(); i++) {
                    if (i % 2 == 0) {
                        player1.movePlayer();
                        if (i >= 1) {
                            playerVin = EndGame.endGame(pole, player1, player2);
                            if (playerVin != null) {
                                System.out.println("Победитель игры игрок: " + playerVin.getName());
                                break;
                            }
                        }
                    } else {
                        player2.movePlayer();
                        if (i >= 1) {
                            playerVin = EndGame.endGame(pole, player1, player2);
                            if (playerVin != null) {
                                System.out.println("Победитель игры игрок: " + playerVin.getName());
                                break;
                            }
                        }
                    }

                }
                if (playerVin == null) System.out.println("Ничья");
                break;
            } case 2:{
                break;
            }
        }
    }

}