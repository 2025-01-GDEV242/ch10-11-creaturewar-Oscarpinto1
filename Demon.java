/**
 * The demon class * 
 * 
 * @author Oscar Pinto
 * @version 2025-04 v1.1
 */public abstract class Demon extends Creature {

    public Demon(int strength, int hitpoints) {
        super(strength, hitpoints);
    }

    @Override
    public int attack() {
        int baseDamage = super.attack();
        if (Randomizer.nextInt(100) < 5) { // 5% chance
            return baseDamage + 50;
        }
        return baseDamage;
    }
}
