import java.util.Scanner;

public class MetricConv {

    public static void main(String[] args) {


        double meter;
        double inch;
        double feet;
        double mile;
        String trash;

        // inch = meter * 39.37
        // feet = meter * 3.28
        // mile = meter / 1609.344

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the measurement in meters: ");

        if (in.hasNextDouble()) {
            meter = in.nextDouble();
            in.nextLine();

            inch = meter * 39.37;
            feet = meter * 3.28;
            mile = meter / 1609.344;

            System.out.printf("The measurement in inches is %.2f%n", inch);
            System.out.printf("The measurement in feet is %.2f%n", feet);
            System.out.printf("The measurement in miles is %.2f%n", mile);

        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid measurement value: " + trash);
        }
    }
}