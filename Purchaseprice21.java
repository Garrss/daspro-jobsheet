import java.util.Scanner;

public class Purchaseprice21 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int price, quantity;
        double discount=0.1, totalprice, purchasePrice, totalDiscount;

        System.out.println("Input price: ");
        price=input.nextInt();
        System.out.println("Input quantity: ");
        quantity=input.nextInt();

        totalprice=price*quantity;

        totalDiscount=totalprice*discount;

        purchasePrice=totalprice-totalDiscount;

        System.out.println("Total discount: "+totalDiscount);
        System.out.println("Final purchase price: "+purchasePrice);;
    }
    
}
