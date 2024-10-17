import java.util.Scanner;

public class Nilai {
   public Nilai() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Masukan Nilai :");
      int angka = sc.nextInt();
      String Nilai;
      if (angka >= 85) {
         Nilai = "A";
      } else if (angka >= 75) {
         Nilai = "B";
      } else if (angka >= 65) {
         Nilai = "C";
      } else if (angka >= 55) {
         Nilai = "D";
      } else {
         Nilai = "E";
      }

      System.out.println("Grade = " + Nilai);
      sc.close();
   }
}
