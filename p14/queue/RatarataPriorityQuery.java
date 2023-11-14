import java.util.PriorityQueue;
import java.util.Scanner;

public class RatarataPriorityQuery {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan sejumlah bilangan bulat (inputkan angka " + 0 + " dan tekan enter untuk berhenti): ");

		while (true) {
			int input = scanner.nextInt();

			if (input == 0) {
				break;
			}

			queue.add(input);
		}

		int jumlah = queue.size();

		double rataRata = 0;
		for (Integer i : queue) {
			rataRata += i;
		}
		rataRata /=jumlah;

		System.out.println("Rata-rata nilai dari bilangan bulat yang dimasukkan adalah: " + rataRata);
	}
}