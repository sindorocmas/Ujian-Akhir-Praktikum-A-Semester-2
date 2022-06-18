package ExeptionHandling;

public class Healer extends Character{

    public Healer(){
        super(10,10,10);
    }

    @Override
    public boolean attack() {
        boolean serang;
        int randomSerang = (int) Math.floor(Math.random()*101);

        if (randomSerang<=85){
            serang = true;
        }else {
            serang = false;
        }
        return serang;
    }
}
