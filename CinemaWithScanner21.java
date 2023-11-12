import java.util.Scanner;

public class CinemaWithScanner21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        int row, column;
        String name, next;
        int menuChoice;

        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu Options: ");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            menuChoice = input21.nextInt();
            input21.nextLine();

            switch (menuChoice) {
                case 1:
                    System.out.println("Enter a name: ");
                    name = input21.nextLine();
                    System.out.println("Enter a row number: ");
                    row = input21.nextInt();
                    System.out.println("Enter a column number: ");
                    column = input21.nextInt();
                    input21.nextLine();

                    // Check if the row and column numbers are within the valid range
                    if (row >= 0 && row < audience.length && column >= 0 && column < audience[0].length) {
                        // Assign the name to the specified seat
                        audience[row][column] = name;
                        System.out.println("Data input successfull !");
                    } else {
                        System.out.println("Invalid row or column number. Please try again.");
                    }
                    break;
                case 2:
                    // Show the audience list
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[0].length; j++) {
                            System.out.print(audience[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // Exit the programs
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}