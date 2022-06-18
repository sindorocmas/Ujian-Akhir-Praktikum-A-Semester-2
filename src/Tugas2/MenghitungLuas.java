package Tugas2;

import java.util.Scanner;

public class MenghitungLuas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s,r,t;
        int menu = in.nextInt();
        //memasukkan menu
        if(menu==1){
            //persegi
            s = in.nextDouble();
            Persegi persegi = new Persegi(s);
            persegi.getLuasPersegi();

        }else if(menu==2){
            //segitiga
            r = in.nextDouble();
            t = in.nextDouble();
            Segitiga segitiga = new Segitiga(r,t);
            segitiga.getLuasSegitiga();

        }else if(menu==3){
            //lingkaran
            r = in.nextDouble();

            Lingkaran lingkaran = new Lingkaran(r);
            lingkaran.getLuasLingkaran();
        }else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }

    }
}
class Persegi{
    double s;
    double luas;

    Persegi(double s){
        this.s=s;
    }

    public double setLuasPersegi(){
        this.luas=this.s*this.s;
        return luas;
    }

    public void getLuasPersegi(){
        System.out.printf("%.0f",Math.floor(setLuasPersegi()));
    }

}
class Segitiga{
    double r,t;
    double luasSegitiga;

    Segitiga(double r,double t){
        this.r = r;
        this.t = t;
    }
    public double setLuasSegitiga(){
        this.luasSegitiga=0.5*this.r*this.t;
        return luasSegitiga;
    }
    public void getLuasSegitiga(){
        System.out.printf("%.0f",Math.floor(setLuasSegitiga()));
    }

}
class  Lingkaran{
    double r;
    double luasLingkaran;

    Lingkaran(double r){
        this.r = r;
    }
    public double setLuasLingkaran(){
        if (r%7==0){
            luasLingkaran = 22/7*(r*r);
        }else {
            luasLingkaran = 3.14*(r*r);
        }
        return luasLingkaran;
    }
    public void getLuasLingkaran(){
        System.out.printf("%3.1f",Math.floor(setLuasLingkaran()));
    }
}
