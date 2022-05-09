import com.company.Car;
import java.util.Arrays;

public class Lab4 {

    public static void main(String[] args) {
        Car[] obj = new Car[3];

        obj[0] = new Car("Toyota", "Camry", 4, 280, "Japan");
        obj[1] = new Car("Reno", "Megane", 4, 200, "France");
        obj[2] = new Car("Ford", "Mustang", 2, 480, "USA");

        Arrays.sort(obj, Car.aosComparator);
        System.out.println(Arrays.asList(obj) + "\n");

        Arrays.sort(obj, Car.maxspComparator);
        System.out.println(Arrays.asList(obj));
    }
}
R