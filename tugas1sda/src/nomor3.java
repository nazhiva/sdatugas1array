//Soal no 3
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
//get(0), get(2), get(6), get(-3) --> untuk mengambil nilai/data dari string pada posisi yang
//sudah ditentukan 

import java.util.ArrayList;
public class nomor3 {
    public static void main(String[] args) {
    //String[] nama = {"I","T","R","I"};
    ArrayList<String> namaku = new ArrayList<String>();
    namaku.add("I"); // POSISI 0
    namaku.add("T"); // POSISI 1
    namaku.add("R"); // POSISI 2
    namaku.add("I"); // POSISI 3
   
    System.out.println(namaku.get(0)); // mengambil nilai pada posisi 0 maka hasilnya adalah I
    System.out.println(namaku.get(2)); // mengambil nilai pada posisi 2 maka hasilnya adalah R
    System.out.println(namaku.get(6)); // mengambil nilai pada posisi 6 maka hasilnya adalah ERROR karena char dalam string cuma ada 4
    System.out.println(namaku.get(-3)); // mengambil nilai pada posisi -3 maka hasilnya adalah ERROR karena tidak ada posisi -3
    }    
}
