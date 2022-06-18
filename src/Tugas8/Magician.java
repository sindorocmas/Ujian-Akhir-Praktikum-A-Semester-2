package ExeptionHandling;

public class Magician extends Character {

    public Magician() {
        super(10, 60, 100);
    }

    @Override
    public boolean attack() {
        boolean serang;
        int randomSerang = (int) Math.floor(Math.random()*101);

        if (randomSerang<=35){
            serang = true;
        }else {
            serang = false;
        }
        return serang;
    }

//    public int penghitung(boolean serang){
//        if (serang == true){
//            setAttack(super.getAttack());
//        }else {
//            setAttack(0);
//        }
//        return super.getAttack();
//    }

}
