package Tugas7;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    Sales(String nama,String noKTP,int penjualan,double komisi){
        super(nama,noKTP);
        this.penjualan=penjualan;
        this.komisi=komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public Double gaji(){
        double upah ;
        upah = getPenjualan()*getKomisi();
        return upah;
    }

    public String toString(){
        String kata =
                "Sales = " + super.getNama() + "\n" +
                "No.KTP = " + super.getNoKTP() + "\n" +
                "Total Penjualan = " + getPenjualan() + "\n" +
                "Besar Komisi = Rp " + getKomisi() + "\n" +
                "Pendapatan = Rp " + gaji();
        return kata;
    }
}
