import java.util.Scanner;

public class GameMainMenu {
    public static int MainMenu() {
        System.out.println("\n!!!!!!!! Welcome to GRAYDEBOL GAME TIC-TAC-TOE !!!!!!!!\n\n" +
                            " Please choose and enter number what you want   \n " +
                            "         1. New Game           \n" +
                            "          2. Exit         \n");
        Scanner console = new Scanner(System.in);
        System.out.print("You choise: ");
        while (true) {
            if (console.hasNextInt()) {
                int choiseMenu = console.nextInt();
                switch (choiseMenu) {
                    case 1: {
                        return 1;
                    }
                    case 2: {
                        return 2;
                    } default:
                        System.out.print("Pleaser choose punk for menu:");
                }
            } else {
                System.out.print("Пожалуйста выберите пункт из меню: ");
                console.nextLine();
            }
        }
    }
}
