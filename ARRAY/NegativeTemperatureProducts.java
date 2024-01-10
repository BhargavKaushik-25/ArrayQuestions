import java.util.Scanner;

public class NegativeTemperatureProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        int numOfProducts = scanner.nextInt();      
        int[] temperatures = new int[numOfProducts];   
        for (int i = 0; i < numOfProducts; i++) {
            temperatures[i] = scanner.nextInt();
        }
        scanner.close();
        int countNegativeTemperatures = 0;
        for (int temperature : temperatures) {
            if (temperature < 0) {
                countNegativeTemperatures++;
            }
        }
        System.out.println(countNegativeTemperatures);
    }
}
