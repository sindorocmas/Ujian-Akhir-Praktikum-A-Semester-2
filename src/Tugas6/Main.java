package TugasPraktikum6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama:Sindoro Chaidar M.A");
        System.out.println("NIM:215150700111003");
        System.out.println("Contoh Output");
//        Manusia man1 = new Manusia("Aku", "3923842934", true,true);
//        System.out.println(man1.toString());
//        Mahasiswa mhs1 = new Mahasiswa("I Putu Yoga", "351923848239", false, false, "205150601111018",3.70);
//        System.out.println(mhs1.toString());
//        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true);
//        System.out.println(pekerja1.toString());
//        Manager manajer1 = new Manager(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
//        System.out.println(manajer1.toString());


        Manusia manusia = new Manusia("Putin","31231231232",true,true);
        Manusia manusia1 = new Manusia("Jokowi","312312312332",true,true);
        Manusia manusia2 = new Manusia("Ahok","231231231231",true,false);
        System.out.println("!!!Total Manusia!!!");
        System.out.println(manusia.toString());
        System.out.println(manusia1.toString());
        System.out.println(manusia2.toString());

        Mahasiswa mahasiswa = new Mahasiswa("Budi Tabuti","351923848239",true,false,"205150601111018",3.7);
        Mahasiswa mahasiswa1 = new Mahasiswa("Puan Maharani","23131232133",false,true,"424324212323",3.2);
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi Santoso","3231237237",true,true,"24234234135",2.9);
        System.out.println("Total Mahasiswa!!!");
        System.out.println(mahasiswa.toString());
        System.out.println(mahasiswa1.toString());
        System.out.println(mahasiswa2.toString());

        Pekerja pekerja = new Pekerja(7,23,"4324568872","Dora","6594380280",true,true);
        Pekerja pekerja1 = new Pekerja(9,29,"4328294732","MegaWati","24234234234",false,true);
        Pekerja pekerja2 = new Pekerja(8,24,"97843669879","Luhut","834729347234",true,false);
        System.out.println("Total Pekerja!!!");
        System.out.println(pekerja.toString());
        System.out.println(pekerja1.toString());
        System.out.println(pekerja2.toString());

        Manager manager = new Manager(9,24,"204837283728","Vernalta","23423423052",true,false,1500);
        Manager manager1 = new Manager(8,25,"23874392749","Andy","794723842",true,false,1200);
        Manager manager2 = new Manager(9,21,"423452534234","Martin","4234234234324",false,false,1240);
        System.out.println("Total Manager!!!");
        System.out.println(manager.toString());
        System.out.println(manager1.toString());
        System.out.println(manager2.toString());


    }
}
