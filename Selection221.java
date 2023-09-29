import java.util.Scanner;

public class Selection221 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        System.out.print("Nilai uas    : ");
        float finalExam = input21.nextFloat();
        System.out.print("Nilai uts    : ");
        float midExam = input21.nextFloat();
        System.out.print("Nilai kuis   : ");
        float quiz = input21.nextFloat();
        System.out.print("Nilai tugas  : ");
        float assignment = input21.nextFloat();

        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);

        String message = total < 65 ? "Retake" : "Pass";

        System.out.println("Final grade = " + total + " and the decission " + message);

        String predikat = "";
        if(total > 80 && total < 100){
            predikat = "A";
        }else if(total > 73 && total < 80){
            predikat = "B+";
        }else if(total > 65 && total < 73){
            predikat = "B";
        }else if(total > 60 && total < 65){
            predikat = "C+";
        }else if(total > 50 && total < 60){
            predikat = "C";
        }else if(total > 39 && total < 50){
            predikat = "D";
        }else {
            predikat = "E";
        }
        System.out.println("Predikat Nilai Anda : "+predikat);
        
        }
    }


