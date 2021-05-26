package enemies;

import behaviours.IDamage;
import weapons.Weapon;

public abstract class Enemy implements IDamage {

    private int healthPoints;
    private Weapon weapon;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(Weapon weapon) {
        this.healthPoints -= weapon.getWeaponType().getDamageRate();
    }

}
