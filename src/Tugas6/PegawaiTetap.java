package Tugas7;

public class PegawaiTetap extends Pegawai{
    double upah;

    PegawaiTetap(String nama,String noKTP,double upah){
        super(nama,noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah){
        this.upah=upah;
    }

    double getUpah(){
        return upah;
    }

    public String toString(){
        String kata =
                "Pegawai Tetap : " + super.getNama() + "\n" +
                "No.KTP : " + super.getNoKTP() + "\n" +
                "Upah : Rp " + getUpah() + "\n" +
                "Pendapatan : Rp " + getUpah();
        return kata;
    }



}

