import java.util.Arrays;
import java.util.Scanner;
public class Test {
    public static final int MAX_CARS = 3;
    public static void main(String[] args) {

        Car[] cars = new Car[MAX_CARS];
        Scanner scan = new Scanner(System.in);
        int i = 0;
        boolean isTheSame = false;

        while (i < MAX_CARS) {
            Car car = new Car();
            System.out.println("Podaj markę samochodu " + (i+1) + ":");
            car.setBrand(scan.nextLine());
            System.out.println("Podaj moc samochodu " + (i+1) + ":");
            car.setPower(scan.nextInt());
            scan.nextLine();

            if (i > 0) {
                for (Car c : cars) {
                    if (car.equals(c)) {
                        System.out.println("Taki samochód już istnieje w tablicy. Spróbuj jeszcze raz!");
                        isTheSame = true;
                        break;
                    }
                    isTheSame = false;
                }
                if (!isTheSame) {
                    cars[i] = car;
                    i++;
                }
            }
            if (i == 0) {
                cars[i] = car;
                i++;
            }
        }
        System.out.println("Twoja tablica:");
        System.out.println(Arrays.toString(cars));
        System.out.println("Wypełniłeś całą tablicę różnymi wartościami.");
    }
}
