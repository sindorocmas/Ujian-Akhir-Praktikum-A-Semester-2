package TugasPraktikum6;

public class Manager extends Pekerja{
    public int lamaKerja;
    public Manager(int jamKerja,int hariKerja,String NIP,String nama,String NIK,boolean jenisKelamin,boolean statusMenikah,int lamaKerja){
        super(jamKerja,hariKerja,NIP,nama,NIK,jenisKelamin,statusMenikah);
        this.lamaKerja=lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public String toString(){
        //menghitung pendapatan + tunjangan
        String kelamin;
        double tunjangan;

        //mendapatkan tunjangan dari jenis kelamin dan pernikahan
        if(getJenisKelamin()==true){
            kelamin="laki-laki";
        }else {
            kelamin="perempuan";
        }

        if(getStatusMenikah()==true){
            if (getJenisKelamin()==true){
                tunjangan=25;
            }else {
                tunjangan=20;
            }
        }else {
            tunjangan=15;
        }

        //menghitung gaji dari jam kerja
        int sisaHari = super.getHariKerja()%7;
        int banyakMinggu = 0;
        int banyakLibur = 0;
        int banyakKerja = 0;
        if (sisaHari==0){
            banyakMinggu = super.getHariKerja()/7;
            banyakLibur = 2*banyakMinggu;
            banyakKerja = super.getHariKerja()-banyakLibur;
        }else {
            banyakMinggu = (super.getHariKerja()-sisaHari)/7;
            if (sisaHari>=5){
                banyakLibur = (2*banyakMinggu)+(sisaHari-5);
                banyakKerja = super.getHariKerja()-banyakLibur;
            }else {
                banyakLibur = 2*banyakMinggu;
                banyakKerja = sisaHari + super.getHariKerja() -banyakLibur;
            }
        }

        //gaji normal
        double gajiNormal = super.getHariKerja() * super.getJamKerja() * 15;

        //gaji bonus lembur
        double gajiLembur = banyakKerja * (super.getJamKerja()-7) * 7;

        //gaji bonus libur
        double gajiLibur =  banyakLibur * super.getJamKerja() * 20;



        String kata =
                "nama          : " + getNama() +
                "\nNIK           : " + getNIK() +
                "\nKelamin       : " + kelamin +
                "\nPendapatan    : " + (((gajiLibur + gajiLembur)*1.3) + gajiNormal + (tunjangan+15)) + "$" +
                "\nBonus         : " + (gajiLembur+gajiLibur)*1.3 + "$" +
                "\nGaji          : " + gajiNormal + "$" +
                "\nStatus        : " + getStatus() +
                "\nLama Kerja    : " + lamaKerja + "\n";
        return kata;

    }
}
