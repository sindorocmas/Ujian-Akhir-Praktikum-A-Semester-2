package ExeptionHandling;

public class Titan extends Character{

    public Titan(){
        super(0,45,200);
    }

    @Override
    public boolean attack() {
        boolean serang;
        int randomSerang = (int) Math.floor(Math.random()*101);

        if (randomSerang<=40){
            serang = true;
        }else {
            serang = false;
        }
        return serang;
    }
}
