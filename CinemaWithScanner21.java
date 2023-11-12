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

                    audience[row - 1][column - 1] = name;
                    break;
                case 2:
                    System.out.println("Audience List: ");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            System.out.print(audience[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}