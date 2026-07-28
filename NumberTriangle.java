public class NumberTriangle {
    public static void main(String[] args) {
        // Default number of rows; change this to print a bigger/smaller triangle
        int rows = 5;

        // If a command-line argument is provided, try to parse it as the number of rows
        if (args.length > 0) {
            try {
                int parsed = Integer.parseInt(args[0]);
                if (parsed > 0) rows = parsed;
            } catch (NumberFormatException ignored) {
                // leave rows as default if parsing fails
            }
        }

        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++);
                // print a single space between numbers but not after the last number in the row
                if (j < i) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
