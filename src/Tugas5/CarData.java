package TugasPemlan5;

import java.util.ArrayList;

public class CarData {
    private ArrayList<Car> Carlist = new ArrayList<Car>();

    public void addCar(String carType,String polNum,String merk){
        Car car = new Car(carType,polNum,merk,true);
        Carlist.add(car);
    }

    public void listOfCar(){
        System.out.println("DAFTAR MOBIL");
        System.out.println("==============================");
        for(int i = 0;i<Carlist.size();i++){
            Car car = Carlist.get(i);
            System.out.println("TIPE MOBIL : " + car.getCarType());
            System.out.println("No Polisi : " + car.getPolNum());
            System.out.println("MERK MOBIL : " + car.getMerk());
            System.out.println("-------------------------------");
        }

    }

    public ArrayList<Car> getArrayList(){
        return Carlist;
    }
}
