package ExeptionHandling;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nama;
        //masukkan nama
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");

        try {
            nama = scn.nextLine();
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("\nSilahkan pilih karakter yang anda inginkan : ");
        System.out.println("1. Magician  \n" +
                "2. Healer \n" +
                "3. Warior");
        //masukkan pilihan kelas
        int kelas;
        kelas = scn.nextInt();
        if (kelas==1){
            Character tokoh = new Magician();
        }else if (kelas==2){
            Character tokoh = new Healer();
        }else if (kelas==3){
            Character tokoh = new Warrior();
        }
        System.out.println("Selamat Datang " + nama);

        Character magic = new Magician();
        magic.setName(nama);
        magic.info();
    }

}
