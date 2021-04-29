package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    private static final int HIT_POINTS = 100;
    private static final int DAMAGE = 10;
    
    private boolean firstAttack = true;
    
    public Swordsman(boolean armored) {
        super(armored, HIT_POINTS, DAMAGE);
    }
    
    @Override
    public int doDamage() {
        return getDamage();
    }
    
    @Override
    public void sufferDamage(int damage) {
        if (!firstAttack) {
            applyDamage(damage);
        }
        
        firstAttack = false;
    }
}
