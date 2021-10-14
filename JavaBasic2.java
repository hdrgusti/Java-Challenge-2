import java.util.Scanner;

public class JavaBasic2 {
    public static void main(String[] args) {
        int nilai;

        Scanner Skor = new Scanner(System.in);
        System.out.println("Masukkan Skor Anda: ");
        nilai = Skor.nextInt ();

        if(nilai>=100) {
            System.out.println("Nilai Salah");
        } else if(nilai>=91){
            System.out.println("Nilai Anda: A");
        } else if(nilai>=76){
            System.out.println("Nilai Anda: B");
        } else if(nilai>=51){
            System.out.println("Nilai Anda: C");
        } else if(nilai>=26){
            System.out.println("Nilai Anda: D");
        } else if(nilai>-0){
            System.out.println("Nilai Anda: E");
        } else {
            System.out.println("Anda Gagal");
        }
        System.out.println("SELESAI");
    }

}