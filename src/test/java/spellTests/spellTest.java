package spellTests;

import org.junit.Before;
import org.junit.Test;
import spells.Spell;
import spells.SpellType;

import static org.junit.Assert.assertEquals;

public class spellTest {
    private Spell spell1;
    private Spell spell2;
    private Spell spell3;

    @Before
    public void setUp(){
        spell1 = new Spell(SpellType.ICESTROKE);
        spell2 = new Spell(SpellType.INFERNO);
        spell3 = new Spell(SpellType.WATERFALL);
    }

    @Test
    public void canHaveSpellType() {
        assertEquals(SpellType.ICESTROKE, spell1.getSpellType());
        assertEquals(SpellType.INFERNO, spell2.getSpellType());
        assertEquals(SpellType.WATERFALL, spell3.getSpellType());
    }

    @Test
    public void hasDamageRate() {
        assertEquals(12, spell3.getSpellType().getDamageRate() );
        assertEquals(10, spell2.getSpellType().getDamageRate() );
        assertEquals(18, spell1.getSpellType().getDamageRate() );

    }
}
