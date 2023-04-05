package Package;

public class ClassConstructor {


    public static void main(String[] args) {
        Car Toyota = new Car();

        Toyota.Model = String.valueOf(2023);
        Toyota.Make = "Camry";
        Toyota.Doors = 4;
        Toyota.Gear = 5;
        Toyota.HighestSpeed = 200;
        Toyota.Tires = 4;
        Toyota.Color = "Blue";
        Toyota.Transmission = "Automatic";

        Toyota.DisplayCharacterstics();



    }
}
