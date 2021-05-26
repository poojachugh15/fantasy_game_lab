package weapons;

public enum WeaponType {
    SWORD(20),
    BOW(25),
    AXE(15);

    private final int damageRate;

    WeaponType(int damageRate) {
        this.damageRate = damageRate;
    }

    public int getDamageRate() {
        return damageRate;
    }
}
