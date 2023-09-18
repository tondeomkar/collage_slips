/*Write a java Program to display following pattern:
1
0 1
0 1 0
1 0 1 0
*/

public class PatternDisplay {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) {
            int value = i % 2; // Start with 1 for odd rows, 0 for even rows

            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value = 1 - value; // Toggle between 0 and 1
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
