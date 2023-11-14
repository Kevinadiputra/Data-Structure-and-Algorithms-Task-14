import java.util.PriorityQueue;
import java.util.Scanner;

public class ElementerbesarPriorityQuery {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan sejumlah bilangan bulat (tekan 0 untuk berhenti):");


        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }


            queue.add(input);
        }


        PriorityQueue<Integer> reversedQueue = new PriorityQueue<>(queue.size(), (a, b) -> Integer.compare(b, a));
        reversedQueue.addAll(queue);


        if (!reversedQueue.isEmpty()) {
            System.out.println("Elemen terbesar dari bilangan bulat yang dimasukkan adalah: " + reversedQueue.poll());
        } else {
            System.out.println("Tidak ada elemen yang dimasukkan.");
        }
    }
}
