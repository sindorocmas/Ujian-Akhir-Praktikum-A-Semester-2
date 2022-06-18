package TugasPraktikum6;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(int jamKerja,int hariKerja,String NIP,String nama,String NIK,boolean jenisKelamin,boolean statusMenikah){
        super(nama,NIK,jenisKelamin,statusMenikah);
        this.jamKerja=jamKerja;
        this.hariKerja=hariKerja;
        this.NIP=NIP;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    //belum membuat getStatus(),membuat toString()

    public String getStatus(){
        //membuat kantor cabang dari NIP
        char NIPawal = NIP.charAt(0);
        int NIPawal2 = Integer.parseInt(String.valueOf(NIPawal));
        String cabang = "";
        //untuk menunjukaan kantor cabang
        switch (NIPawal2){
            case 1:
                cabang = "Mondstandt";
                break;
            case 2:
                cabang = "Liyue";
                break;
            case 3:
                cabang = "Inazuma";
                break;
            case 4:
                cabang = "Sumeru";
                break;
            case 5:
                cabang = "Fontaine";
                break;
            case 6:
                cabang = "Natlan";
                break;
            case 7:
                cabang = "Snezhnaya";
                break;
        }

        //untuk menunjukakkan kantor cabang ke berapa
        char cabangKe = NIP.charAt(2);
        int cabangKe2 = Integer.parseInt(String.valueOf(cabangKe));

        //untuk menunjukkan departemen
        char departemen = NIP.charAt(6);
        int departemen2 = Integer.parseInt(String.valueOf(departemen));
        String dptrmn = "";
        switch (departemen2){
            case 1:
                dptrmn = "Pemasaran";
                break;
            case 2:
                dptrmn = "Humas";
                break;
            case 3:
                dptrmn = "Riset";
                break;
            case 4:
                dptrmn = "Teknologi";
                break;
            case 5:
                dptrmn = "Personalia";
                break;
            case 6:
                dptrmn = "Akademik";
                break;
            case 7:
                dptrmn = "Administrasi";
                break;
            case 8:
                dptrmn = "Operasional";
                break;
            case 9:
                dptrmn = "Pembangunan";
                break;
        }
        String status = dptrmn + "," + cabang + " cabang ke-" + cabangKe2;
        return status;
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
        int sisaHari = hariKerja%7;
        int banyakMinggu = 0;
        int banyakLibur = 0;
        int banyakKerja = 0;
        if (sisaHari==0){
            banyakMinggu = hariKerja/7;
            banyakLibur = 2*banyakMinggu;
            banyakKerja = hariKerja-banyakLibur;
        }else {
            banyakMinggu = (hariKerja-sisaHari)/7;
            if (sisaHari>=5){
                banyakLibur = (2*banyakMinggu)+(sisaHari-5);
                banyakKerja = hariKerja-banyakLibur;
            }else {
                banyakLibur = 2*banyakMinggu;
                banyakKerja = sisaHari + hariKerja -banyakLibur;
            }
        }

        //gaji normal
        double gajiNormal = hariKerja * jamKerja * 15;

        //gaji bonus lembur
        double gajiLembur = banyakKerja * (jamKerja-7) * 7;

        //gaji bonus libur
        double gajiLibur =  banyakLibur * jamKerja * 20;



        String kata =
                "nama          : " + getNama() +
                "\nNIK           : " + getNIK() +
                "\nKelamin       : " + kelamin +
                "\nPendapatan    : " + (gajiLibur + gajiLembur + gajiNormal + tunjangan) + "$" +
                "\nBonus         : " + (gajiLembur+gajiLibur) + "$" +
                "\nGaji          : " + gajiNormal + "$" +
                "\nStatus        : " + getStatus() + "\n";
        return kata;

    }

}
