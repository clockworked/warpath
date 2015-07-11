import java.util.Random;
import jwbgl.*;
/* A basic enemy unit for testing! */

public class EnemySwordGuy extends HumanUnit {
  private int minDamage, maxDamage;
  private static String[] activities = {"walking", "standing", "attacking", "stunned_short", "falling"};
  public EnemySwordGuy(RPG game, String name, Posn posn, Player player) {
    super(game, name, activities, posn, player);
    currentHP = maxHP = 100;
    minDamage = 5;
    maxDamage = 10;
  }

  public void nextActivity() {
    super.nextActivity();
    if (currentActivity.equals("standing")) {
      for (Unit u: game.getUnits()) {
        if (isHostile(u)) {
          if (nextTargetUnit == null || game.distance2(this,u) < game.distance2(this,nextTargetUnit)) {
            nextTargetUnit = u;
            setNextActivity("attacking");
          }
        }
      }
      if (nextTargetUnit != null) {
        super.nextActivity();
      }
    }
  }
}
