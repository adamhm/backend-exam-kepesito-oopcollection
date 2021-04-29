package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private final boolean armored;
    private final int damage;
    private int hitPoints;
    
    public MilitaryUnit(boolean armored, int hitPoints, int damage) {
        this.armored = armored;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }
    
    public boolean isArmored() {
        return armored;
    }
    
    public int getHitPoints() {
        return hitPoints;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public void applyDamage(int damage) {
        hitPoints -= isArmored() ? damage / 2 : damage;
    }
    
    public abstract int doDamage();
    
    public abstract void sufferDamage(int damage);
}
