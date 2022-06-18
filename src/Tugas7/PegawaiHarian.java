package Tugas7;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    PegawaiHarian(String nama,String noKTP,double upahPerJam,int totalJam){
        super(nama, noKTP);
        this.upahPerJam=upahPerJam;
        this.totalJam=totalJam;
    }

    public double getUpahPerJam(){
        return upahPerJam;
    }
    
    public int getTotalJam(){
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam){
        this.upahPerJam=upahPerJam;
    }

    public void setTotalJam(int totalJam){
        this.totalJam=totalJam;
    }

    public String toString(){
        String kata =
                "Pegawai Harian : " + super.getNama() + "\n" +
                "No.KTP : " + super.getNoKTP() + "\n" +
                "Upah/Jam : Rp " + getUpahPerJam() + "\n" +
                "Total Jam Kerja : " + getTotalJam() + "\n" +
                "Pendapatan : Rp " + gaji();

        return kata;
    }
    public Double gaji(){
        double totalGaji;
        if (getTotalJam()<=40){
            totalGaji = getTotalJam() * getUpahPerJam();
        }else {
            totalGaji = (40*getUpahPerJam())+(((getTotalJam()-40)*getUpahPerJam())*1.5);
        }
        return totalGaji;
    }
}
