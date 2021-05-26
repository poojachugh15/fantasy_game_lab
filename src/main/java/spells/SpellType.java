package spells;

public enum SpellType {
    INFERNO(10),
    WATERFALL(12),
    ICESTROKE(18);


    private final int damageRate;

    SpellType(int damageRate) {
        this.damageRate = damageRate;
    }

    public int getDamageRate() {
        return damageRate;
    }
}
