import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurant> restaurants = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.US);

            System.out.print("Enter the restaurant name (example: In-N-Out Burger): ");
            String name = scanner.nextLine();

            System.out.print("Enter the wait time in whole minutes (example: 10): ");
            int waitTime = scanner.nextInt();

            System.out.print("Enter the rating in stars (example: 3.9): ");
            double rating = scanner.nextDouble();

            System.out.print("Enter the average price in dollars without a dollar sign (example: 10.00): ");
            double avgPrice = scanner.nextDouble();

            System.out.print("Enter the distance in miles (example: 11.0): ");
            double distance = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline before reading the hours.

            System.out.print("Enter the opening hours (example: 10:30 AM - 1:00 AM): ");
            String hoursOpen = scanner.nextLine();

            Restaurant restaurant = new Restaurant(name, waitTime, rating, avgPrice,
                    distance, hoursOpen);
            restaurants.add(restaurant);
        }

        System.out.println("\nSaved restaurants:");
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }
    }
}