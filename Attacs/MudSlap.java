package Attacs;

import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove {
    public MudSlap(){
        super(Type.GROUND, 20.0, 1.0);
    }
    public void applyOppEffects(Pokemon pokemon) {

        pokemon.setMod(Stat.ACCURACY, -1);
    }
    protected String describe() {

        return "использует Mud-Slap";
    }
}
