package TugasPemlan5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama : Sindoro Chaidar Muzaki Asysyahid");
        System.out.println("NIM : 215150700111003");
        System.out.println("=======================================");

        CarRider jokowi = new CarRider("Jokowi Uzumaki",19,"08000000000");
        CarRider ahmad = new CarRider("Ahmad Senju",20,"0811111111");
        CarRider sasuke = new CarRider("Uchiha Sasuke",31,"08121212121");
        CarRider sakura = new CarRider("Sakura Hinata",17,"08999999999");

        CarData data = new CarData();
        data.addCar("SUV","N 1111 B","HONDA");
        data.addCar("SPORT","N 2222 AB","SSC Tuantara");
        data.addCar("TRUCK","N 3333 AB","Suzuki");
        data.addCar("BAK","N 2131 AB","MITSUBISHI");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(jokowi,data.getArrayList().get(1),9);
        arsip.Rent(ahmad,data.getArrayList().get(0),3);
        arsip.Rent(sasuke,data.getArrayList().get(1),1);
        arsip.Rent(sakura,data.getArrayList().get(2),2);

        System.out.println("");
        arsip.info();

    }
}
