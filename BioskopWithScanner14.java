import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner hikmal = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = hikmal.nextLine();
            System.out.print("Masukkan baris: ");
            baris = hikmal.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = hikmal.nextInt();
            hikmal.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = hikmal.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }   
}