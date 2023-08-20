public class App {
    public static double distance(double x1, double y1, double x2, double y2) {
        // Calculate the distance using the Euclidean distance formula
        double part1 = x2 - x1;
        double part2 = y2 - y1;
        double distance = Math.sqrt(part1 * part1 + part2 * part2);
        return distance;
    }

    public static void main(String[] args) {
        double x1 = 1, y1 = 1;
        double x2 = 1, y2 = 1;
        
        double distance = distance(x1, y1, x2, y2);
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);
    }
}