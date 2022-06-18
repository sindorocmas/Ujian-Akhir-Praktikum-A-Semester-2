package TugasPemlan5;

import java.util.ArrayList;

public class RentArchive {
    ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    public void Rent(CarRider rider,Car car,int rentDur){
        if (car.isStatus() == false){
            System.out.println("Maaf,mobil sudah disewa");
        }else {
            car.setStatus(false);
            CarRent carRent = new CarRent(rider,car,rentDur);
            rentData.add(carRent);
            System.out.println("Mobil berhasil di sewa");
        }
    }

    public void info(){
        for (int i = 0;i<rentData.size();i++){
            CarRent carRent = rentData.get(i);
            System.out.println("Nama peminjam : " + carRent.getRider().getName());
            System.out.println("TIPE MOBIL : " + carRent.getCar().getCarType());
            System.out.println("NO POLISI : " + carRent.getCar().getPolNum());
            System.out.println("LAMA RENTAL : " + carRent.getRentDur());
            System.out.println("---------------------------------------\n");
        }
    }
}
