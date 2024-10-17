import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[] args) {
       int num;
       String jenis;
       
       Scanner input = new Scanner(System.in);

       System.out.print("Masukkan angka: ");
       num = input.nextInt();

       if (num % 2 == 0) {
         jenis = "genap";
       }else {
         jenis = "ganjil";
       }
       
       System.out.println("adalah termasuk bilangan" + jenis);
       input.close();
    }
}
