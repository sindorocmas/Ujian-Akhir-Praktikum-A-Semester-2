package Tugas4;

public class Merchant {
    private String namaMerchant;
    private String namaProduk;
    private int hargaMakanan;
    private int jumlahMakanan;



    Merchant(String namaMerchant, String namaProduk, int hargaMakanan, int jumlahMakanan){
        this.namaMerchant =namaMerchant;
        this.namaProduk=namaProduk;
        this.hargaMakanan=hargaMakanan;
        this.jumlahMakanan=jumlahMakanan;
    }

    public String getNamaMerchant(){
        return namaMerchant;
    }

    public void setNamaMerchant(String namaMerchant){
        this.namaMerchant = namaMerchant;
    }

    public  String getNamaProduk(){
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk){
        this.namaProduk=namaProduk;
    }

    public int getHargaMakanan(){
        return hargaMakanan;
    }

    public void setHargaMakanan(int hargaMakanan){
        this.hargaMakanan=hargaMakanan;
    }

    public int getJumlahMakanan(){
        return jumlahMakanan;
    }

    public void setJumlahMakanan(int jumlahMakanan) {
        this.jumlahMakanan = jumlahMakanan;
    }
}
