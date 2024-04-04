import java.util.Scanner;

public class MaximumSumPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the size of array X: ");
        int m = scanner.nextInt();
        int[] X = new int[m];
        System.out.print("Enter the elements of array X (sorted): ");
        for (int i = 0; i < m; i++) {
            X[i] = scanner.nextInt();
        }
        
        
        System.out.print("Enter the size of array Y: ");
        int n = scanner.nextInt();
        int[] Y = new int[n];
        System.out.print("Enter the elements of array Y (sorted): ");
        for (int i = 0; i < n; i++) {
            Y[i] = scanner.nextInt();
        }

       
        int maxSum = findMaxSumPath(X, Y, m, n);

       
        System.out.println("The maximum sum is: " + maxSum);
    }

    public static int findMaxSumPath(int[] X, int[] Y, int m, int n) {
        int maxSum = 0;
        int sumX = 0, sumY = 0;
        int i = 0, j = 0;

        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } else { 
                maxSum += Math.max(sumX, sumY);
                maxSum += X[i]; 
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

       
        while (i < m) {
            sumX += X[i++];
        }
        while (j < n) {
            sumY += Y[j++];
        }

        
        maxSum += Math.max(sumX, sumY);

        return maxSum;
    }
}

