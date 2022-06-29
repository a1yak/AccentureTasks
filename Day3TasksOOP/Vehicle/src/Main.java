import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isDriving = true;
        System.out.println("Which Volvo car you would like to drive (sedan, jeep, hatchback, coupe)?  ");
        String type = scanner.nextLine();
        System.out.println("Which Volvo model you would like to drive?  ");
        String model = scanner.nextLine();
        Volvo xc90 = new Volvo(model, type);
        xc90.startDriving();
        while (isDriving) {
            xc90.changeGear();
            xc90.showInfo();
            System.out.println("Continue driving? 1-yes 2-no");
            switch (scanner.nextInt()) {
                case 1 -> isDriving = true;
                case 2 -> isDriving = false;
                default -> isDriving = false;
            }
        }
        xc90.stopEngine();
    }
}