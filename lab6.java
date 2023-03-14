import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {

        Map<String, String> region = new HashMap<>();

        region.put("Lviv", "Lviv region");
        region.put("Dnipro", "Dnipropetrovsk region");
        region.put("Kharkiv", "Kharkiv region");
        region.put("Vinnytsia", "Vinnytsia region");
        region.put("Odesa", "Odesa region");
        region.put("Rivne", "Rivne region");
        region.put("Poltava", "Poltava region");
        region.put("Sumy", "Sumy region");
        region.put("Cherkasy", "Cherkasy region");
        region.put("Mykolaiv", "Mykolaiv region");

        Scanner in = new Scanner(System.in);

        testPutElement(region, in);

        testGettingElement(region, in);

        testRemovingElement(region, in);
    }

    private static void testPutElement(Map<String, String> region, Scanner in) {
        System.out.println("Enter city to add: ");
        String cityToAdd = in.next();
        in.nextLine(); // read the rest of the line after next()
        System.out.println("Enter region for " + cityToAdd + ": ");
        String regionToAdd = in.nextLine();
        region.put(cityToAdd, regionToAdd);
        System.out.println("City " + cityToAdd + " added with region " + regionToAdd);
        System.out.println("City - region: " + region);
    }

    private static void testGettingElement(Map<String, String> region, Scanner in) {
        System.out.println("Enter city to search: ");
        String city = in.next();
        in.nextLine(); // read the rest of the line after next()
        if (region.containsKey(city)) {
            System.out.println("City " + city + ": " + region.get(city));
        } else {
            System.out.println("City " + city + " not found");
        }
    }

    private static void testRemovingElement(Map<String, String> region, Scanner in) {
        System.out.println("Enter city to delete: ");
        String cityToDelete = in.next();
        in.nextLine(); // read the rest of the line after next()
        if (region.containsKey(cityToDelete)) {
            region.remove(cityToDelete);
            System.out.println("City " + cityToDelete + " removed");
        } else {
            System.out.println("City " + cityToDelete + " not found");
        }
        System.out.println("City - region: " + region);
    }

}
