import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        // Linear Search Test
        String searchName = "Mobile";
        Product result = SearchUtil.linearSearch(products, searchName);
        System.out.println("Linear Search Result for '" + searchName + "': " + (result != null ? result : "Not Found"));

        // Sort products by name for Binary Search
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        // Binary Search Test
        result = SearchUtil.binarySearch(products, searchName);
        System.out.println("Binary Search Result for '" + searchName + "': " + (result != null ? result : "Not Found"));
    }
}