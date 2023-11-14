import java.util.ArrayDeque;
import java.util.Scanner;

public class ElementerbesarArrayDeque {
	public static void main(String[] args) {
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan sejumlah bilangan bulat (inputkan angka " + 0 + " dan tekan enter untuk berhenti)");

		while (true) {
			int input = scanner.nextInt();

			if (input == 0) {
				break;
			}

			queue.add(input);
		}

		int elemenTerbesar = queue.peekLast();
		for (Integer i : queue ) {
			if (i > elemenTerbesar) {
				elemenTerbesar = i;
			}
		}

		System.out.println("Elemen terbesar dari bilangan bulat yang dimasukkan adalah: "+ elemenTerbesar);
	}
}