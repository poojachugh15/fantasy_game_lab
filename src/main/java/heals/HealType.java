package heals;

public enum HealType {

    POTION(40),
    HERBS(35);

    private final int additionalHealthPoints;

    HealType(int additionalHealthPoints) {
        this.additionalHealthPoints = additionalHealthPoints;
    }

    public int getAdditionalHealthPoints() {
        return additionalHealthPoints;
    }
}
