import java.util.Scanner;
public class TugasNo1 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.println("Masukkan banyaknya orang: ");
        int banyak = input21.nextInt();
        int[]nilaiAkhir = new int[banyak];
        int max = nilaiAkhir[0];
        int min = Integer.MAX_VALUE;
        double total = 0;
        double bagi;

    for(int i = 0;i<banyak;i++) {
        System.out.println("Masukkan nilai orang ke "+(i+1)+ " : ");
        nilaiAkhir[i] = input21.nextInt();

            if(nilaiAkhir[i] > max){
            max = nilaiAkhir[i];
        }
            if(nilaiAkhir[i] < min){
            min = nilaiAkhir[i];
        }
        total += nilaiAkhir[i];
    }
    bagi = total/banyak;
        
        System.out.println("Nilai terbesar adalah "+max);
        System.out.println("Nilai terkecil adalah "+min);
        System.out.println("Rata-rata nilai adalah"+bagi);   
    }
}
