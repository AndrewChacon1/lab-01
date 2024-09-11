package c;

public class CarRunner {
    public static void main(String[] args) {

        HybridVehicle hybrid = new HybridVehicle(20.0, 80.0);

        double gasCostPerGallon = 4.10;
        double electricCostPerKWh = 0.30;

        double miles = 150;
        double mpg = 25;
        double gasCost = (miles / mpg) * gasCostPerGallon;

        System.out.println("Cost in fully gas mode for 150 miles: $" + gasCost);

        double milesElectric = 200;
        double kWhUsed = 60;
        double mpge = milesElectric / kWhUsed * 33.7;
        double electricCost = (kWhUsed * electricCostPerKWh);

        System.out.println("Cost in fully electric mode for 200 miles: $" + electricCost);

        System.out.println("MPGe for 200 miles: " + mpge + " MPGe");

        double averageMPG = (mpg + mpge) / 2;

        System.out.println("Average MPG in hybrid mode: " + averageMPG);
    }
}
