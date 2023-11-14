import java.util.LinkedList;

public class BelajarLinkedList {
	public static void main(String[] args) {
		// 1.) Buatlah LinkedList berisi 7 elemen bertipe integer pada LinkedList. Tampilkan isi LinkedList
		LinkedList<Integer> numbersList = new LinkedList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		numbersList.add(50);
		numbersList.add(60);
		numbersList.add(70);

		
		System.out.println("Isi LinkedList awal: ");
		for (Integer i : numbersList ) {
			System.out.println(i);
		}

		// 2.) Tambahkan Elemen baru pada awal dan akhir LinkedList(Masing-masing satu elemen)

		numbersList.addFirst(0);
		numbersList.addLast(80);

		System.out.println("\nIsi LinkedList setelah menambahkan elemen baru pada awal dan akhir: ");
		for (Integer i: numbersList ) {
			System.out.println(i);
		}

		// 3.) Tambahkan elemen baru pada posisi ke-3 LinkedList. Tampilkan isi LinkedList
		numbersList.add(2,90);

		System.out.println("\nIsi LinkedList setelah menambahkan elemen baru pada posisi ke-3: ");
		for (Integer i : numbersList ) {
			System.out.println(i);
		}

		// 4.) Tukar isi elemen LinkedList pada posisi 2 dengan posisi 3!!!
		int temp = numbersList.get(1);
		numbersList.set(1, numbersList.get(2));
		numbersList.set(2, temp);

		System.out.println("\nIsi LinkedList setelah menukar isi elemen pada posisi ke-2 dan ke-3  ");
		for (Integer i: numbersList ) {
			System.out.println(i);
		}

		// 5.) Buat LinkedList Baru, tambahkan 3 elemen bertipe Integer pada LinkedList baru tersebut.
		// gabungkan linkedlist yang telah dimanipulasi sebelumnya dengan linkedlist yang baru kita buat. Tampilkan hasil penggabungan
		LinkedList<Integer> numbersList2 = new LinkedList<>();
		numbersList2.add(110);
		numbersList2.add(120);
		numbersList2.add(130);

		numbersList.addAll(numbersList2);

		System.out.println("\nIsi linkedlist hasil penggabungan :");
		for (Integer i : numbersList ) {
			System.out.println(i);
		}

		// 6.) Buatlah cloning dari linkedlist yang terakhir(linkedlist hasil penggabungan)
		LinkedList<Integer> cloning = new LinkedList<>(numbersList);

		// 7.) Salin isi elemen terakhir lnkedlist ke sebuah variabel kemudian tampilkan isi variabel dan isi linkedlist
		int lastElement = numbersList.getLast();
		System.out.println("\nIsi elemen terakhir linked list: " + lastElement );
		System.out.println("Isi linked list: ");
		for (Integer i: numbersList ) {
			System.out.println(i);
		}
	}
}