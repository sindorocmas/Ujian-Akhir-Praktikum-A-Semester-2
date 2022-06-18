package Tugas4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama          : Sindoro Chaidar Muzaki Asysyahid");
        System.out.println("NIM           : 215150700111003");
        DataMerchant.kataKata();
        int a = in.nextInt();
        DataMerchant.merc = DataMerchant.tambahMenchart(new Merchant("Bakso Pak Sahid","Bakso",8000,a));
        DataMerchant.kataKata();
        int b = in.nextInt();
        DataMerchant.merc = DataMerchant.tambahMenchart(new Merchant("Nasgor Mblebes","Nasi Goreng Jawa",10000,b));
        DataMerchant.kataKata();
        int c = in.nextInt();
        DataMerchant.merc = DataMerchant.tambahMenchart(new Merchant("Ayam Geprek Kak Ros","Ayam Kota Ekstra Nasi",10000,c));

        DataMerchant.tampilData();
    }
}
