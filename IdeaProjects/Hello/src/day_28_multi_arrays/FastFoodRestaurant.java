package day_28_multi_arrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurant {
    public static void main(String[] args) throws IOException {
        // read all data and assign to String array
        String[] data = Files.readAllLines(Paths.get("FastFoodRestaurant.csv")).toArray(new String[0]);

        System.out.println("Data size "+data.length);
    }
}
