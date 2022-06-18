package Tugas7;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===Data Pegawai Tetap===");
        Pegawai pegawaiTetap1 = new PegawaiTetap("Joko","350728490327424892342",2000000);
        System.out.println(pegawaiTetap1.toString() + "\n");
        Pegawai pegawaiTetap2 = new PegawaiTetap("Ahmad","350728490327424892343",3000000);
        System.out.println(pegawaiTetap2.toString() + "\n");
        Pegawai pegawaiTetap3 = new PegawaiTetap("Budi","350728490327424892344",4000000);
        System.out.println(pegawaiTetap3.toString() + "\n");

        System.out.println("\n===Data Pegawai Harian===");
        Pegawai pegawaiHarian1 = new PegawaiHarian("Jokowi","350728490327424892345",9000,20);
        System.out.println(pegawaiHarian1.toString() + "\n");
        Pegawai pegawaiHarian2 = new PegawaiHarian("Biden","350728490327424892346",9500,21);
        System.out.println(pegawaiHarian2.toString() + "\n");
        Pegawai pegawaiHarian3 = new PegawaiHarian("Ahok","350728490327424892347",10000,22);
        System.out.println(pegawaiHarian3.toString() + "\n");

        System.out.println("\n===Data Sales===");
        Pegawai sales1 = new Sales("Gamal","350728490327424892348",51,55000);
        System.out.println(sales1.toString() + "\n");
        Pegawai sales2 = new Sales("Roni","350728490327424892349",52,60000);
        System.out.println(sales2.toString() + "\n");
        Pegawai sales3 = new Sales("Wijaya","350728490327424892350",53,65000);
        System.out.println(sales3.toString() + "\n");
    }
}
