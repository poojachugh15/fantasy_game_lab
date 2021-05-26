package weaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Weapon;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    private Weapon weapon1;
    private Weapon weapon2;
    private Weapon weapon3;


    @Before
    public void setUp(){
        weapon1 = new Weapon(WeaponType.AXE);
        weapon2 = new Weapon(WeaponType.BOW);
        weapon3 = new Weapon(WeaponType.SWORD);

    }

    @Test
    public void hasDamageRate() {
        assertEquals(20, weapon3.getWeaponType().getDamageRate());
        assertEquals(15, weapon1.getWeaponType().getDamageRate());
        assertEquals(25, weapon2.getWeaponType().getDamageRate());
    }

    @Test
    public void canHaveWeaponType() {
        assertEquals(WeaponType.AXE, weapon1.getWeaponType());
        assertEquals(WeaponType.BOW, weapon2.getWeaponType());
        assertEquals(WeaponType.SWORD, weapon3.getWeaponType());
    }
}
