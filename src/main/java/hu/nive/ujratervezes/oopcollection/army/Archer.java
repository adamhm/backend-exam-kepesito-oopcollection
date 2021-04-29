package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {
    private final static int HIT_POINTS = 50;
    private final static int DAMAGE = 20;
    
    public Archer() {
        super(false, HIT_POINTS, DAMAGE);
    }
    
    @Override
    public int doDamage() {
        return getDamage();
    }
    
    @Override
    public void sufferDamage(int damage) {
        applyDamage(damage);
    }
}
