

public class heartpattern {
    public static void main(String[] args) {
        // Size of the heart (adjust as needed)
        int n = 6; 

        // Upper part of the heart
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                // Condition for the two semi-circles of the top
                if ((i == 0 && j % 3 != 0 && j < 2 * n - 2) || 
                    (i == 1 && j % 3 == 0) || 
                    (i - j == (n / 2) - 1) || 
                    (i + j == (3 * n / 2) - 1) ||
                    (j - i == (3 * n / 2) + 1) || 
                    (i + j == (7 * n / 2) + 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        
        // Lower part (triangle) of the heart - This part is a simplified representation
        // For a more complete lower part, a different loop logic is often used.
        // The following part is a basic approach:
        for (int i = 0; i < n; i++) {
        
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars for the inverted triangle
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

