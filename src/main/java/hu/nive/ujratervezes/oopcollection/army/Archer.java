package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {
    public Archer() {
        super(false, 50, 20);
    }
    
    @Override
    public int doDamage() {
        return getDamage();
    }
    
    @Override
    public void sufferDamage(int damage) {
        setDamage(damage);
    }
}
