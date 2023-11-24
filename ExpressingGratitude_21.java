import java.util.Scanner;

public class ExpressingGratitude_21 {
    private static Scanner input = new Scanner(System.in);

    public static String getGreetingRecipient() {
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world.");
        System.out.println("You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        // String name = getGreetingRecipient();
        sayThankyou();

        String addgreeting = "Wish you all the best for your future!";
        sayAdditionalGreetings(addgreeting);

        // Close the Scanner when you're done using it
        input.close();
    }
}