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
        System.out.println(this.name + " Введите координаты куда поставить ваш знак (формат: \"1, 2\") ...");
        String[] coord = console.nextLine().split(", ");
        if(coord.length != 2) {
            System.out.println("Вы ввели не правильно координаты");
            movePlayer();
        } else if(isNumeric(coord[0]) && isNumeric(coord[1])) {
            int coordX = Integer.parseInt(coord[0]);
            int coordY = Integer.parseInt(coord[1]);
            if(coordX <=0 || coordX > pole.getSize() || coordY <= 0 || coordY > pole.getSize() ){
                System.out.println("Координаты введены не в заданных полях, введите еще раз ....");
                movePlayer();
            } else if (pole.getPole()[coordX][coordY] == "_") {
                pole.getPole()[coordX][coordY] = this.simvol;
                pole.printPole();
            } else {
                System.out.println("В данной ячейке уже есть значение, введите в другое поле");
                movePlayer();
            }

        } else {
            movePlayer();
        }
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
