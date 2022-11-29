import java.util.Scanner;

public class Player {

    private String name;
    private String simvol;
    private GamePols pole;
    private Scanner console = new Scanner(System.in);


    public Player(String simvol, GamePols pole) {
        System.out.print("Пожалуйста введите имя игрока: ");
        setName(console.nextLine());
        setSimvol(simvol);
        setPole(pole);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSimvol (String simvol) {
        this.simvol = simvol;
    }
    public void setPole(GamePols pole) {
        this.pole = pole;
    }

    public void movePlayer() {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println(this.name + " Введите координаты куда поставить ваш знак (формат: \"1, 2\") ...");
            String[] coord = console.nextLine().split(", ");
            if(checkMove(coord)) {
                this.pole.getPole()[Integer.parseInt(coord[0])] [Integer.parseInt(coord[1])] = this.simvol;
                this.pole.printPole();
                break;
            }
        }
    }

    private boolean checkMove(String[] coord) {
        if(coord.length != 2) {
            System.out.println("Вы вели не правильно координаты");
            return false;
        } else if (isNumeric(coord[0]) && isNumeric(coord[1])) {
            if(Integer.parseInt(coord[0]) <= 0 || Integer.parseInt(coord[0]) > this.pole.getSize() ||
                Integer.parseInt(coord[1]) <= 0 || Integer.parseInt(coord[1]) > this.pole.getSize()) {
                System.out.println("Координаты введены не в заданных полях, введите еще раз ...");
                return false;
            } else if (this.pole.getPole()[Integer.parseInt(coord[0])][Integer.parseInt(coord[1])].equals("_")) {
                return true;
            } else {
                System.out.println("В данной ячейке уже есть значение, введите координаты свободной ячейки... ");
                return false;
            }
        } else return false;

    }

    public String getSimvol() {
        return simvol;
    }

    public String getName(){ return this.name; }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
