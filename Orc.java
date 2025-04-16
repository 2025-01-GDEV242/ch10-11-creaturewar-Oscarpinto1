/**
 * The orc class * 
 * 
 * @author Oscar Pinto
 * @version 2025-04 v1.1
 */

public class Orc extends Creature {

    public Orc() {
        super(
            25 + Randomizer.nextInt(26),   // 25 to 50
            40 + Randomizer.nextInt(61)    // 40 to 100
        );
    }

    @Override
    public void takeDamage(int damage) {
        // 20% chance to reduce incoming damage by half
        if (Randomizer.nextInt(100) < 20) {
            damage = damage / 2;
        }
        super.takeDamage(damage);
    }
}
