import java.util.Scanner;
public class HargaJeruk {

public static void main(String[] args) {
    int jumlahjeruk, satubuah3000, duabuah5000, limabuah10000;
    Scanner sc = new Scanner (System.in);
    System.out.println("Masukkan jumlah jeruk yang dibeli");
    jumlahjeruk = sc.nextInt();

    satubuah3000 = jumlahjeruk / 3000;
    jumlahjeruk = jumlahjeruk % 3000;
    System.out.println(satubuah3000 + "3000");

    duabuah5000 = jumlahjeruk / 5000;
    jumlahjeruk = jumlahjeruk % 5000;
    System.out.println(duabuah5000 + "5000");
    
    limabuah10000 = jumlahjeruk / 10000;
    System.out.println(limabuah10000 + "10000");
    System.out.println("Jeruk yang tersisa: " + jumlahjeruk);
    sc.close();

}
}