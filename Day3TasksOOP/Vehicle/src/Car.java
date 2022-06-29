public class Car extends Vehicle {
    private String typeOfCar;

    Car()
    {
     this.typeOfCar="Jeep";
    }
     Car(String name)
    {
        this.typeOfCar = name;
    }

    public void steeringWheel(){
        System.out.println("Spinning wheel...");
    }
}
