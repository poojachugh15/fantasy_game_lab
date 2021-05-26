package spells;

import behaviours.ISpell;

public class Spell implements ISpell {

    private SpellType spellType;

    public Spell(SpellType spellType) {
        this.spellType = spellType;
    }

    public void cast() {

    }

    public SpellType getSpellType() {
        return spellType;
    }
}
