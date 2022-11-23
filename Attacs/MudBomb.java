package Attacs;

import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {

    public MudBomb(){
        super(Type.GROUND, 65.0, 0.8);
    }
    public void applyOppEffects(Pokemon pokemon) {

        if (Math.random() <= 0.3) pokemon.setMod(Stat.ACCURACY, -1);
    }
    protected String describe() {

        return "использует Mud Bomb";
    }
}
