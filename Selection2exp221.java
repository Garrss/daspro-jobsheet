import java.util.Scanner;
public class Selection2exp221 {
    public static void main(String[] args) {
        int Angle1,Angle2,Angle3 =0;
        int TotalAngle;
        Scanner input21 = new Scanner(System.in);
        System.out.println("Enter the first angle");
        Angle1 = input21.nextInt();
        System.out.println("Enter the second angle");
        Angle2 = input21.nextInt();
        System.out.println("Enter the third angle");
        Angle3 = input21.nextInt();

        TotalAngle = Angle1 + Angle2 + Angle3;

        //if(TotalAngle == 180)
            if(Angle1==90 || Angle2==90 || Angle3==90)
                System.out.println("Right triangle");
            if(Angle1 == Angle2 && Angle2 == Angle3){
                System.out.println("Right this is an equilateral triangle");
            }else if(Angle1 == Angle2 || Angle2 == Angle3 || Angle1 == Angle3){
                System.out.println("This is an isosceles triangle");
            }else
                System.out.println("Not a right triangle");
        //else
            //System.out.println("Not a triangle");
    }
    
}
