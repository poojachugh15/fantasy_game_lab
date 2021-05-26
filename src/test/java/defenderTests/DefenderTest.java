package defenderTests;

import defenders.DefendType;
import defenders.Defender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefenderTest {

    private Defender defender1;
    private Defender defender2;


    @Before
    public void setUp(){
        defender1 = new Defender(DefendType.OGRE);
        defender2 = new Defender(DefendType.DRAGON);
    }

    @Test
    public void hasDefenderType() {
        assertEquals(DefendType.OGRE, defender1.getDefendType());
        assertEquals(DefendType.DRAGON, defender2.getDefendType());
    }

    @Test
    public void hasReducedDamageRate() {
        assertEquals(10, defender2.getDefendType().getReducedDamageRate());
        assertEquals(5, defender1.getDefendType().getReducedDamageRate());
    }
}
