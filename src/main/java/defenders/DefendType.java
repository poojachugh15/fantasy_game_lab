package defenders;

public enum DefendType {
    DRAGON(10),
    OGRE(5);

    private final int reducedDamageRate;

    DefendType(int reducedDamageRate) {
        this.reducedDamageRate = reducedDamageRate;
    }

    public int getReducedDamageRate() {
        return reducedDamageRate;
    }
}
