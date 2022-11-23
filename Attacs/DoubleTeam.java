package Attacs;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0.0, 1.0);
    }

    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, 1);
    }

    protected String describe() {
        return "использует Attacs.DoubleTeam";
    }


}
