package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {
    private boolean firstAttack = true;
    
    public HeavyCavalry() {
        super(true, 150, 20);
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
        setDamage(damage);
    }
}
