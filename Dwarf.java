/**
 * The dwarf class * 
 * 
 * @author Oscar Pinto
 * @version 2025-04 v1.1
 */public class Dwarf extends Creature {

    public Dwarf() {
        super(
            15 + Randomizer.nextInt(16),   // 15 to 30
            30 + Randomizer.nextInt(51)    // 30 to 80
        );
    }

    @Override
    public int attack() {
        int baseDamage = super.attack();
        if (Randomizer.nextInt(100) < 15) { // 15% crit chance
            return baseDamage * 3;
        }
        return baseDamage;
    }
}
