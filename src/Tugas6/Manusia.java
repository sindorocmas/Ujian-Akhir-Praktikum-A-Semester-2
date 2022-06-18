package TugasPraktikum6;

public class Manusia {
    private String nama;
    private String NIK;

    //true = laki
    //false = perempuan
    private boolean jenisKelamin;
    private boolean statusMenikah;

    public Manusia(String nama,String NIK,boolean jenisKelamin,boolean statusMenikah){
        this.nama=nama;
        this.NIK=NIK;
        this.jenisKelamin=jenisKelamin;
        this.statusMenikah=statusMenikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getStatusMenikah() {
        return statusMenikah;
    }

    public void setStatusMenikah(boolean statusMenikah) {
        this.statusMenikah = statusMenikah;
    }

    public String toString(){
        String kelamin;
        int tunjangan;

        if(jenisKelamin==true){
            kelamin="laki-laki";
        }else {
            kelamin="perempuan";
        }

        if(statusMenikah==true){
            if (jenisKelamin==true){
                tunjangan=25;
            }else {
                tunjangan=20;
            }
        }else {
            tunjangan=15;
        }

        String kata =
                "nama          : " + nama +
                "\nNIK           : " + NIK +
                "\nKelamin       : " + kelamin +
                "\nPendapatan    : " + tunjangan + "$" + "\n";
        return kata;
    }
}
