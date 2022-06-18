package Tugas3;

import java.util.Scanner;

public class Erigo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        Baju b = new Baju();
        System.out.print("baju yang anda beli bertipe : ");
        b.jenis = sc.next();
        System.out.print("Jumlah baju yang anda beli adalah : ");
        b.jumlah = sc.nextInt();
        b.display();

    }
}
class Baju{
    String jenis;
    double harga;
    int jumlah;
    Baju(){

    }
    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    void hargaA(){
        if(jumlah>100){
            harga = 95000;
        }else {
            harga = 100000;
        }
    }
    void hargaB(){
        if (jumlah>100){
            harga = 120000;
        }else{
            harga = 125000;
        }
    }
    void hargaC(){
        if (jumlah>100){
            harga = 160000;
        }else{
            harga = 175000;
        }
    }

    void display(){
        if (jenis.equalsIgnoreCase("a")){
            hargaA();
        }else if (jenis.equalsIgnoreCase("b")){
            hargaB();
        }else if (jenis.equalsIgnoreCase("c")){
            hargaC();
        }
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.printf("Harga per buah       : %1.0f \n", harga);
        System.out.printf("Total semua          : %1.0f", harga*jumlah);
    }
}

}
