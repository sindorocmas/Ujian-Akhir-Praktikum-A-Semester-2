package ExeptionHandling;

public class Warrior extends Character{

    public Warrior(){
        super(30,25,80);
    }

    @Override
    public boolean attack() {
        boolean serang;
        int randomSerang = (int) Math.floor(Math.random()*101);

        if (randomSerang<=60){
            serang = true;
        }else {
            serang = false;
        }
        return serang;
    }

}
