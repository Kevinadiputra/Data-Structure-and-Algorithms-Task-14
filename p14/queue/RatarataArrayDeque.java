import java.util.ArrayDeque;
import java.util.Scanner;

public class RatarataArrayDeque {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan sejumlah bilangan bulat (inputkan angka " + 0 + " dan tekan enter untuk berhenti)");

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            queue.addLast(input);
        }

        
        double rataRata = 0;
        for (int nilai : queue) {
            rataRata += nilai;
        }

        int jumlah = queue.size();
        
        if (jumlah > 0) {
            rataRata /= jumlah;
            System.out.println("Rata-rata nilai dari bilangan bulat yang dimasukkan adalah: " + rataRata);
        } else {
            System.out.println("Tidak ada elemen yang dimasukkan.");
        }
    }
}
