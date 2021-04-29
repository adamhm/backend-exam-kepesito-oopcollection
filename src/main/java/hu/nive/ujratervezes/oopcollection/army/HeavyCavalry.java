package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {
    private final static int HIT_POINTS = 150;
    private final static int DAMAGE = 20;
    
    private boolean firstAttack = true;
    
    public HeavyCavalry() {
        super(true, HIT_POINTS, DAMAGE);
    }
    
    @Override
    public int doDamage() {
        if (firstAttack) {
            firstAttack = false;
            
            return getDamage() * 3;
        }
        
        return getDamage();
    }
    
    @Override
    public void sufferDamage(int damage) {
        applyDamage(damage);
    }
}
