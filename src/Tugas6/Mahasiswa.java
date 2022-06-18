package TugasPraktikum6;

public class Mahasiswa extends Manusia{
    private String NIM;
    private double IPK;

    public Mahasiswa(String nama,String NIK,boolean jenisKelamin,boolean statusMenikah,String NIM,double IPK){
        super(nama,NIK,jenisKelamin,statusMenikah);
        this.NIM=NIM;
        this.IPK=IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    //belum membuat getStatus(),getBeasiswa(),dan toString()

    public String getStatus(){

        //ini masih bermasalah tidak bisa keluarkan
        String NIM1 = NIM.substring(0,2);
        String angkatan = "20"+NIM1;

        String prodi = "";
        char NIM7 = NIM.charAt(6);

        int nim7 = Integer.parseInt(String.valueOf(NIM7));

        switch (nim7){
            case 2:
                prodi= "Teknik Meniup Gelembung";
                break;
            case 3:
                prodi= "Teknik Berburu Ubur Ubur";
                break;
            case 4:
                prodi= "Sistem Perhamburgeran";
                break;
            case 6:
                prodi= "Pendidikan Chum Bucket";
                break;
            case 7:
                prodi= "Teknologi Telepon Kerang";
                break;
        }
        String status = prodi + "," +angkatan;

        return status;
    }

    public double getBeasiswa(){
        double beasiswa = 0;
        if(4>=IPK && IPK>=3.5){
            beasiswa = 75;
        }else if (3.5<=IPK && IPK>=3.0){
            beasiswa = 50;
        }
        return beasiswa;
    }


    public String toString(){
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

        //


        String kata =
                "nama          : " + getNama() +
                "\nNIK           : " + getNIK() +
                "\nKelamin       : " + kelamin +
                "\nPendapatan    : " + (getBeasiswa() + tunjangan) + "$" +
                "\nIPK           : " + IPK +
                "\nNIM           : " + NIM +
                "\nStatus        : " + getStatus() + "\n";
        return kata;
    }
}
