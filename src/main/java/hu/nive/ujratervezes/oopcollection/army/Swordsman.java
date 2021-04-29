package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    private boolean firstAttack = true;
    
    public Swordsman(boolean armored) {
        super(armored, 100, 10);
    }
    
    @Override
    public int doDamage() {
        return getDamage();
    }
    
    @Override
    public void sufferDamage(int damage) {
        if (!firstAttack) {
            setDamage(damage);
        }
        
        firstAttack = false;
    }
}
