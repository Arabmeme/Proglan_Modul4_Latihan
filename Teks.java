import java.util.Scanner;

public class Teks {
    private static String teks = "";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");

            System.out.print("Pilih operasi (1/2/3/4/5) : ");
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    input(scanner);
                    break;
                case 2:
                    jumlahKarakter();
                    break;
                case 3:
                    jumlahKata();
                    break;
                case 4:
                    cariKata(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
        }
    }
    private static void input(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        teks = scanner.nextLine();
        System.out.println("Teks berhasil dimasukkan.");
    }

    private static void jumlahKarakter() {
        int characterCount = teks.length();
        System.out.println("Jumlah karakter dalam teks: " + characterCount);
    }

    private static void jumlahKata() {
        String[] words = teks.split("\\s+");
        int wordCount = words.length;
        System.out.println("Jumlah kata dalam teks: " + wordCount);
    }

    private static void cariKata(Scanner scanner) {
        System.out.print("Masukkan kata yang ingin dicari: ");
        String searchWord = scanner.nextLine();

        if (teks.toLowerCase().contains(searchWord.toLowerCase())) {
            System.out.println("Kata \"" + searchWord + "\" ditemukan dalam teks.");
        } else {
            System.out.println("Kata \"" + searchWord + "\" tidak ditemukan dalam teks.");
        }
    }
}
