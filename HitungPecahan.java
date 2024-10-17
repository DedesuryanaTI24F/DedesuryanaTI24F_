import java.util.Scanner;

public class HitungPecahan {
   public HitungPecahan() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Masukkan jumlah uang : ");
      int jumlahUang = sc.nextInt();

      int uang100000an = jumlahUang / 100000;
      jumlahUang %= 100000;
      System.out.println(uang100000an + "Lembar 100000");

      int uang50000an = jumlahUang / 50000;
      jumlahUang %= 50000;
      System.out.println(uang50000an + "Lembar 50000");

      int uang20000an = jumlahUang / 20000;
      jumlahUang %= 20000;
      System.out.println(uang20000an + "Lembar 20000");

      int uang10000an = jumlahUang / 10000;
      jumlahUang %= 10000;
      System.out.println(uang10000an + "Lembar 10000");

      int uang5000an = jumlahUang / 5000;
      jumlahUang %= 5000;
      System.out.println(uang5000an + "Lembar 5000");

      int uang2000an = jumlahUang / 2000;
      jumlahUang %= 2000;
      System.out.println(uang2000an + "Lembar 2000");

      int uang1000an = jumlahUang / 1000;
      jumlahUang %= 1000;
      System.out.println(uang1000an + "Lembar 1000");

      int uang200an = jumlahUang / 200;
      jumlahUang %= 200;
      System.out.println(uang200an + "keping 200");

      int uang100an = jumlahUang / 100;
      jumlahUang %= 100;
      System.out.println(uang100an + "keping 100");

      sc.close();
   }
}
