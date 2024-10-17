import java.util.Scanner;

public class Lulus {
    public static void main(String[] args) {
        int Nilai = 0;
        String Kategori = " ";

        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai: ");
        Nilai = sc.nextInt();

        if (Nilai >= 75) {
            Kategori = "Lulus";
        }else if (Nilai < 75) {
            Kategori = "Tidak Lulus";
        }
        
        System.out.println(Nilai + " itu termasuk kedalam Kategori :"+ Kategori);
        sc.close();
    }
}
