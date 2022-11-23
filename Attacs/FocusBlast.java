package Attacs;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {

    public FocusBlast(){
        super(Type.FIGHTING, 120.0, 0.7);
    }
    public void applyOppEffects(Pokemon pokemon) {

        if (Math.random() <= 0.1) pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
    protected String describe() {

        return "использует Focus Blast";
    }
}
