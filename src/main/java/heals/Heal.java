package heals;

import behaviours.IHeal;

public class Heal implements IHeal {

    private HealType healType;

    public Heal(HealType healType) {
        this.healType = healType;
    }

    public HealType getHealType() {
        return healType;
    }

    public void heal() {

    }
}
