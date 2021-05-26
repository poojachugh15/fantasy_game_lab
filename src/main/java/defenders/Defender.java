package defenders;

import behaviours.IDefend;

public class Defender  implements IDefend {

    private DefendType defendType;

    public Defender(DefendType defendType) {
        this.defendType = defendType;
    }

    public DefendType getDefendType() {
        return defendType;
    }


    public void defend() {

    }
}
