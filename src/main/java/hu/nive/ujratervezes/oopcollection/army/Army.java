package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<MilitaryUnit> militaryUnits = new ArrayList<>();
    
    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }
    
    public void damageAll(int damage) {
        militaryUnits.forEach(militaryUnit -> militaryUnit.sufferDamage(damage));
        militaryUnits.removeIf(militaryUnit -> militaryUnit.getHitPoints() < 25);
    }
    
    public int getArmyDamage() {
        return militaryUnits.stream()
            .mapToInt(MilitaryUnit::doDamage)
            .sum();
    }
    
    public int getArmySize() {
        return militaryUnits.size();
    }
}
