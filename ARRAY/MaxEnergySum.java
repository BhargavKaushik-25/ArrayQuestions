import java.util.Scanner;

public class MaxEnergySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfChem = scanner.nextInt();
        int[] energies = new int[numOfChem];
        for (int i = 0; i < numOfChem; i++) {
            energies[i] = scanner.nextInt();
        }

        int result = findMaxEnergySum(energies);
        System.out.println(result);

        scanner.close();
    }

    public static int findMaxEnergySum(int[] energies) {
        int maxEnergySum = Integer.MIN_VALUE;
        // int maxEnergySum = energies[0]+energies[1];
        int preProduct = energies[0]*energies[1];

        for (int i = 0; i < energies.length; i++) {
            // int preProduct = energies[0]*energies[1];
            // int minSum = 
            for (int j = i + 1; j < energies.length; j++) {
                // int preProduct = energies[0]*energies[1]
                int energySum = energies[i] + energies[j];
                int energyProduct = energies[i] * energies[j];
                
                if (energyProduct > energySum) {
                    maxEnergySum = energyProduct;
                }
            }
        }
        
        return maxEnergySum;
    }
}