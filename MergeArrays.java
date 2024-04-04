import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     5
        System.out.print("Enter the size of array X: ");
        int m = scanner.nextInt();
        int[] X = new int[m];
        System.out.print("Enter the elements of array X (sorted with vacant cells represented by 0): ");
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

        
        mergeArrays(X, Y, m, n);

        
        System.out.print("Merged array X: ");
        for (int num : X) {
            System.out.print(num + " ");
        }
    }

    public static void mergeArrays(int[] X, int[] Y, int m, int n) {
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1; 

      
        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k--] = X[i--];
            } else {
                X[k--] = Y[j--];
            }
        }

        
        while (j >= 0) {
            X[k--] = Y[j--];
        }
    }
}