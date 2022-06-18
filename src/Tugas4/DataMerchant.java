package Tugas4;
import java.util.Scanner;

public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];

    public static Merchant[] tambahMenchart(Merchant merchant){
        Merchant merchant2[]=new Merchant[merc.length+1];
        int i;
        for (i=0;i<merc.length;i++){
            merchant2[i]=merc[i];
        }
        merchant2[i]=merchant;
        return merchant2;
    }


    public static void tampilData(){
        for (Merchant mch1:merc){
            System.out.println("====Tampilan Data Merchant UBFOOD====");
            System.out.println("Nama Merchant : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk   : "+mch1.getNamaProduk());
            System.out.println("Harga         : "+mch1.getHargaMakanan());
            System.out.println("Jumlah Makanan: "+mch1.getJumlahMakanan());
        }
    }

    public static Merchant cariMerchant(String nama){
        for (Merchant merchant : merc){
            if (merchant.getNamaMerchant().equals(nama)){
                return merchant;
            }
        }
        return null;
    }

    public static void tampilMerchant(Merchant merchant){
        Merchant merchant1 = cariMerchant(merchant.getNamaMerchant());
        if (merchant1!=null){
            System.out.println("====Tampilan Data Merchant UBFOOD");
            System.out.println("Nama Merchart : "+merchant1.getNamaMerchant());
            System.out.println("Nama Produk   : "+merchant1.getNamaProduk());
            System.out.println("Harga         : "+merchant1.getHargaMakanan());
            System.out.println("Jumlah Makanan: "+merchant1.getJumlahMakanan());
        }else {
            System.out.println("Data Merchant tidak ditemukan");
        }
    }

    public static void updateMerchat(Merchant merchant){
        Merchant merchant1 = cariMerchant(merchant.getNamaMerchant());
        if (merchant1!=null){
            merchant1.setNamaMerchant(merchant.getNamaMerchant());
            merchant1.setNamaProduk(merchant.getNamaProduk());
            merchant1.setHargaMakanan(merchant.getHargaMakanan());
            merchant1.setJumlahMakanan(merchant.getJumlahMakanan());
        }else {
            System.out.println("Data Merchant tidak ditemukan");
        }
    }
    public static void kataKata(){
        System.out.println("masukkan berapa jumlah makanan :");
    }
}