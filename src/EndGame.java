

public class EndGame {

    public static Player endGame(GamePols pole, Player player1, Player player2) {
        String[][] gamePole = pole.getPole();
        String simvolPl1 = player1.getSimvol();
        String simvol;
        int vin = 0;
        for(int i = 1; i < gamePole.length; i++){
            if(gamePole[i][1].equals("_")) continue;
            simvol = gamePole[i][1];
            int count = 0;
            for(int j = 2; j < gamePole[i].length; j++ ) {
                if(simvol.equals(gamePole[i][j])) count++;
                else break;
            }
            if (count == 2) {
                if(simvol.equals(simvolPl1)) return player1;
                else return player2;
            }
        }
        for ( int i = 1; i < gamePole.length; i++) {
            if(gamePole[1][i].equals("_")) continue;
            simvol = gamePole[1][i];
            int count = 0;
            for ( int j = 2; j < gamePole.length; j++) {
                if(simvol.equals(gamePole[j][i])) count++;
                else break;
            }
            if (count == 2) {
                if(simvol.equals(simvolPl1)) return player1;
                else return player2;
            }
        }
        if (gamePole[1][1].equals("_")) {
        } else {
            simvol = gamePole[1][1];
            for (int i = 2; i < gamePole.length; i++) {
                if (simvol.equals(gamePole[i][i])) vin++;
                else break;
            }
            if (vin == 2) {
                if (simvol.equals(simvolPl1)) return player1;
                else return player2;
            }
        }
        if (gamePole[1][3].equals("_")) {

        } else {
            simvol = gamePole[1][3];
            vin = 0;
            for (int i = 2; i < gamePole.length; i++) {
                if (simvol.equals(gamePole[i][gamePole.length - i])) vin++;
                else break;
            }
            if (vin == 2) {
                if (simvol.equals(simvolPl1)) return player1;
                else return player2;
            }
        }
        return null;

    }

}
