import java.util.Scanner;
public class Selection2exp321 {
    public static void main(String[] args) {
        String category;
        int income, netsalary;
        double tax = 0;

        Scanner input21 = new Scanner(System.in);
        
        System.out.print("input category = ");
        category = input21.nextLine();
        System.out.print("Input income = ");
        income = input21.nextInt();

        if(category.equals("worker")){
            if(income <= 2000000) {
                tax = 0.1;
            }else if(income <= 3000000) {
                tax = 0.15; 
            }else
                tax = 0.2;
            netsalary = (int) (income - (tax*income));
            System.out.println("Nett salary = "+netsalary);
        }else if(category.equals("businessman")){
            if(income <= 2500000) {
                tax = 0.15;
            }else if(income <= 3500000) {
                tax = 0.2;
            }else
                tax = 0.25;
            netsalary = (int) (income - (tax*income));
            System.out.println("Nett salary = " +netsalary);
        }else
            System.out.println("Invalid category!");


    }
    
}
