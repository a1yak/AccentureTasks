public class Volvo extends Car {

    private int speed;
    private int currentGear;
    private String model;

    Volvo() {
        super();
        this.model = "xC90";
        this.currentGear = 1;
    }

    Volvo(String model, String type) {
        super(type);
        this.model = model;
    }


    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed += 10;
    }

    public void decreaseSpeed() {
        this.speed = (currentGear*10)*2;
    }

    public void changeGear() {
        System.out.println("Current gear is " + this.currentGear + ". Change it to 1-lower 2-higher: ");
        switch (sc.nextInt()) {
            case 1:
                this.currentGear--;
                this.decreaseSpeed();
                break;
            case 2:
                this.currentGear++;
                this.increaseSpeed();
                break;
        }
    }

    public void showInfo() {
        if (this.getSpeed() > 0) {
            System.out.println(this.model + " is driving with the speed of " + this.getSpeed() + " on gear " + this.currentGear);
        } else System.out.println(this.model + " is not driving");
    }
}