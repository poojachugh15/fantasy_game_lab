package enemiesTest;

import enemies.Enemy;
import enemies.Orc;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import weapons.Weapon;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Enemy enemy1;
    private Enemy enemy2;
    private Weapon weapon1;
    private Weapon weapon2;

    @Before
    public void setUp()  {
        enemy1 = new Orc(100);
        enemy2 = new Troll(80);
        weapon1 = new Weapon(WeaponType.SWORD);
        weapon2 = new Weapon(WeaponType.AXE);


    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, enemy1.getHealthPoints());
        assertEquals(80, enemy2.getHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        assertEquals(80, enemy1.takeDamage(weapon1);
        assertEquals(65, enemy2.takeDamage(weapon2);

    }


}
