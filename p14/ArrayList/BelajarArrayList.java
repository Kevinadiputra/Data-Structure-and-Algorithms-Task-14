import java.util.ArrayList;
import java.util.Collections;

public class BelajarArrayList {
	public static void main(String[] args) {
		// 1. Buat ArrayList dengan 8 warna
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("red");
        colorsList.add("green");
        colorsList.add("blue");
        colorsList.add("yellow");
        colorsList.add("orange");
        colorsList.add("purple");
        colorsList.add("pink"); 
        colorsList.add("chocolate");

        // Tampilkan isi ArrayList
        System.out.println("1. Isi ArrayList warnaList:");
        System.out.println(colorsList);

        // 2. Inputkan elemen baru pada posisi ke-2
        System.out.println("2. Inputkan elemen baru pada posisi ke-2");
        colorsList.add(1, "grey");

        // 3. Update elemen pada posisi ke-3
        System.out.println("3. Update elemen pada posisi ke-3");
        colorsList.set(2, "black");

        // 4. Lakukan pencarian apakah "green" tersimpan dalam ArrayList

        boolean istheregreen = colorsList.contains("hijau");
        System.out.println("4. Apakah warna hijau tersimpan dalam ArrayList? " + istheregreen);

        // 5. Urutkan elemen ArrayList sesuai abjad (terurut menurun)
        System.out.println("5. Urutkan elemen ArrayList sesuai abjad (terurut menurun)");
        Collections.sort(colorsList);

        // 6. Balik urutan elemen ArrayList
        System.out.println("6. Balik urutan elemen ArrayList");
        Collections.reverse(colorsList);

        // 7. Tukar isi ArrayList pada elemen pertama dengan elemen ke-3
        System.out.println("7. Tukar isi ArrayList pada elemen pertama dengan elemen ke-3");
        Collections.swap(colorsList, 0, 2);

        // Tampilkan hasil akhir ArrayList
        System.out.println("Hasil akhir ArrayList warnaList:");
        System.out.println(colorsList);
	}
}