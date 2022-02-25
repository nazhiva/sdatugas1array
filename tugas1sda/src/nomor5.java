 //Soal no 4
 //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
 //indexOf(a), indexOf(c), indexOf(q) -> berguna untuk mencari posisi dari char yang di minta

import java.util.ArrayList;
public class nomor5 {
    public static void main(String[] args) {
    //String[] nama = {"I","T","R","I"};
    ArrayList<String> namaku = new ArrayList<String>();
    namaku.add("I"); // POSISI 0
    namaku.add("T"); // POSISI 1
    namaku.add("R"); // POSISI 2
    namaku.add("I"); // POSISI 3   

    System.out.println("ArrayList sebelum remove:");
    for(String var: namaku){
         System.out.println(var);
    }

    //namaku.remove(0); // maka yang dibuang adalah char "I"    
    //namaku.remove(3); // maka yang dibuang adalah char "I"
    namaku.remove(2); // maka yang dibuang adalah char "R"

    System.out.println("ArrayList setelah remove:");
          for(String var2: namaku){
           System.out.println(var2);
            }
    }
}

