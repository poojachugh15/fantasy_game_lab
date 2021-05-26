package weapons;

import behaviours.IWeapon;

public class Weapon implements IWeapon {

    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void attack() {

    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
