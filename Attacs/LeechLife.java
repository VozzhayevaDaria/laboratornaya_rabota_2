package Attacs;

import ru.ifmo.se.pokemon.*;

public class LeechLife extends PhysicalMove{
    public LeechLife(){
        super(Type.BUG, 80.0, 1.0);
    }

    public void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, (int) (calcBaseDamage(pokemon, pokemon) * (-0.5)));
    }

    protected String describe() {
        return "использует Attacs.LeechLife";
    }
}
