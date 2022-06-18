package Tugas7;

public class Pegawai {
    private String nama;
    private String noKTP;

    Pegawai(String nama,String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String toString(){
        String kata =
                "Pegawai : " + nama + "\n" +
                "No.KTP : " + noKTP ;
        return kata;
    }

    public Double gaji(){
        double gaji = 0;
        return gaji;
    }
}
