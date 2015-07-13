import java.util.HashMap;

/* This class defines the basic set of animations that are used by basically
 * everything in the game.
 */
public class AnimationTemplates {
  public static final String[] STANDING = {
    "standing_1", "standing_1",
    "standing_1", "standing_1"
  };
  
  /* 8 frames */
  public static final String[] STUNNED_SHORT = {
    "standing_1", "standing_1",
    "standing_1", "standing_1",
    "standing_1", "standing_1",
    "standing_1", "standing_1"
  };
  
  /* 16 frames */
  public static final String[] STUNNED_LONG = {
    "standing_1", "standing_1",
    "standing_1", "standing_1",
    "standing_1", "standing_1",
    "standing_1", "standing_1",
    "standing_1", "standing_1",
    "standing_1", "standing_1",
    "standing_1", "standing_1",
    "standing_1", "standing_1"
  };
  
  public static final String[] WALKING = {
    "walking_1", "walking_1",
    "walking_2","walking_2"
  };
  
  public static final String[] ATTACKING = {
    "attacking_1", "attacking_1",
    "attacking_2", "attacking_2",
    "attacking_2", "attacking_2",
    "attacking_1", "attacking_1",
  };
  
  public static final String[] BLOCKING_1 = {
    "attacking_1", "attacking_1"
  };
  
  public static final String[] BLOCKING_2 = {
    "attacking_2b", "attacking_2b"
  };
  
  public static final String[] BLOCKING_3 = {
    "attacking_1", "attacking_1"
  };
  
  public static final String[] BASHING = {
    "attacking_1", "attacking_1",
    "attacking_2b", "attacking_2b",
    "attacking_2b", "attacking_2b",
    "attacking_1", "attacking_1",
    "standing_1", "standing_1"
  };
  
  public static final String[] SLASHING_1 = {
    "attacking_1", "attacking_1",
  };
  
  public static final String[] SLASHING_2 = {
    "attacking_2", "attacking_2",
    "attacking_2", "attacking_2"
  };
  
  public static final String[] SLASHING_3 = {
    "attacking_1", "attacking_1",
    "standing_1", "standing_1"
  };
  
  public static final String[] FALLING = {
    "falling_1", "falling_1",
    "falling_2", "falling_2",
    "falling_3", "falling_3",
    "falling_4", "falling_4"
  };
  
  public static final String[] ZOMBIE_FALLING = {
    "falling_1", "falling_1",
    "falling_2", "falling_2",
    "falling_3", "falling_3"
  };
  
  public static String[] getTemplate(String activity) {
    if (activity.equals("standing")) {
      return STANDING;
    } else if (activity.equals("walking")) {
      return WALKING;
    } else if (activity.equals("attacking")) {
      return ATTACKING;
    } else if (activity.equals("stunned_short")) {
      return STUNNED_SHORT;
    } else if (activity.equals("stunned_long")) {
      return STUNNED_LONG;
    } else if (activity.equals("bashing")) {
      return BASHING;
    } else if (activity.equals("blocking_1")) {
      return BLOCKING_1;
    } else if (activity.equals("blocking_2")) {
      return BLOCKING_2;
    } else if (activity.equals("blocking_3")) {
      return BLOCKING_3;
    } else if (activity.equals("slashing_1")) {
      return BLOCKING_1;
    } else if (activity.equals("slashing_2")) {
      return BLOCKING_2;
    } else if (activity.equals("slashing_3")) {
      return BLOCKING_3;
    } else if (activity.equals("falling")) {
      return FALLING;
    } else {
      return null;
    }
  }
}
