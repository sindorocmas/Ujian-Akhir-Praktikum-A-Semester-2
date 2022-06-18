package ExeptionHandling;

public abstract class Character {
    private int defense;
    private int attack;
    private int HP;
    private String name;

    public Character(int defense,int attack,int HP){
        this.defense=defense;
        this.attack=getAttack();
        this.HP=HP;
    }

    public boolean attack(){
        //belum membuat kesempatan

        return false;
    }

    public void receiveDamage(int damage){
        int defencePower = getDefense();
        int deltaDamage;

        if (attack>defencePower){
            deltaDamage = damage-defencePower;
        }else {
            deltaDamage = 0;
        }
        System.out.println(deltaDamage);

    }

    public void info(){
        System.out.println("name = " + getName());
        System.out.println("attack = " + getAttack());
        System.out.println("defense = " + getDefense());
    }

    //getter and setter

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
