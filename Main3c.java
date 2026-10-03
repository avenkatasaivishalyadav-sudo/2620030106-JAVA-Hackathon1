import java.util.Scanner;

public class Main3c {

    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste at point 1: ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste at point 2: ");
        double point2Waste = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total Waste Collected: " + totalWaste + " kg");

        sc.close();
    }
}