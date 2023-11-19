import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("===Calculator===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5) : ");
            int input = scanner.nextInt();

            if (input == 1){
                System.out.println("Anda memilih Akar Kuadrat");
                System.out.print("Masukkan angka: ");
                double angka = scanner.nextDouble();
                double akarKuadrat = Math.sqrt(angka);
                System.out.println("Hasil dari "+angka + " adalah " + akarKuadrat);
            } else if (input == 2) {
                System.out.println("Anda memilih Pangkat");
                System.out.print("Masukkan angka: ");
                double angka = scanner.nextDouble();
                double Pangkat = Math.pow(angka,2);
                System.out.println("Hasil dari "+angka + " adalah " + Pangkat);
            } else if (input == 3) {
                System.out.println("Anda memilih Logaritma");
                System.out.print("Masukkan angka: ");
                double angka = scanner.nextDouble();
                double logaritma = Math.log(angka);
                System.out.println("Hasil dari "+angka + " adalah " + logaritma);
            } else if (input == 4) {
                System.out.println("Anda memilih Faktorial");
                System.out.print("Masukkan angka: ");
                double angka = scanner.nextDouble();
                double faktorial = hitungFak(angka);
                System.out.println("Hasil dari "+angka + " adalah " + faktorial);
            }else {
                System.out.println("Terima kasih  telah menggunakan kalkulator ini.");
                break;
            }
        }
    }
    private static double hitungFak(double n){
        if(n == 0 || n == 1){
            return 1;
        }else {
            return n * hitungFak(n-1);
        }
    }
}