
public class GamePols {
    private int size = 3;
    private String[][] pole;


    public GamePols(){
        inicPole();
    }
    public void inicPole() {
        this.pole = new String[size+1][size+1];
        for(int i = 0; i < pole.length; i++) {
            for(int j = 0; j < pole[i].length; j++) {
                pole[i][j] = "_";
            }
        }
        for(int i = 0; i < size+1; i++) {
            pole[0][i] = Integer.toString(i);
            pole[i][0] = Integer.toString(i);
        }
    }

    public void printPole() {
        for(int i = 0; i < pole.length; i++) {
            for(int j = 0; j < pole[i].length; j++) {
                System.out.print(pole[i][j] + " ");
            }
            System.out.println();
        }
    }



    public String[][] getPole() {
        return this.pole;
    }

    public int getSize() {
        return size;
    }
}
