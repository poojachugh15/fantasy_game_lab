package healTests;

import heals.Heal;
import heals.HealType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealTest {
    private Heal heal1;
    private Heal heal2;

    @Before
    public void setUp(){
        heal1 = new Heal(HealType.HERBS);
        heal2 = new Heal(HealType.POTION);
    }

    @Test
    public void canHaveHealType() {
        assertEquals(HealType.HERBS, heal1.getHealType());
        assertEquals(HealType.POTION, heal2.getHealType());
    }

    @Test
    public void canHaveAdditionalHealthPoints() {
        assertEquals(40, heal2.getHealType().getAdditionalHealthPoints());
        assertEquals(35, heal1.getHealType().getAdditionalHealthPoints());
    }
}
