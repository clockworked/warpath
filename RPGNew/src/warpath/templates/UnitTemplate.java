package warpath.templates;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Used by the character creator (especially its save/load functionality).
 * Contains the information needed to make a sprite: animation name and
 * palette swaps.
 */
public class UnitTemplate extends SpriteTemplate implements Serializable {
  private static final long serialVersionUID = 2L;
  private final HashMap<String, AccessoryTemplate> equipment;
  
  public UnitTemplate(String animName, ArrayList<String> colorList, HashMap<String, Color> colorMap, HashMap<Color, Color> paletteSwaps) {
    super(animName, colorList, colorMap, paletteSwaps);
    this.equipment = new HashMap<String, AccessoryTemplate>();
  }
  
  /**
   * NB: overwites existing items
   */
  public void addItem(String slot, AccessoryTemplate item) {
    equipment.put(slot, item);
  }

  public void removeItem(String slot) {
    equipment.remove(slot);
  }
  
  public AccessoryTemplate getItem(String slot) {
    return equipment.get(slot);
  }

  public HashMap<String, AccessoryTemplate> getEquipment() {
    return equipment;
  }
  
}