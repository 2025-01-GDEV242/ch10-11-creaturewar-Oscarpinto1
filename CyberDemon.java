/**
 * The cyberDemon class * 
 * 
 * @author Oscar Pinto
 * @version 2025-04 v1.1
 */
public class CyberDemon extends Demon {

    public CyberDemon() {
        super(
            20 + Randomizer.nextInt(21),   // 20 to 40 → 21 steps
            25 + Randomizer.nextInt(76)    // 25 to 100 → 76 steps
        );
    }
}
