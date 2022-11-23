package Attacs;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST, 80.0, 1.0);
    }
    public void applyOppEffects(Pokemon pokemon) {

        if (Math.random() <= 0.2) pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
    protected String describe() {

        return "использует Shadow Ball";
    }
}
