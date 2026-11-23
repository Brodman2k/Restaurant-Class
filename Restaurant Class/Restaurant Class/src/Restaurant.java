import java.util.Locale;

public class Restaurant {
    private String name;
    private int waitTime;
    private double rating;
    private double avgPrice;
    private double distance;
    private String hoursOpen;

    public Restaurant(String name, int waitTime, double rating, double avgPrice,
                      double distance, String hoursOpen) {
        this.name = name;
        this.waitTime = waitTime;
        this.rating = rating;
        this.avgPrice = avgPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getHoursOpen() {
        return hoursOpen;
    }

    public void setHoursOpen(String hoursOpen) {
        this.hoursOpen = hoursOpen;
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                "Restaurant: %s%nWait time: %d minutes%nRating: %.1f stars%n"
                        + "Average price: $%.2f%nDistance: %.1f miles%nHours open: %s",
                name, waitTime, rating, avgPrice, distance, hoursOpen);
    }
}
